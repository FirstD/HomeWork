package com.ParkMIS.Action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
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
import com.ParkMIS.DAO.RecordDAOImpl;
import com.ParkMIS.DAO.VipDAOImpl;
import com.ParkMIS.Service.ManageService;
import com.ParkMIS.Service.ParkService;
import com.ParkMIS.Service.RecordService;
import com.ParkMIS.Service.VipService;
import com.ParkMIS.entity.Admin;
import com.ParkMIS.entity.Manage;
import com.ParkMIS.entity.Park;
import com.ParkMIS.entity.Record;
import com.ParkMIS.entity.Vip;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ManageAction extends ActionSupport implements SessionAware, ApplicationAware ,ServletRequestAware,ServletResponseAware{
	private Park park;
	private String msg;
	public String hy() throws Exception{
		ManageDAOImpl MI=new ManageDAOImpl();
		ManageService manageService=new ManageService();
		manageService.setManageDAO(MI);
		Map<String, Object> session = ActionContext.getContext().getSession();
		Vip vip=(Vip) session.get("vip");
		List<Manage> glist=manageService.hy(vip.getVid());
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", glist);
		return SUCCESS;
	}
	public String in(){
		ManageDAOImpl MI=new ManageDAOImpl();
		ManageService manageService=new ManageService();
		manageService.setManageDAO(MI);
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
		park.setState("已停");
		parkService.update(park);
		Manage manage=manageService.getManageByOid(park.getOid());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		manage.setStartTime(sdf.format(new Date()));
		Map<String, Object> session = ActionContext.getContext().getSession();
		Admin admin=(Admin)session.get("admin");
		manage.setAid(admin.getAid());
		manage.setYesNo("停放中");
		manageService.update(manage, manage);
		return "ok";
	}
	public String ykin(){
		ManageDAOImpl MI=new ManageDAOImpl();
		ManageService manageService=new ManageService();
		manageService.setManageDAO(MI);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Manage manage=new Manage();
		manage.setOid(park.getOid());
		manage.setVid(1);
		manage.setYesNo("停放中");
		manage.setStartTime(sdf.format(new Date()));
		manage.setAid(1);
		manageService.add(manage);
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
		park.setState("已停");
		parkService.update(park);
		msg="操作成功";
		return "ok";
	}
	public String out() throws Exception{
		ManageDAOImpl MI=new ManageDAOImpl();
		ManageService manageService=new ManageService();
		manageService.setManageDAO(MI);
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
		park.setState("未停");
		parkService.update(park);
		Manage manage=manageService.getManageByOid(park.getOid());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date endTime=new Date();
		manage.setEndTime(sdf.format(endTime));
		manage.setYesNo("离开");
		manageService.update(manage, manage);
		RecordDAOImpl RI=new RecordDAOImpl();
		RecordService rs=new RecordService();
		rs.setRecordDAO(RI);
		Record record=new Record();
		record.setMid(manage.getMid());
		record.setBillNumber(manage.getMid()+172139);
		Date startTime=(Date)sdf.parse(manage.getStartTime());
		long time=(endTime.getTime()-startTime.getTime())/(1000*60*60);
		if(time==0)
			time++;
		VipDAOImpl vI=new VipDAOImpl();
		VipService vs=new VipService();
		vs.setVipDAO(vI);
		Vip vip=new Vip();
		vip=vs.getVipById(manage.getVid());
		record.setFeed(vip.getCost()*time);
		System.out.println(record.getFeed());
		rs.add(record);
		return "ok";
	}
	public String appiont(){
		ManageDAOImpl MI=new ManageDAOImpl();
		ManageService manageService=new ManageService();
		manageService.setManageDAO(MI);
		Map<String, Object> session = ActionContext.getContext().getSession();
		Vip vip=(Vip)session.get("vip");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		GregorianCalendar grc=new GregorianCalendar();
		grc.setTime(new Date());
		grc.add(GregorianCalendar.HOUR_OF_DAY,1);
		Date time=grc.getTime();
		Manage manage=new Manage(park.getOid(),vip.getVid(),sdf.format(time),"预约中");
		manage.setAid(1);
		if(manageService.add(manage)){
			ParkDAOImpl PI=new ParkDAOImpl();
			ParkService parkService=new ParkService();
			parkService.setParkDAO(PI);
			park.setState("预约");
			parkService.update(park);
			msg="预约成功";
		}else
			
			msg="预约失败";
		return "appiont";
	}
	public String cancel() throws Exception{
		ManageDAOImpl MI=new ManageDAOImpl();
		ManageService manageService=new ManageService();
		manageService.setManageDAO(MI);
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
		park.setState("未停");
		parkService.update(park);
		Manage manage=manageService.getManageByOid(park.getOid());
		manage.setYesNo("离开");
		manageService.update(manage, manage);
		RecordDAOImpl RI=new RecordDAOImpl();
		RecordService rs=new RecordService();
		rs.setRecordDAO(RI);
		Record record=new Record();
		record.setMid(manage.getMid());
		record.setBillNumber(manage.getMid()+172139);
		VipDAOImpl vI=new VipDAOImpl();
		VipService vs=new VipService();
		vs.setVipDAO(vI);
		Vip vip=new Vip();
		vip=vs.getVipById(manage.getVid());
		record.setFeed(5);
		rs.add(record);
		return "ok";
	}
	public String yhcancel() throws Exception{
		ManageDAOImpl MI=new ManageDAOImpl();
		ManageService manageService=new ManageService();
		manageService.setManageDAO(MI);
		ParkDAOImpl PI=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(PI);
		park.setState("未停");
		parkService.update(park);
		Manage manage=manageService.getManageByOid(park.getOid());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date appTime=(Date)sdf.parse(manage.getAppTime());
		Date now=new Date();
		long time=(now.getTime()-appTime.getTime())/(1000*60);
		if(time>-20)
			manage.setYesNo("离开");
		else
			manage.setYesNo("取消预约");
		manageService.update(manage, manage);
		RecordDAOImpl RI=new RecordDAOImpl();
		RecordService rs=new RecordService();
		rs.setRecordDAO(RI);
		Record record=new Record();
		record.setMid(manage.getMid());
		record.setBillNumber(manage.getMid()+172139);
		VipDAOImpl vI=new VipDAOImpl();
		VipService vs=new VipService();
		vs.setVipDAO(vI);
		Vip vip=new Vip();
		vip=vs.getVipById(manage.getVid());
		if(time>-20)
			record.setFeed(5);
		else
			record.setFeed(0);
		rs.add(record);
		return "no";
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

}
