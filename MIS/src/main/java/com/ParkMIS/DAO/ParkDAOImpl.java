package com.ParkMIS.DAO;

import com.ParkMIS.Util.DbUtil;
import com.ParkMIS.entity.Park;

public class ParkDAOImpl implements ParkDAO {

	@Override
	public boolean add(Park park) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into park values(?,?,?,?)",
				new Object[]{park.getPid(),park.getName(),park.getMaxSite(),park.getPlace()});
	}

	@Override
	public boolean delete(Park park) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("delete from park where pid=?",
				new Object[]{park.getPid()});	
	}

	@Override
	public boolean update(Park parkN, Park parkO) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update park set name=?,maxSite=?,place=?where pid=?",
				new Object[]{parkN.getName(),parkN.getMaxSite(),parkN.getPlace(),parkO.getPid()});
	}

	
	
}
