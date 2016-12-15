package com.ParkMIS.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ParkMIS.Util.DbUtil;
import com.ParkMIS.entity.Admin;
import com.ParkMIS.entity.Park;
import com.ParkMIS.entity.ParkAdmin;


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
	public List<Park> hkc(String name) {
		List<Park> glist = new ArrayList<Park>();
		String zt = "未停";
		ResultSet rs = DbUtil.executeQuery("select p.name,o.ch,o.state,o.oid from park p,orea o where o.state=?and p.name=?and o.pid=p.pid", new Object[] { zt,name});
		try {
			while (rs.next()) {
				Park park = new Park();
				park.setName(rs.getString(1));
				park.setCh(rs.getInt(2));
				park.setState(rs.getString(3));
				park.setOid(rs.getInt(4));
				glist.add(park);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
	}

	@Override
	public List<Park> ykc(String name) {
		List<Park> glist = new ArrayList<Park>();
		String zt = "未停";
		ResultSet rs = DbUtil.executeQuery("select p.name,o.ch,o.state from park p,orea o where o.state=?and p.name=?and o.pid=p.pid", new Object[] { zt,name});
		try {
			while (rs.next()) {
				Park park = new Park();
				park.setName(rs.getString(1));
				park.setCh(rs.getInt(2));
				park.setState(rs.getString(3));
				glist.add(park);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
	}

	@Override
	public List<Park> tcc(String place) {
		List<Park> glist = new ArrayList<Park>();
		String state="未停";
		System.out.println(state);
		ResultSet rs = DbUtil
				.executeQuery(
						"select p.place,p.name,count(o.pid) as kw " + "from park p,orea o where p.place=? "
								+ "and o.state=?" + "and o.pid=p.pid group by p.name",
						new Object[] {place, state});
		try {
			while (rs.next()) {
				Park park=new Park();
				park.setPlace(rs.getString(1));
				park.setName(rs.getString(2));
				park.setMaxSite(rs.getInt(3));
				glist.add(park);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
	}


	@Override
	public Park getPid(String name) {
		// TODO Auto-generated method stub
		Park park=new Park();
		ResultSet rs=DbUtil.executeQuery("select * from park where name=?", new Object[]{name});
		try {
			while(rs.next()){
				park.setPid(rs.getInt(1));
				park.setName(rs.getString(2));
				park.setMaxSite(rs.getInt(3));
				park.setPlace(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return park;
	}

	@Override
	public List<Park> getAll() {
		// TODO Auto-generated method stub
		List<Park> glist=new ArrayList<Park>();
		ResultSet rs=DbUtil.executeQuery("select * from park", new Object[]{});
		try {
			while(rs.next()){
				Park park=new Park();
				park.setPid(rs.getInt(1));
				park.setName(rs.getString(2));
				park.setMaxSite(rs.getInt(3));
				park.setPlace(rs.getString(4));
				glist.add(park);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
	}

	@Override
	public List<ParkAdmin> getAllByPlace(String place) {
		// TODO Auto-generated method stub
		List<ParkAdmin> glist=new ArrayList<ParkAdmin>();
		ResultSet rs=DbUtil.executeQuery("select park.name,admin.name from park,admin where place=? and park.pid=admin.pid", new Object[]{place});
		try {
			while(rs.next()){
				ParkAdmin pa=new ParkAdmin();
				pa.setParkName(rs.getString(1));
				pa.setAdminName(rs.getString(2));
				glist.add(pa);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
	}

	@Override
	public boolean addOrea(Park park) {
		// TODO Auto-generated method stub
		boolean b=true;
		for(int i=1;i<=park.getMaxSite();i++){
			park.setCh(i);
			b=DbUtil.executeUpdate("insert into orea values(?,?,?,?)", 
				new Object[]{park.getOid(),park.getPid(),park.getCh(),park.getState()});
			if(b!=true){
				break;
			}
		}
		return b;
		
	}

	@Override
	public List<Park> getOreaByAdmin(Admin admin) {
		// TODO Auto-generated method stub
		List<Park> glist=new ArrayList<Park>();
		ResultSet rs=DbUtil.executeQuery("select * from orea where pid=?", new Object[]{admin.getPid()});
		try {
			while(rs.next()){
				Park p=new Park();
				p.setOid(rs.getInt(1));
				p.setPid(admin.getPid());
				p.setCh(rs.getInt(3));
				p.setState(rs.getString(4));
				glist.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
	}

	@Override
	public boolean update(Park park) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update orea set state=? where oid=?",
				new Object[]{park.getState(),park.getOid()});
	}

	@Override
	public List<Park> akc(int pid) {
		// TODO Auto-generated method stub
		List<Park> glist = new ArrayList<Park>();
		String zt = "未停";
		ResultSet rs = DbUtil.executeQuery("select p.name,o.ch,o.state,o.oid from park p,orea o where o.state=?and p.pid=?and o.pid=p.pid", new Object[] { zt,pid});
		try {
			while (rs.next()) {
				Park park = new Park();
				park.setName(rs.getString(1));
				park.setCh(rs.getInt(2));
				park.setState(rs.getString(3));
				park.setOid(rs.getInt(4));
				glist.add(park);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
	}
	
	
	
}
