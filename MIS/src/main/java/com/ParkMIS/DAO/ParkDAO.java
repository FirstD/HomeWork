package com.ParkMIS.DAO;

import com.ParkMIS.entity.Park;

public interface ParkDAO {
	public boolean add(Park park);
	public boolean delete(Park park);
	public boolean update(Park parkN,Park parkO);
}
