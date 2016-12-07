package com.ParkMIS.DAO;

import com.ParkMIS.entity.Admin;

public interface AdminDAO {
	public boolean add(Admin admin);
	public boolean delete(Admin admin);
	public boolean update(Admin admin1,Admin admin2);
	public Admin getAdmin(Admin admin);
}
