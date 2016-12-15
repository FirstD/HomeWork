package com.ParkMIS.Action;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ParkMIS.DAO.AdminDAOImpl;
import com.ParkMIS.DAO.VipDAOImpl;
import com.ParkMIS.Service.VipService;
import com.ParkMIS.entity.Admin;
import com.ParkMIS.entity.Vip;
import com.opensymphony.xwork2.ActionContext;

public class VipSignRegisterOutAction  {
	private VipService vipService=new VipService();
	private Vip vip;
	private String msg;
	private String newpassword1;
	private String newpassword2;
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
	
	public String getNewpassword1() {
		return newpassword1;
	}
	public void setNewpassword1(String newpassword1) {
		this.newpassword1 = newpassword1;
	}
	public String getNewpassword2() {
		return newpassword2;
	}
	public void setNewpassword2(String newpassword2) {
		this.newpassword2 = newpassword2;
	}
	public String sign(){
		VipDAOImpl vipDAOImpl=new VipDAOImpl();
		vipService.setVipDAO(vipDAOImpl);
		String password=vip.getPassword();
		vip=vipService.getVip(vip);
		Map<String, Object> session = ActionContext.getContext().getSession();
		if(password.equals(vip.getPassword())){
			if(vip.getState().equals("激活")){
				session.put("vip",vip);
				msg="登陆成功";
				return "success";
			}
			else{
				msg="账号未激活";
				return "Sfailed";
			}
		}else{
			msg="账号或密码错误，请重新输入";
			return "Sfailed";
		}
	}
	public String out(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("vip",null);
		msg="退出成功";
		return "out";
	}
	public String register(){
		VipDAOImpl vipDAOImpl=new VipDAOImpl();
		vipService.setVipDAO(vipDAOImpl);
		vip.setCost(5);
		vip.setIdentity("普通会员");
		vip.setState("激活");
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
			return "register";
		}else{
			msg="注册失败";
			return "Rfailed";
		}
	}
	public String bhg(){
		VipDAOImpl vipDAOImpl=new VipDAOImpl();
		vipService.setVipDAO(vipDAOImpl);
		List<Vip> glist=vipService.getAll();
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", glist);
		return "bhg";
	}
	public String modifyPassword(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		vip=(Vip)session.get("vip");
		if(vip.getPassword().equals(msg)){
			if(newpassword1.equals(newpassword2)){
				VipDAOImpl vipDAOImpl=new VipDAOImpl();
				vipService.setVipDAO(vipDAOImpl);
				vip.setPassword(newpassword1);
				if(vipService.update(vip, vip))
					msg="修改成功";
				else
					msg="修改失败，请重新尝试";
			}else
				msg="新密码不一致，请重新输入";
		}else
			msg="旧密码错误，请重新输入";
		return "vx";
	}
	public String jh(){
		vip.setState("激活");
		VipDAOImpl vipDAOImpl=new VipDAOImpl();
		vipService.setVipDAO(vipDAOImpl);
		vipService.updateState(vip);
		return "bhg1";
	}
	public String lh(){
		vip.setState("未激活");
		VipDAOImpl vipDAOImpl=new VipDAOImpl();
		vipService.setVipDAO(vipDAOImpl);
		vipService.updateState(vip);
		return "bhg1";
	}
	
}
