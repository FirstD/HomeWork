package com.ParkMIS.Action;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

import com.ParkMIS.DAO.VipDAOImpl;
import com.ParkMIS.Service.VipService;
import com.ParkMIS.entity.Vip;
import com.opensymphony.xwork2.ActionContext;

public class VipSignRegisterOutAction  {
	private VipService vipService=new VipService();
	private Vip vip;
	private String msg;
	
	public VipService getVipService() {
		return vipService;
	}
	public void setVipService(VipService vipService) {
		this.vipService = vipService;
	}
	public Vip getVip() {
		return vip;
	}
	public void setVip(Vip vip) {
		this.vip = vip;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String sign(){
		VipDAOImpl vipDAOImpl=new VipDAOImpl();
		vipService.setVipDAO(vipDAOImpl);
		String password=vip.getPassword();
		vip=vipService.getVip(vip);
		Map<String, Object> session = ActionContext.getContext().getSession();
		if(password.equals(vip.getPassword())){
			session.put("user",vip.getName());
			msg="登陆成功";
			session.put("msg",msg);
			return "success";
		}else{
			msg="账号或密码错误，请重新输入";
			session.put("msg",msg);
			return "Sfailed";
		}
	}
	public String out(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("user",null);
		msg="退出成功";
		session.put("msg",msg);
		return "out";
	}
	public String register(){
		VipDAOImpl vipDAOImpl=new VipDAOImpl();
		vipService.setVipDAO(vipDAOImpl);
		vip.setCost(10);
		vip.setIdentity("普通会员");
		vip.setState("正常");
		Date day=new Date();
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		vip.setStartDate(day);
		GregorianCalendar grc=new GregorianCalendar();
		grc.setTime(day);
		grc.add(GregorianCalendar.YEAR,1);
		day=grc.getTime();
		vip.setEndDate(day);
		Map<String, Object> session = ActionContext.getContext().getSession();
		if(vipService.add(vip)){
			msg="注册成功";
			session.put("msg",msg);
			return "register";
		}else{
			msg="注册失败";
			session.put("msg",msg);
			return "Rfailed";
		}
		
	}
}
