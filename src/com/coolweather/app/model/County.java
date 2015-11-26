package com.coolweather.app.model;

public class County {
	private int id;
	private String countyName;
	private String countyCode;
	private int cityId;
	
	public int getId(){
		return id;
	}
	
	public void setId(){
		this.id=id;
	}
	
	public String getcountyName(){
		return countyName;
	}
	
	public void setcountyName(String countyName){
		this.countyName=countyName;
	}
	
	public String getcountyCode(){
		return countyCode;
	}
	
	public void setcountyCode(String countyCode){
		this.countyCode=countyCode;
	}
	
	public int getProvinceId(){
		return cityId;
	}
	
	public void setCityId(){
		this.cityId=cityId;
	}

}
