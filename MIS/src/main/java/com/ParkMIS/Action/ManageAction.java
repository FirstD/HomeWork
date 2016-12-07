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

import com.ParkMIS.DAO.ManageDAOImpl;
import com.ParkMIS.DAO.ParkDAOImpl;
import com.ParkMIS.Service.ManageService;
import com.ParkMIS.Service.ParkService;
import com.ParkMIS.entity.Manage;
import com.ParkMIS.entity.Park;
import com.opensymphony.xwork2.ActionSupport;

public class ManageAction extends ActionSupport implements SessionAware, ApplicationAware ,ServletRequestAware,ServletResponseAware{
	
	public String hy() throws Exception{
		ManageDAOImpl MI=new ManageDAOImpl();
		ManageService manageService=new ManageService();
		manageService.setManageDAO(MI);
	    int vid=1;
		List<Manage> glist=manageService.hy(vid);
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
