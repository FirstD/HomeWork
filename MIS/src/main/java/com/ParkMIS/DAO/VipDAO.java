package com.ParkMIS.DAO;

import java.util.List;

import com.ParkMIS.entity.Vip;

public interface VipDAO {
	public boolean add(Vip vip);
	public boolean delete(Vip vip);
	public boolean update(Vip vip,Vip vip1);
	public boolean update(Vip vip);
	public Vip getVip(Vip vip);
	public List<Vip> getAll();
	public List<Vip> yj();
	public Vip getVipById(int id);
}
