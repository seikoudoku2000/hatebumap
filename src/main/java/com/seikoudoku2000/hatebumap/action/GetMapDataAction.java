package com.seikoudoku2000.hatebumap.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.seikoudoku2000.hatebumap.entity.Mapdata;
import com.seikoudoku2000.hatebumap.form.GetMapDataForm;
import com.seikoudoku2000.hatebumap.service.GetMapDataService;

/**
 * データ取得用のアクションクラス
 * @author tomitayousuke
 *
 */
public class GetMapDataAction {
	
	@ActionForm
	@Resource
	GetMapDataForm getMapDataForm;
	
	@Resource
	GetMapDataService getMapDataService;
	
	public List<Mapdata> dataList;
	
	@Execute(validator = false)
	public String index() {
		dataList = getMapDataService.findLimited(
				getMapDataForm.level, 
				getMapDataForm.minX, 
				getMapDataForm.minY, 
				getMapDataForm.maxX, 
				getMapDataForm.maxY,
				getMapDataForm.hexLimit);
        return "mapdata.jsp";
	}

}
