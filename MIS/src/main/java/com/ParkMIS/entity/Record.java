package com.ParkMIS.entity;

public class Record {
	private int rid;
	private int mid;
	private int feed;
	private int billNumber;
	public int getRid() {
		return rid;
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
	public int getFeed() {
		return feed;
	}
	public void setFeed(int feed) {
		this.feed = feed;
	}
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public Record(int rid, int mid, int feed, int billNumber) {
		super();
		this.rid = rid;
		this.mid = mid;
		this.feed = feed;
		this.billNumber = billNumber;
	}
	public Record() {
		super();
	}
	
}
