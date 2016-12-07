package com.ParkMIS.DAO;

import com.ParkMIS.Util.DbUtil;
import com.ParkMIS.entity.Manage;

public class ManageDAOImpl implements ManageDAO{

	@Override
	public boolean add(Manage manage) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into manage values(?,?,?,?,?,?,?,?)",
				new Object[]{manage.getMid(),manage.getAid(),manage.getOid(),manage.getMid(),
						manage.getAppTime(),manage.getStartTime(),manage.getEndTime(),manage.getYN()});
	}

	@Override
	public boolean delete(Manage manage) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("delete from manage where mid=?",
				new Object[]{manage.getMid()});
	}

	@Override
	public boolean update(Manage manage1, Manage manage2) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update manage set aid=?,oid=?,mid=?,appTime=?,startTime=?,"
				+ "endTime=?,YN=? where mid=?",
				new Object[]{manage1.getAid(),manage1.getOid(),manage1.getMid(),manage1.getAppTime(),
						manage1.getStartTime(),manage1.getEndTime(),manage1.getYN(),manage2.getMid()});
	}
	
}
