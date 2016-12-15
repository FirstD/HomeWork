package com.ParkMIS.entity;

import java.util.Date;

public class Manage {
	private int mid;
	private int aid;
	private int oid;
	private int vid;
	private String appTime;
	private String startTime;
	private String endTime;
	private String yesNo;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	
	public String getAppTime() {
		return appTime;
	}
	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public String getYesNo() {
		return yesNo;
	}
	public void setYesNo(String yesNo) {
		this.yesNo = yesNo;
	}
	
	
	public Manage(int oid, int vid, String appTime, String yesNo) {
		super();
		this.oid = oid;
		this.vid = vid;
		this.appTime = appTime;
		this.yesNo = yesNo;
	}
	public Manage() {
		super();
	}
}
