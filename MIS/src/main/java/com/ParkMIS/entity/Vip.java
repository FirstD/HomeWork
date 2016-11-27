package com.ParkMIS.entity;

import java.util.Date;

public class Vip {
	private int vid;
	private String identity;
	private double cost;
	private Date startDate;
	private Date endDate;
	private int  phone;
	private String state;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Vip(int vid, String identity, double cost, Date startDate, Date endDate, int phone, String state) {
		super();
		this.vid = vid;
		this.identity = identity;
		this.cost = cost;
		this.startDate = startDate;
		this.endDate = endDate;
		this.phone = phone;
		this.state = state;
	}
	public Vip() {
		super();
	}
	
}
