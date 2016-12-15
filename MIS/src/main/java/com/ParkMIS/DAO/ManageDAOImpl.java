package com.ParkMIS.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ParkMIS.Util.DbUtil;
import com.ParkMIS.entity.Manage;
import com.ParkMIS.entity.Vip;

public class ManageDAOImpl implements ManageDAO{

	@Override
	public boolean add(Manage manage) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into manage values(?,?,?,?,?,?,?,?)",
				new Object[]{manage.getMid(),manage.getAid(),manage.getOid(),manage.getVid(),
						manage.getAppTime(),manage.getStartTime(),manage.getEndTime(),manage.getYesNo()});
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
				+ "endTime=?,yesNo=? where mid=?",
				new Object[]{manage1.getAid(),manage1.getOid(),manage1.getMid(),manage1.getAppTime(),
						manage1.getStartTime(),manage1.getEndTime(),manage1.getYesNo(),manage2.getMid()});
	}

	@Override
	//Admin in out quxiaoyueyudefangfa
	public Manage getMangeByOid(int i) {
		// TODO Auto-generated method stub
		Manage manage=new Manage();
		ResultSet rs=DbUtil.executeQuery("select * from manage where oid=? and yesNo in('预约中','停放中')", new Object[]{i});
		try {
			while(rs.next()){
				manage.setMid(rs.getInt(1));
				manage.setAid(rs.getInt(2));
				manage.setOid(rs.getInt(3));
				manage.setVid(rs.getInt(4));
				manage.setAppTime(rs.getString(5));
				manage.setStartTime(rs.getString(6));
				manage.setEndTime(rs.getString(7));
				manage.setYesNo(rs.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return manage;
	}

	@Override
	public Manage getLastByVip(Vip vip) {
		// TODO Auto-generated method stub
		Manage manage=new Manage();
		ResultSet rs=DbUtil.executeQuery("select * from manage where vid=? and yesNo in('预约中','未停') order by asc", new Object[]{vip.getVid()});
		try {
			while(rs.next()){
				manage.setMid(rs.getInt(1));
				manage.setAid(rs.getInt(2));
				manage.setOid(rs.getInt(3));
				manage.setVid(rs.getInt(4));
				manage.setAppTime(rs.getString(5));
				manage.setStartTime(rs.getString(6));
				manage.setEndTime(rs.getString(7));
				manage.setYesNo(rs.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return manage;
	}


	@Override
	public List<Manage> hy(int vid) throws Exception {
		List<Manage> glist=new ArrayList<Manage>();
		ResultSet rs=DbUtil.executeQuery("select * from manage where vid=? and yesNo='预约中'", new Object[]{vid});
		try {
			while(rs.next()){
				Manage manage=new Manage();
				manage.setMid(rs.getInt(1));
				manage.setAid(rs.getInt(2));
				manage.setOid(rs.getInt(3));
				manage.setVid(rs.getInt(4));
				manage.setAppTime(rs.getString(5));
				manage.setStartTime(rs.getString(6));
				manage.setEndTime(rs.getString(7));
				manage.setYesNo(rs.getString(8));
				glist.add(manage);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
	}
	
}
