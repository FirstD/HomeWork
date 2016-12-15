package com.ParkMIS.Service;

import java.util.List;

import com.ParkMIS.DAO.RecordDAO;
import com.ParkMIS.entity.Record;

public class RecordService {
	private RecordDAO recordDAO;
	public boolean add(Record record){
		return recordDAO.add(record);
	}
	public boolean delete(Record record){
		return recordDAO.delete(record);
	}
	public boolean update(Record record,Record record1){
		return recordDAO.update(record, record1);
	}
	public RecordDAO getRecordDAO() {
		return recordDAO;
	}
	public void setRecordDAO(RecordDAO recordDAO) {
		this.recordDAO = recordDAO;
	}
	public List<Record> hxc(String name){
		return recordDAO.hxc(name);
	}
	public List<Record> ac(int billNumber){
		return recordDAO.ac(billNumber);
	}
	
	public List<Record> ad(int pid){
		return recordDAO.ad(pid);
	}
}
