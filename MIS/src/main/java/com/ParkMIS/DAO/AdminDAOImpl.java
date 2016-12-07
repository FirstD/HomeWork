package com.ParkMIS.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ParkMIS.Util.DbUtil;
import com.ParkMIS.entity.Admin;

public class AdminDAOImpl implements AdminDAO {

	@Override
	public boolean add(Admin admin) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into admin values(?,?,?,?,?)",
				new Object[]{admin.getAid(),admin.getName(),admin.getPassword(),admin.getPower(),admin.getPid()});
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
		return DbUtil.executeUpdate("update admin set name=?,password=?,pid=?,power=? where sid=?",
				new Object[]{adminN.getName(),adminN.getPassword(),adminN.getPid(),adminN.getPower(),adminO.getAid()});
	}

	@Override
	public Admin getAdmin(Admin admin) {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from admin where name=?", new Object[]{admin.getName()});
		try{
			while(rs.next()){
				admin.setAid(rs.getInt(1));
				admin.setName(rs.getString(2));
				admin.setPassword(rs.getString(3));
				admin.setPid(rs.getInt(4));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return admin;
	}
	

}
