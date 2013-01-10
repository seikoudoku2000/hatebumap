package com.seikoudoku2000.hatebumap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Mapdata {
	
	@Column(name = "spot_name")
	private String spotName;
	private Integer x9;
	private Integer y9;
	private Integer x10;
	private Integer y10;
	private Integer x11;
	private Integer y11;
	private Integer x12;
	private Integer y12;
	private Integer x13;
	private Integer y13;
	private Integer x14;
	private Integer y14;
	private Double lat;
	private Double lon;
	@Column(name = "hatebu_url")
	private String hatebuUrl;
	@Column(name = "hatebu_num")
	private Integer hatebuNum;
	@Column(name = "hatebu_title")
	private String hatebuTitle;

	public String getSpotName() {
		return spotName;
	}

	public void setSpotName(String spotname) {
		this.spotName = spotname;
	}

	public Integer getX9() {
		return x9;
	}

	public void setX9(Integer x9) {
		this.x9 = x9;
	}

	public Integer getY9() {
		return y9;
	}

	public void setY9(Integer y9) {
		this.y9 = y9;
	}

	public Integer getX10() {
		return x10;
	}

	public void setX10(Integer x10) {
		this.x10 = x10;
	}

	public Integer getY10() {
		return y10;
	}

	public void setY10(Integer y10) {
		this.y10 = y10;
	}

	public Integer getX11() {
		return x11;
	}

	public void setX11(Integer x11) {
		this.x11 = x11;
	}

	public Integer getY11() {
		return y11;
	}

	public void setY11(Integer y11) {
		this.y11 = y11;
	}

	public Integer getX12() {
		return x12;
	}

	public void setX12(Integer x12) {
		this.x12 = x12;
	}

	public Integer getY12() {
		return y12;
	}

	public void setY12(Integer y12) {
		this.y12 = y12;
	}

	public Integer getX13() {
		return x13;
	}

	public void setX13(Integer x13) {
		this.x13 = x13;
	}

	public Integer getY13() {
		return y13;
	}

	public void setY13(Integer y13) {
		this.y13 = y13;
	}

	public Integer getX14() {
		return x14;
	}

	public void setX14(Integer x14) {
		this.x14 = x14;
	}

	public Integer getY14() {
		return y14;
	}

	public void setY14(Integer y14) {
		this.y14 = y14;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public String getHatebuUrl() {
		return hatebuUrl;
	}

	public void setHatebuUrl(String hatebuUrl) {
		this.hatebuUrl = hatebuUrl;
	}

	public Integer getHatebuNum() {
		return hatebuNum;
	}

	public void setHatebuNum(Integer hatebuNum) {
		this.hatebuNum = hatebuNum;
	}

	public String getHatebuTitle() {
		return hatebuTitle;
	}

	public void setHatebuTitle(String spotName) {
		this.hatebuTitle = spotName;
	}

}
