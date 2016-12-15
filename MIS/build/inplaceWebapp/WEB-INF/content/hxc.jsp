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
    <link href="assets/css/custom2-styles.css" rel="stylesheet" />
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
               
            </div>

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                        <i class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <a href="#">
                               
                               
                            </a>
                        </li>
                        <li class="divider"></li>
                       
                        <li>
                           
 <a href="emailUs">
                                <strong>联系我们</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-messages -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                        <i class="fa fa-tasks fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                   
                  
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="fc"><i class="fa fa-user fa-fw"></i>空位查询</a>
                        </li>
                         <li><a href="ManageAction_hy"><i class="fa fa-user fa-fw"></i>我的预约</a>
                        </li>
                         <li><a href="hx"><i class="fa fa-gear fa-fw"></i>修改资料</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="vip"><i class="fa fa-sign-out fa-fw"></i> 返回</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
			 <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-header">
                            消费记录查询 <small>
                                    </small>
                        </h1>
                    </div>
                </div> 
                 <!-- /. ROW  -->
               
            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                            <div class="panel-heading">
                             
                            </div> 
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table class="table table-striped table-bordered table-hover">
                                        <thead>
                                            <tr>
                                                <th>事件编号</th>
                                                <th>停车场</th>
                                                <th>车位号</th>
                                                <th>开始时间</th>
                                                <th>离开时间</th>
                                                <th>费用</th>
                                              
                                               
                                            </tr>
                                        </thead>
                                        
                                        <tbody>
                                       <s:iterator id="list" value="#request.list">
                                            <tr>
                                                <td><s:property value="#list.billNumber"/></td>
                                                <td><s:property value="#list.name"/></td>
                                                <td><s:property value="#list.ch"/></td>
                                                <td><s:property value="#list.startTime"/></td>
                                                <td><s:property value="#list.eddTime"/></td>
                                                <td><s:property value="#list.feed"/></td>
                                              
                                                  
                                            
                                             
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
