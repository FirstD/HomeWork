package com.ParkMIS.DAO;

import java.util.List;

import com.ParkMIS.entity.Park;


public interface ParkDAO {
	public boolean add(Park park);
	public boolean delete(Park park);
	public boolean update(Park parkN,Park parkO);
	public List<Park> hkc(int pid);
	public List<Park> ykc(int pid);
}
