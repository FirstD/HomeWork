package com.ParkMIS.entity;

public class Park {
	private int pid;
	private String name;
	private int MaxSite;
	private String place;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxSite() {
		return MaxSite;
	}
	public void setMaxSite(int maxSite) {
		MaxSite = maxSite;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public Park(String name, int maxSite,String place) {
		super();
		this.name = name;
		this.place=place;
		this.MaxSite = maxSite;
	}
	public Park() {
		super();
	}
	
}
