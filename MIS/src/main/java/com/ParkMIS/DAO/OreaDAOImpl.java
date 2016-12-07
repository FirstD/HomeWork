package com.ParkMIS.DAO;

import com.ParkMIS.Util.DbUtil;
import com.ParkMIS.entity.Orea;

public class OreaDAOImpl implements OreaDAO {

	@Override
	public boolean add(Orea orea) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into orea values(?,?,?,?)",
				new Object[]{orea.getOid(),orea.getPid(),orea.getsNumber(),orea.getState()});
	}

	@Override
	public boolean delete(Orea orea) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("delete from orea where oid=?",
				new Object[]{orea.getOid()});
	}

	@Override
	public boolean update(Orea orea, Orea orea1) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update orea set pid=?,sNumber=?,state=? where oid=?",
				new Object[]{orea.getPid(),orea.getsNumber(),orea.getState(),orea1.getOid()});
	}
	
}
