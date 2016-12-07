package com.ParkMIS.DAO;

import com.ParkMIS.Util.DbUtil;
import com.ParkMIS.entity.Record;

public class RecordDAOImpl implements RecordDAO {

	@Override
	public boolean add(Record record) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into record values(?,?,?,?)",
				new Object[]{record.getRid(),record.getMid(),record.getFeed(),record.getBillNumber()});
	}

	@Override
	public boolean delete(Record record) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("delete from record where rid=?",
				new Object[]{record.getRid()});
	}

	@Override
	public boolean update(Record record, Record record1) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update record set mid=?,feed=?,billNumber=? where rid=?",
				new Object[]{record.getMid(),record.getFeed(),record.getBillNumber(),record1.getRid()});
	}

}
