package com.ParkMIS.entity;

public class Park {
	private int pid;
	private String name;
	private int MaxSite;
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
	public Park(String name, int maxSite) {
		super();
		this.name = name;
		MaxSite = maxSite;
	}
	public Park() {
		super();
	}
	
}
