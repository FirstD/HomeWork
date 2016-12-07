package com.ParkMIS.DAO;

import com.ParkMIS.Util.DbUtil;
import com.ParkMIS.entity.Vip;

public class VipDAOImpl implements VipDAO {

	@Override
	public boolean add(Vip vip) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into vip values(?,?,?,?,?,?,?)",
				new Object[]{vip.getVid(),vip.getIdentity(),vip.getCost(),vip.getStartDate()
						,vip.getEndDate(),vip.getPhone(),vip.getState()});
	}

	@Override
	public boolean delete(Vip vip) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("delete from vip where vid=?",
				new Object[]{vip.getVid()});
	}

	@Override
	public boolean update(Vip vip, Vip vip1) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update vip set identity=?,cost=?,startDate=?,"
				+ "endDate=?,phone=?,State=?  where vid=?",
				new Object[]{vip.getIdentity(),vip.getCost(),vip.getStartDate()
						,vip.getEndDate(),vip.getPhone(),vip.getState(),vip1.getVid()});
	}

}
