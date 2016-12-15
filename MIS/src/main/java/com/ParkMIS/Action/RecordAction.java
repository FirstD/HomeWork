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

import com.ParkMIS.DAO.RecordDAOImpl;
import com.ParkMIS.Service.RecordService;
import com.ParkMIS.entity.Admin;
import com.ParkMIS.entity.Record;
import com.ParkMIS.entity.Vip;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RecordAction extends ActionSupport implements SessionAware, ApplicationAware ,ServletRequestAware,ServletResponseAware{
	private String name;
	private int billNumber;
	public String hxc(){
		RecordDAOImpl RI=new RecordDAOImpl();
		RecordService recordService=new RecordService();
		recordService.setRecordDAO(RI);
		Map<String, Object> session = ActionContext.getContext().getSession();
		Vip vip=(Vip) session.get("vip");
		List<Record> glist=recordService.hxc(vip.getName());
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", glist);
		return SUCCESS;
	}
	
	public String ac(){
		RecordDAOImpl RI=new RecordDAOImpl();
		RecordService recordService=new RecordService();
		recordService.setRecordDAO(RI);
		List<Record> glist=recordService.ac(billNumber);
		System.out.println(billNumber);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", glist);
		return SUCCESS;
	}
	
	
	public String ad(){
		RecordDAOImpl RI=new RecordDAOImpl();
		RecordService recordService=new RecordService();
		recordService.setRecordDAO(RI);
		Map<String, Object> session = ActionContext.getContext().getSession();
		Admin admin=(Admin)session.get("admin");
		List<Record> glist=recordService.ad(admin.getPid());
		System.out.println(billNumber);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", glist);
		return SUCCESS;
	}
	
	public String hxc2(){
		RecordDAOImpl RI=new RecordDAOImpl();
		RecordService recordService=new RecordService();
		recordService.setRecordDAO(RI);
		List<Record> glist=recordService.hxc(name.replace("'", ""));
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



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public int getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	

}
