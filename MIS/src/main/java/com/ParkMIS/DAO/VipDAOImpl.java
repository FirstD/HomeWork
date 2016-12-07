package com.ParkMIS.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ParkMIS.Util.DbUtil;
import com.ParkMIS.entity.Vip;

public class VipDAOImpl implements VipDAO {

	@Override
	public boolean add(Vip vip) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into vip values(?,?,?,?,?,?,?,?,?,?)",
				new Object[]{vip.getVid(),vip.getIdentity(),vip.getName(),vip.getPassword(),vip.getCost(),vip.getStartDate()
						,vip.getEndDate(),vip.getPhone(),vip.getState(),vip.getEmail()});
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
		return DbUtil.executeUpdate("update vip set identity=?,name=?,password=?,cost=?,startDate=?,"
				+ "endDate=?,phone=?,State=?,email=? where vid=?",
				new Object[]{vip.getIdentity(),vip.getName(),vip.getPassword(),vip.getCost(),vip.getStartDate()
						,vip.getEndDate(),vip.getPhone(),vip.getState(),vip.getEmail(),vip1.getVid()});
	}

	@Override
	public Vip getVip(Vip vip) {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from vip where name=?", new Object[]{vip.getName()});
		try{
			while(rs.next()){
				vip.setVid(rs.getInt(1));
				vip.setIdentity(rs.getString(2));
				vip.setName(rs.getString(3));
				vip.setPassword(rs.getString(4));
				vip.setCost(rs.getInt(5));
				vip.setStartDate(rs.getDate(6));
				vip.setEndDate(rs.getDate(7));
				vip.setPhone(rs.getString(8));
				vip.setState(rs.getString(9));
				vip.setEmail(rs.getString(10));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return vip;
	}

}
