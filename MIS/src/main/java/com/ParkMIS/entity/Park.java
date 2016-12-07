package com.ParkMIS.entity;

public class Park {
	private int pid;
	private int oid;
    private int ch;
	private String state;
	private String name;
	private int MaxSite;
	private String place;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getState() {
		return state;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public void setState(String state) {
		this.state = state;
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
	
	
}
