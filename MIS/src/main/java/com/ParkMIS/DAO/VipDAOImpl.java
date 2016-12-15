package com.ParkMIS.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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

	@Override
	public List<Vip> getAll() {
		// TODO Auto-generated method stub
		List<Vip> list=new ArrayList<Vip>();
		ResultSet rs=DbUtil.executeQuery("select * from vip", new Object[]{});
		try{
			while(rs.next()){
				Vip vip=new Vip();
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
				list.add(vip);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Vip> yj() {
		List<Vip> glist=new ArrayList<Vip>();
		String state="激活";
		ResultSet rs=DbUtil.executeQuery("select name,startDate,phone,email from vip where state=?", new Object[]{state});
		try {
			while(rs.next()){
				Vip vip=new Vip();
				vip.setName(rs.getString(1));
				int vtime=rs.getDate(2).getDate();
				vip.setPhone(rs.getString(3));
				vip.setEmail(rs.getString(4));
				int now = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
				int r=vtime-now;
				if(0<=r&r<=4){
					vip.setLeave(r);
					
				glist.add(vip);	
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
	}

	@Override
	public Vip getVipById(int id) {
		// TODO Auto-generated method stub
		Vip vip=new Vip();
		ResultSet rs=DbUtil.executeQuery("select * from vip where vid=?", new Object[]{id});
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

	@Override
	public boolean update(Vip vip) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update vip set State=? where vid=?",
				new Object[]{vip.getState(),vip.getVid()});
	}

}
