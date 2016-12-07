package com.ParkMIS.Action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.ParkMIS.DAO.ParkDAOImpl;
import com.ParkMIS.Service.ParkService;
import com.ParkMIS.entity.Park;
import com.opensymphony.xwork2.ActionSupport;

public class ParkAction extends ActionSupport implements SessionAware, ApplicationAware ,ServletRequestAware,ServletResponseAware{
	
	public String hkc(){
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
	    int pid=1;
		List<Park> glist=parkService.hkc(pid);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", glist);
		return SUCCESS;
	}
	
	public String ykc(){
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
	    int pid=1;
		List<Park> glist=parkService.hkc(pid);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", glist);
		return SUCCESS;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		
	}

}
