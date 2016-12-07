package com.ParkMIS.Service;

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
}
