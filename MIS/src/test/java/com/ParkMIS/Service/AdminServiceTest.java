package com.ParkMIS.Service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ParkMIS.DAO.AdminDAOImpl;
import com.ParkMIS.DAO.ParkDAOImpl;
import com.ParkMIS.entity.Admin;
import com.ParkMIS.entity.Park;


public class AdminServiceTest {
	private AdminDAOImpl AdImpl=new AdminDAOImpl();
	private AdminService Ads=new AdminService();
	private ParkDAOImpl PImpl=new ParkDAOImpl();
	private ParkService Ps=new ParkService();
	@Before
	public void begin(){
		Ads.setAdminDAO(AdImpl);
		Ps.setParkDAO(PImpl);;
	}


	@After
	public void end(){
		System.out.println("success");
	}

}
