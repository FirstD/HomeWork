package com.ParkMIS.Action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.ParkMIS.DAO.VipDAOImpl;
import com.ParkMIS.Service.VipService;
import com.ParkMIS.entity.Vip;
import com.opensymphony.xwork2.ActionSupport;

public class VipAction extends ActionSupport implements SessionAware, ApplicationAware ,ServletRequestAware,ServletResponseAware{

	public String yj() throws ParseException{
		VipDAOImpl VI=new VipDAOImpl();
		VipService vipservice=new VipService();
		vipservice.setVipDAO(VI);
		List<Vip> glist=vipservice.yj();
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
