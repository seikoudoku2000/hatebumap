package com.seikoudoku2000.hatebumap.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.seasar.extension.jdbc.AutoSelect;
import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.extension.jdbc.where.SimpleWhere;

import com.seikoudoku2000.hatebumap.entity.Mapdata;


/**
 * Mapdataの取得を司るクラス
 * @author tomitayousuke
 *
 */
public class GetMapDataService extends S2AbstractService<Mapdata>{
	
	
	/**
	 * 指定条件でMapdataを検索する。
	 * @param level Hexのレベル
	 * @param minX X座標の最小値(検索フィールドはレベルに応じる。)
	 * @param minY Y座標の最小値
	 * @param maxX X座標の最大値
	 * @param maxY Y座標の最大値
	 * @param limitEachHex 各Hex毎のデータ上限数。各hex毎に指定件数分だけブックマーク数の上位が取得される。
	 * @return
	 */
	public List<Mapdata> findLimited(int level , int minX, int minY, int maxX, int maxY, int limitEachHex){
		List<Mapdata> mapdataList = find(level, minX, minY, maxX, maxY);
		Iterator<Mapdata> ite = mapdataList.iterator();
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		while(ite.hasNext()) {
			Mapdata data = ite.next();
			String keyStr = getKeyStr(data, level);
			if(countMap.containsKey(keyStr)) {
				if(countMap.get(keyStr).intValue() >= limitEachHex) {
					ite.remove();
				}
				countMap.put(keyStr, (countMap.get(keyStr) + 1)); 
			} else {
				countMap.put(keyStr, 1);
			}
		}
		
		return mapdataList;
	}
	
	
	private String getKeyStr(Mapdata data, int level) {
		switch(level) {
			case 9:
				return Integer.toString(data.getX9()) + Integer.toString(data.getY9());
			case 10:
				return Integer.toString(data.getX10()) + Integer.toString(data.getY10());
			case 11:
				return Integer.toString(data.getX11()) + Integer.toString(data.getY11());
			case 12:
				return Integer.toString(data.getX12()) + Integer.toString(data.getY12());
			case 13:
				return Integer.toString(data.getX13()) + Integer.toString(data.getY13());
			case 14:
				return Integer.toString(data.getX14()) + Integer.toString(data.getY14());
			default:
				//適当。。
				return "";
		}
	}
	
	
	/**
	 * 指定条件でMapdataを検索する。
	 * ブックマーク数の降順でデータ取得。
	 * @param level　Hexのレベル
	 * @param minX X座標の最小値(検索フィールドはレベルに応じる。)
	 * @param minY Y座標の最小値
	 * @param maxX X座標の最大値
	 * @param maxY Y座標の最大値
	 * @return List<Mapdata>
	 */
	public List<Mapdata> find(int level , int minX, int minY, int maxX, int maxY){
		
		AutoSelect<Mapdata> autoSelect = jdbcManager.from(Mapdata.class);
		String levelStr = Integer.toString(level);
		String xField = "x" + levelStr;
		String yField = "y" + levelStr;
		SimpleWhere simpleWhere 
			= new SimpleWhere()
				.ge(xField, minX).le(xField, maxX)
				.ge(yField, minY).le(yField, maxY)
				;
		autoSelect.where(simpleWhere);
		autoSelect.orderBy("hatebu_num desc");
		List<Mapdata> list = null;
		try {
			list = autoSelect.getResultList();
		} catch(Exception e) {
			e.printStackTrace();
			list = new ArrayList<Mapdata>();
		}
		
		return list;
	}
	
	
	
}
