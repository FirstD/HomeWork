package com.ParkMIS.Action;

import java.util.Map;

import com.ParkMIS.DAO.AdminDAOImpl;
import com.ParkMIS.DAO.ParkDAOImpl;
import com.ParkMIS.Service.AdminService;
import com.ParkMIS.Service.ParkService;
import com.ParkMIS.entity.Admin;
import com.ParkMIS.entity.Park;
import com.opensymphony.xwork2.ActionContext;

public class AdminSignRegisterOutAction  {
	private AdminService adminService=new AdminService();
	private Admin admin;
	private String msg;
	private String newpassword1;
	private String newpassword2;
	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public String sign(){
		AdminDAOImpl adminDAOImpl=new AdminDAOImpl();
		adminService.setAdminDAO(adminDAOImpl);
		String password=admin.getPassword();
		admin=adminService.getAdmin(admin);
		if(password.equals(admin.getPassword())){
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("admin",admin);
			msg="登陆成功";
			if(admin.getPower().equals("系统管理员"))
				return "balogin";
			else
				return "success";
		}else{
			msg="账号或密码错误，请重新输入";
			return "Sfailed";
		}
	}
	public String out(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("admin",null);
		msg="退出成功";
		return "out";
	}
	public String register(){
		AdminDAOImpl adminDAOImpl=new AdminDAOImpl();
		adminService.setAdminDAO(adminDAOImpl);
		ParkDAOImpl parkDAOImpl=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(parkDAOImpl);
		System.out.println(msg);
		Park park=parkService.getPid(msg);
		admin.setPid(park.getPid());
		if(adminService.add(admin)){
			msg="注册成功";
			return "register";
		}else{
			msg="注册失败";
			return "Rfaild";
		}
		
	}
	public String modifyPassword(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		admin=(Admin)session.get("admin");
		if(admin.getPassword().equals(msg)){
			if(newpassword1.equals(newpassword2)){
				AdminDAOImpl adminDAOImpl=new AdminDAOImpl();
				adminService.setAdminDAO(adminDAOImpl);
				Admin adminN=admin;
				adminN.setPassword(newpassword1);
				if(adminService.update(admin, adminN))
					msg="修改成功";
				else
					msg="修改失败，请重新尝试";
			}else
				msg="新密码不一致，请重新输入";
		}else
			msg="旧密码错误，请重新输入";
		return "ax";
	}
	public String modifyAdmin(){
		AdminDAOImpl adminDAOImpl=new AdminDAOImpl();
		adminService.setAdminDAO(adminDAOImpl);
		String power=admin.getPower();
		admin=adminService.getAdmin(admin);
		ParkDAOImpl parkDAOImpl=new ParkDAOImpl();
		ParkService parkService=new ParkService();
		parkService.setParkDAO(parkDAOImpl);
		Park park=parkService.getPid(msg);
		admin.setPower(power);
		admin.setPid(park.getPid());
		if(adminService.update(admin, admin)){
			msg="修改成功";
			return "bax";
		}else{
			msg="修改失败";
			return "bax";
		}
	}
	
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
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
	

}
