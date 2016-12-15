﻿<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
       <%@ taglib uri="/struts-tags" prefix="s"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title></title>
	<!-- Bootstrap Styles-->
    <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/bootstrap-3.3.4.css">
     <!-- FontAwesome Styles-->
    <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
     <!-- Morris Chart Styles-->
   
        <!-- Custom Styles-->
    <link href="assets/css/custom-styles.css" rel="stylesheet" />
     <!-- Google Fonts-->
   
     <!-- TABLE STYLES-->
    <link href="assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />
</head>
<body>
    <div id="wrapper">
        <nav class="navbar navbar-default top-navbar" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html"><i class="fa fa-comments"></i> <strong>停车场管理系统 </strong></a>
            </div>

           <ul class="nav navbar-top-links navbar-right">
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="ax"><i class="fa fa-gear fa-fw"></i><s:property value="#session.admin.name"/></a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="AdminSRO!out"><i class="fa fa-sign-out fa-fw"></i>退出</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
        </nav>
        <!--/. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                    <li>
                        <a href="bpg"><i class="fa fa-sitemap"></i>停车场管理<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="ParkAction_bpg?place='云龙区'">云龙区</a>
                            </li>
                            <li>
                                <a href="#">鼓楼区</a>
                            </li>
                            <li>
                                <a href="#">九里区</a>
                            </li>
                            <li>
                                <a href="#">贾汪区</a>
                            </li>
                            <li>
                                <a href="#">泉山区</a>
                            </li>
                            <li>
                                <a href="#">邳州市</a>
                            </li>
                            <li>
                                <a href="#">新沂市</a>
                            </li>
                        </ul>
                    </li>
                     <li>
                        <a href="VipSRO!bhg"><i class="fa fa-fw fa-file"></i>会员管理</a>
                    </li>
                       <li>
                    	<a href="VipAction_yj"><i class="fa fa-fw fa-file"></i>预警模块</a>
                    </li>
                    <li>
                    	<a href="ParkAction_baa"><i class="fa fa-fw fa-file"></i>添加管理员</a>
                    </li>
                    <li>
                    	<a href="ParkAction_bax"><i class="fa fa-fw fa-file"></i>修改管理员</a>
                    </li>
                </ul>

            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
			 
               
            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                            <div class="panel-heading">
                                停车场管理
                            </div> 
                            
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-md-4"></div>
                                        <div class="col-md-4">
                                            <form role="form" action="ParkAction!addPark">
                                            	<label><s:property value="msg"/></label><br/>
                                                <label>停车场名称</label><input name="park.name" class="form-control"><br/>
                                                <label>停车场车位数量：</label><input name="park.maxSite" class="form-control"><br/>
                                                <label>停车场区域：</label>
                                                <select class="form-control" name="park.place">
                                                    <option value="云龙区">云龙区</option>
                                                    <option value="鼓楼区">鼓楼区</option>
                                                    <option value="九里区">九里区 </option>
                                                    <option value="贾汪区">贾汪区</option>
                                                    <option value="泉山区">泉山区</option>
                                                    <option value="邳州市">邳州市</option>
                                                    <option value="新沂市">新沂市</option>
                                                </select>
                                                <br/>
                                                <button type="submit" class="btn btn-default">添加</button>
                                                
                                            </form>
                                        </div>
                                        <div class="col-md-4"></div>
                                    </div>
                                </div>
                     </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
                <!-- /. ROW  -->
            
             
            </div>
                <!-- /. ROW  -->
        </div>
               <footer><p>Copyright &copy; 2016.Company name All rights reserved.</p></footer>
    </div>
             <!-- /. PAGE INNER  -->
            </div>
         <!-- /. PAGE WRAPPER  -->
     <!-- /. WRAPPER  -->
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
      <!-- Bootstrap Js -->
    <script src="http://www.jq22.com/jquery/bootstrap-3.3.4.js"></script>
    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
     <!-- DATA TABLE SCRIPTS -->
    <script src="assets/js/dataTables/jquery.dataTables.js"></script>
    <script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
        <script>
            $(document).ready(function () {
                $('#dataTables-example').dataTable();
            });
    </script>
         <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script>
    
   
</body>
</html>
