<%@ page language="java" contentType="text/html; utf-8"
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
                        <a href="ParkAction_ag"><i class="fa fa-fw fa-file"></i>车位管理</a>
                    </li>


                    <li>
                        <a href="RecordAction_ad"><i class="fa fa-fw fa-file"></i>记录查询</a>
                    </li>
                    
                    <li>
                        <a href="ac"><i class="fa fa-fw fa-file"></i>信息查询</a>
                    </li>
                     <li>
                        <a href="ax"><i class="fa fa-fw fa-file"></i>修改密码</a>
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
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                            <div class="panel-heading">
                             	   条件查询
                            </div> 
                            <div class="panel-body">
                             <form action="RecordAction_ac" method="post">
                                <div class="form-group">   
                                         
                                            <label class="radio-inline">
                                          	  发票编号
                                            </label>
                                            
                                            <label class="radio-inline">  
                                                <input type="text" class="form-control" name="billNumber">
                                            </label>
                                            <label class="radio-inline">
                                                <input type="submit" value="查询">
                                            </label>
                                           
                                        </div>
                                         </form>
                                </div>
                                <div class="panel-body">
                                <div class="table-responsive">
                                    <table class="table table-striped table-bordered table-hover">
                                        <thead>
                                            <tr>
                                                <th>事件编号</th>
                                                <th>客户</th>
                                                <th>停车场</th>
                                                <th>车号</th>
                                                <th>费用</th>
                                                <th>开始时间</th>
                                                <th>离开时间</th>
                                               
                                                <th>操作</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                             <s:iterator id="list" value="#request.list">
                                            <tr>
                                                <td><s:property value="#list.billNumber"/></td>
                                                <td><s:property value="#list.name"/></td>
                                                <td><s:property value="#list.pname"/></td>
                                                <td><s:property value="#list.ch"/></td>
                                                 <td><s:property value="#list.feed"/></td>
                                                <td><s:property value="#list.startTime"/></td>
                                                <td><s:property value="#list.eddTime"/></td>
                                               <td><a href="#" class="btn btn-primary btn-sm">打印</a>

													</td>
                                              
                                                  
                                            
                                             
                                            </tr>
                                               </s:iterator>

                                        </tbody>
                                    </table>
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
