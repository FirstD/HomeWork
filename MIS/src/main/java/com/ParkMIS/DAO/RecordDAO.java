package com.ParkMIS.DAO;

import java.util.List;

import com.ParkMIS.entity.Record;

public interface RecordDAO {
	public boolean add(Record record);
	public boolean delete(Record record);
	public boolean update(Record record,Record record1);
	public List<Record> hxc(String name);
	public List<Record> ad(int pid);
	public List<Record> ac(int billNumber);
}
