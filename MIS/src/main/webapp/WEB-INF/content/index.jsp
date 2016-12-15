<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>停车系统</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
</head>

<div id="login_bg"></div>
<p id="login_defeat">账号或密码错误</p>
<div id="login_content" class="contruct">
    <div id="login_content_logo" class="container"><img src="images/logo_large.png" width="677" height="298"></div>
     <div id="login_content_logo" class="container"><s:property value="msg"/></div>
    <div id="login_content_log">登&nbsp;&nbsp;&nbsp;&nbsp;录</div>
    <div id="login_content_reg"><a href="register">注&nbsp;&nbsp;&nbsp;&nbsp;册</a></div>
    <div id="login_content_reg"><a href="fc">空&nbsp;&nbsp;位&nbsp;&nbsp;查&nbsp;&nbsp询</a></div>
	
    <div id="login_content_log_02">
        <form name="form" action="VipSRO!sign">
		
        <div id="login_input1"><input id="login_input11" type="text" name="vip.name" value="用户名" autocomplete="off"></div>
        <div id="login_input2"><input id="login_input12" type="password" name="vip.password" value="密码" autocomplete="off"></div>
        <p id="login_tip"></p>
        <div id="login_input4">登&nbsp;&nbsp;&nbsp;&nbsp;录<input type="submit" value=""></div>
        
        <!--  <div id="login_input3"><input type="checkbox" value="3" name="remeber" checked="checked">记住密码</div>-->
        <p id="login_link1"><a href="会员.html">忘记密码</a></p><p id="login_link2"><a href="register">注册账号</a></p>
        </form>
        <p id="login_close">×</p>
    </div>
</div>
<script type="text/javascript" src="js/common.js"></script>
<body>
</body>
</html>
