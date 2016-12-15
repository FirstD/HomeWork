package com.ParkMIS.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ParkMIS.Util.DbUtil;
import com.ParkMIS.entity.Record;

public class RecordDAOImpl implements RecordDAO {

	@Override
	public boolean add(Record record) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into record values(?,?,?,?)",
				new Object[] { record.getRid(), record.getMid(), record.getFeed(), record.getBillNumber() });
	}

	@Override
	public boolean delete(Record record) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("delete from record where rid=?", new Object[] { record.getRid() });
	}

	@Override
	public boolean update(Record record, Record record1) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update record set mid=?,feed=?,billNumber=? where rid=?",
				new Object[] { record.getMid(), record.getFeed(), record.getBillNumber(), record1.getRid() });
	}

	@Override
	public List<Record> hxc(String name) {
		List<Record> glist = new ArrayList<Record>();
		ResultSet rs = DbUtil.executeQuery("select r.billNumber,p.name,o.ch,"
				+ "m.startTime,m.endTime,r.feed from record r,manage m,admin a,vip v,orea o,park p where r.mid in "
				+ "(select mid from manage where vid=(select vid from vip where name=?)) "
				+ "and r.mid=m.mid and p.pid=o.pid "
				+ "and o.oid=m.oid and a.aid=m.aid  and m.yesNo='离开' and v.vid=m.vid",new Object[]{name});
		try {
			while (rs.next()) {
				Record record=new Record();
				record.setBillNumber(rs.getInt(1));
				record.setName(rs.getString(2));
				record.setCh(rs.getInt(3));
				record.setStartTime(rs.getString(4));
				record.setEddTime(rs.getString(5));
				record.setFeed(rs.getInt(6));
                glist.add(record);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;

	}
	

	@Override
	public List<Record> ac(int billNumber) {
		List<Record> glist = new ArrayList<Record>();
		ResultSet rs=DbUtil.executeQuery("select r.billNumber,v.name,p.name,o.ch,m.startTime,m.endTime,r.feed from record r,manage m,vip v,orea o,park p where r.billNumber=? and r.mid=m.mid and p.pid=o.pid and o.oid=m.oid and v.vid=m.vid",new Object[]{billNumber});
		try {
			while (rs.next()){
				Record record=new Record();
				record.setBillNumber(rs.getInt(1));
				record.setName(rs.getString(2));
				record.setPname(rs.getString(3));
				record.setCh(rs.getInt(4));
				record.setStartTime(rs.getString(5));
				record.setEddTime(rs.getString(6));
				record.setFeed(rs.getInt(7));
                glist.add(record);
			}
		} catch (SQLException e) {
			
		}
		return glist;
	}
	

	@Override
	public List<Record> ad(int pid) {
		List<Record> glist = new ArrayList<Record>();
		ResultSet rs=DbUtil.executeQuery("select r.billNumber,v.name,p.name,o.ch,m.startTime,m.endTime,r.feed from admin a, record r,manage m,vip v,orea o,park p where p.pid=? and r.mid=m.mid and p.pid=o.pid and o.oid=m.oid and v.vid=m.vid and a.pid=p.pid and m.yesNo='离开'",new Object[]{pid});
		try {
			while (rs.next()){
				Record record=new Record();
				record.setBillNumber(rs.getInt(1));
				record.setName(rs.getString(2));
				record.setPname(rs.getString(3));
				record.setCh(rs.getInt(4));
				record.setStartTime(rs.getString(5));
				record.setEddTime(rs.getString(6));
				record.setFeed(rs.getInt(7));
                glist.add(record);
			}
		} catch (SQLException e) {
			
		}
		return glist;
	}


}
