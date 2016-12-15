package com.ParkMIS.entity;


public class Record {
	private int rid;
	private int mid;
	private long feed;
	private int billNumber;
	private String name;
	private String pname;
	private int ch;
	private String startTime;
	
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	private String eddTime;

	public int getRid() {
		return rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	
	public String getEddTime() {
		return eddTime;
	}
	public void setEddTime(String eddTime) {
		this.eddTime = eddTime;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public long getFeed() {
		return feed;
	}
	public void setFeed(long feed) {
		this.feed = feed;
	}
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	
}
