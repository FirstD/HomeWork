package com.ParkMIS.DAO;

import com.ParkMIS.entity.Vip;

public interface VipDAO {
	public boolean add(Vip vip);
	public boolean delete(Vip vip);
	public boolean update(Vip vip,Vip vip1);
	public Vip getVip(Vip vip);
}
