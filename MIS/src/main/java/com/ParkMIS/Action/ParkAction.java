package com.ParkMIS.Action;

import java.io.UnsupportedEncodingException;
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
import com.ParkMIS.entity.Admin;
import com.ParkMIS.entity.Park;
import com.ParkMIS.entity.ParkAdmin;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ParkAction extends ActionSupport implements SessionAware, ApplicationAware ,ServletRequestAware,ServletResponseAware{
	private String place;
	private Park park;
	private String msg;
	private String name;
	
	public String hkc(){
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
		List<Park> glist=parkService.hkc(name);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", glist);
		return SUCCESS;
	}
	
	public String ykc(){
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
	    int pid=1;
		List<Park> glist=parkService.hkc(name);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", glist);
		return SUCCESS;
	}
	
	public String tcc() throws UnsupportedEncodingException{
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
		List<Park> glist=parkService.tcc(place);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", glist);
		return SUCCESS;
	}
	
	public String baa(){
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
		List<Park> glist=parkService.getAll();
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("parkList", glist);
		return "success";
	}
	public String bax(){
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
		List<Park> glist=parkService.getAll();
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("parkList", glist);
		return "success";
	}
	public String bpg(){
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
		List<ParkAdmin> glist=parkService.getAllByPlace(place.replace("'", ""));
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", glist);
		return "success";
	}
	public String addPark(){
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
		
		if(parkService.add(park)){
			park=parkService.getPid(park.getName());
			park.setState("未停");
			if(parkService.addOrea(park))
				msg="添加成功";
			else
				msg="添加失败2";
		}
		else
			msg="添加失败";
		return "add";
	}
//	public String ag(){
//		ParkDAOImpl PI=new ParkDAOImpl();
//		ParkService parkService=new ParkService();
//		parkService.setParkDAO(PI);
//		List<Park> glist=parkService.hkc(name);
//		HttpServletRequest request=ServletActionContext.getRequest();
//		request.setAttribute("list", glist);
//		return SUCCESS;
//	}
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Park getPark() {
		return park;
	}

	public void setPark(Park park) {
		this.park = park;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String ag(){
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
		Map<String, Object> session = ActionContext.getContext().getSession();
		Admin admin=(Admin)session.get("admin");
		List<Park> glist=parkService.getOreaByAdmin(admin);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", glist);
		return SUCCESS;
	}

}
