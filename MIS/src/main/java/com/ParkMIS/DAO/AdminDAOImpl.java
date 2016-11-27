package com.ParkMIS.DAO;

import com.ParkMIS.Util.DbUtil;
import com.ParkMIS.entity.Admin;

public class AdminDAOImpl implements AdminDAO {

	@Override
	public boolean add(Admin admin) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into admin values(?,?,?,?)",
				new Object[]{admin.getAid(),admin.getName(),admin.getPassword(),admin.getPid()});
	}

	@Override
	public boolean delete(Admin admin) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("delete from admin where aid=?",
				new Object[]{admin.getAid()});
	}

	@Override
	public boolean update(Admin adminO, Admin adminN) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update admin set name=?,password=?,pid=? where sid=?",
				new Object[]{adminN.getName(),adminN.getPassword(),adminN.getPid(),adminO.getAid()});
	}

}
