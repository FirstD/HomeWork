package com.ParkMIS.DAO;

import java.util.List;

import com.ParkMIS.entity.Manage;
import com.ParkMIS.entity.Vip;

public interface ManageDAO {
	public boolean add(Manage manage);
	public boolean delete(Manage manage);
	public boolean update(Manage manage1,Manage manage2);
	public List<Manage> hy(int vid)throws Exception;
	public Manage getLastByVip(Vip vip);
	public Manage getMangeByOid(int i);
}
