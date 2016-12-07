package com.ParkMIS.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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


	@Override
	public List<Manage> hy(int vid) throws Exception {
		List<Manage> glist=new ArrayList<Manage>();
		ResultSet rs=DbUtil.executeQuery("select * from manage where vid=?", new Object[]{vid});
		try {
			while(rs.next()){
				Manage manage=new Manage();
				manage.setMid(rs.getInt(1));
				manage.setAid(rs.getInt(2));
				manage.setOid(rs.getInt(3));
				manage.setVid(rs.getInt(4));
				manage.setAppTime(rs.getTimestamp(5));
				String apTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(manage.getAppTime());
				manage.setApTime(apTime);
				manage.setStartTime(rs.getDate(6));
				manage.setEndTime(rs.getDate(7));
				manage.setYN(rs.getString(8));
				glist.add(manage);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
	}
	
}
