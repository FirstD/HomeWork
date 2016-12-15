package com.ParkMIS.Action;


import java.util.Map;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.ParkMIS.entity.Vip;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class Email extends ActionSupport{
	
	
 private String email;
 private int leave;
 private String name;
 private String yijian;
 private String jieguo;
 


public String getJieguo() {
	return jieguo;
}

public void setJieguo(String jieguo) {
	this.jieguo = jieguo;
}

public String getYijian() {
	return yijian;
}

public void setYijian(String yijian) {
	this.yijian = yijian;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

/**
	 * @param args
	 * @return 
	 * @throws MessagingException
	 */
	public String email() throws MessagingException {
		
		// TODO Auto-generated method stub
		Properties props = new Properties();
		props.setProperty("mail.smtp.auth", "true");
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.host", "smtp.163.com");
		
		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("15665166980", "iamdashen1996");
			}
		});

		session.setDebug(true);
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress("15665166980@163.com"));
		msg.setSubject("缴费通知");
		msg.setRecipients(RecipientType.TO,
				InternetAddress.parse(email));
		msg.setContent("您的缴费期还剩" + leave + "天，请尽快缴费，谢谢合作","text/html;charset=utf-8");
		Transport.send(msg);
		return SUCCESS;
		}
	public String emailUs() throws MessagingException {
		
		// TODO Auto-generated method stub
		Properties props = new Properties();
		props.setProperty("mail.smtp.auth", "true");
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.host", "smtp.163.com");
		
		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("15665166980", "iamdashen1996");
			}
		});

		session.setDebug(true);
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress("15665166980@163.com"));
		msg.setSubject("意见反馈");
		msg.setRecipients(RecipientType.TO,
				InternetAddress.parse("865713661@qq.com"));
		Map<String, Object> session2 = ActionContext.getContext().getSession();
		Vip vip=(Vip) session2.get("vip");
		msg.setContent("用户："+vip.getVid()+"<br/>反映问题："+yijian,"text/html;charset=utf-8");
		Transport.send(msg);
		return "emailUs";
		}


public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getLeave() {
	return leave;
}
public void setLeave(int leave) {
	this.leave = leave;
}}