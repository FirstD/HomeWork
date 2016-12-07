package com.ParkMIS.Action;

import java.util.Map;

import com.ParkMIS.DAO.AdminDAOImpl;
import com.ParkMIS.Service.AdminService;
import com.ParkMIS.entity.Admin;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SignRegisterOut extends ActionSupport {
	private AdminService adminService=new AdminService();
	private Admin admin;
	private String msg;
	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public String signAdmin(){
		AdminDAOImpl adminDAOImpl=new AdminDAOImpl();
		adminService.setAdminDAO(adminDAOImpl);
		String password=admin.getPassword();
		admin=adminService.getAdmin(admin);
		if(password==admin.getPassword()){
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("user",admin.getName());
			msg="登陆成功";
			return SUCCESS;
		}else{
			msg="账号或密码错误，请重新输入";
			return "Sfailed";
		}
	}
	public String outAdmin(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("user",null);
		msg="退出成功";
		return "out";
	}
	public String Register(){
		AdminDAOImpl adminDAOImpl=new AdminDAOImpl();
		adminService.setAdminDAO(adminDAOImpl);
		if(adminService.add(admin)){
			msg="注册成功";
			return "register";
		}else{
			msg="注册失败";
			return "Rfaild";
		}
		
	}
}
