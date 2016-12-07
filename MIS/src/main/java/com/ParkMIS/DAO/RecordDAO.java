package com.ParkMIS.DAO;

import com.ParkMIS.entity.Record;

public interface RecordDAO {
	public boolean add(Record record);
	public boolean delete(Record record);
	public boolean update(Record record,Record record1);
}
