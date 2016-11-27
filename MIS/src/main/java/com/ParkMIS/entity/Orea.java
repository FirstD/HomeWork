package com.ParkMIS.entity;

public class Orea {
	private int oid;
	private int pid;
	private int sNumber;
	private String state;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getsNumber() {
		return sNumber;
	}
	public void setsNumber(int sNumber) {
		this.sNumber = sNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Orea(int oid, int pid, int sNumber, String state) {
		super();
		this.oid = oid;
		this.pid = pid;
		this.sNumber = sNumber;
		this.state = state;
	}
	public Orea() {
		super();
	}
	
}
