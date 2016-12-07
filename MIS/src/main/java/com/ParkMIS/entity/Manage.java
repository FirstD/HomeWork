package com.ParkMIS.entity;

import java.util.Date;

public class Manage {
	private int mid;
	private int aid;
	private int oid;
	private int vid;
	private Date appTime;
	private String apTime;
	
	public String getApTime() {
		return apTime;
	}
	public void setApTime(String apTime) {
		this.apTime = apTime;
	}
	private Date startTime;
	private Date endTime;
	private String YN;
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
	public Date getAppTime() {
		return appTime;
	}
	public void setAppTime(Date appTime) {
		this.appTime = appTime;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getYN() {
		return YN;
	}
	public void setYN(String yN) {
		YN = yN;
	}
	public Manage(int mid, int aid, int oid, int vid, Date appTime, Date startTime, Date endTime, String yN) {
		super();
		this.mid = mid;
		this.aid = aid;
		this.oid = oid;
		this.vid = vid;
		this.appTime = appTime;
		this.startTime = startTime;
		this.endTime = endTime;
		YN = yN;
	}
	public Manage() {
		super();
	}
	
}
