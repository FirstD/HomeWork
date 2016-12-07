package com.ParkMIS.entity;

public class Admin {
	private int aid;
	private String name;
	private String password;
	private int pid;
	private String power;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public Admin(String name, String password, int pid,String power) {
		super();
		this.name = name;
		this.password = password;
		this.pid = pid;
		this.power=power;
	}
	public Admin() {
		super();
	}
	
}
