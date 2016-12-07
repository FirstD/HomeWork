package com.ParkMIS.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Park> hkc(int pid) {
		List<Park> glist =new ArrayList<Park>();
		String zt="未停";
		ResultSet rs=DbUtil.executeQuery("select * from orea where state=?and pid=?", new Object[]{zt,pid});
		try {
			while(rs.next()){
				Park park=new Park();
				park.setOid(rs.getInt(1));
				park.setPid(rs.getInt(2));
				park.setCh(rs.getInt(3));
				park.setState(rs.getString(4));
				glist.add(park);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
	}

	@Override
	public List<Park> ykc(int pid) {
		List<Park> glist=new ArrayList<Park>();
		String zt="未停";
		ResultSet rs=DbUtil.executeQuery("select * from orea where state=?and pid=?", new Object[]{zt,pid});
		try {
			while(rs.next()){
				Park park=new Park();
				park.setOid(rs.getInt(1));
				park.setPid(rs.getInt(2));
				park.setCh(rs.getInt(3));
				park.setState(rs.getString(4));
				glist.add(park);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
	}

	
	
}
