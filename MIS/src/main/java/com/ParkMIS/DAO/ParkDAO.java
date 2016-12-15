package com.ParkMIS.DAO;

import java.util.List;

import com.ParkMIS.entity.Admin;
import com.ParkMIS.entity.Park;
import com.ParkMIS.entity.ParkAdmin;


public interface ParkDAO {
	public boolean add(Park park);
	public boolean delete(Park park);
	public boolean update(Park parkN,Park parkO);
	public boolean update(Park park);
	public boolean addOrea(Park park);
	public List<Park> hkc(String name);
	public List<Park> ykc(String name);
	public List<Park> tcc(String place);
	public Park getPid(String name);
	public List<Park> getAll();
	public List<ParkAdmin> getAllByPlace(String place);
	public List<Park> getOreaByAdmin(Admin admin);
	public List<Park> akc(int pid);
}	
