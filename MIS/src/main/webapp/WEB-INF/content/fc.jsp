<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=550, initial-scale=1">
<title>车位页面</title>
<link rel="stylesheet" type="text/css" href="css/default.css">
<link rel="stylesheet" href="css/demo.css">
<link rel="stylesheet" href="css/jquery.flipster.css">
<link rel="stylesheet" href="css/flipsternavtabs.css">

</head>
<body>
 
<div class="zzsc-container"  margin: 0 auto;>
	
	<div class="zzsc-content bgcolor-3">
		<div id="Main-Content">
			<div class="Container">
		<!-- Flipster List -->	
				<div class="flipster">
				   <ul>
					<li>
						<a href="ParkAction_tcc?place=云龙区" class="Button Block">
						
							<h1>云龙区</h1>
							<!--<p>Showcase of all available features in both the Coverflow and Carousel styles</p>-->
						</a>
					</li>
                   
					<li>
				       <a href="ParkAction_tcc?place=鼓楼区" class="Button Block">
							<h1>鼓楼区</h1>
							<!--<p>The bare minimum code needed to implement Flipster</p>-->
						</a>
					</li>
                   
					<li>
					 <a href="ParkAction_tcc?place=九里区" class="Button Block">
							<h1>九里区</h1>
							<!--<p>Roundabout carousel style!</p>-->
						</a>
					</li>
					<li>
						 <a href="ParkAction_tcc?place=贾汪区" class="Button Block">
							<h1>贾汪区</h1>
							<!--<p>Example of tab navigation using the <code>enableNav</code> option</p>-->
						</a>
					</li>
					<li>
						 <a href="ParkAction_tcc?place=泉山区" class="Button Block">
							<h1>泉山区</h1>
							<!--<p>Example of tab navigation using the <code>enableNav</code> option</p>-->
                            </a>
                      </li>
                            <li>
                                
						 <a href="ParkAction_tcc?place=邳州市" class="Button Block">
							<h1>邳州市</h1>
							<!--<p>Example of tab navigation using the <code>enableNav</code> option</p>-->
						</a>
					</li>
                    
                    <li>
					 <a href="ParkAction_tcc?place=新沂市" class="Button Block">
							<h1>新沂市</h1>
							<!--<p>Example of tab navigation using the <code>enableNav</code> option</p>-->
						</a>
					
					</li>
				  </ul>
                  
				</div>
		<!-- End Flipster List -->

			</div>
		</div>
	</div>
</div>
  
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script src="js/jquery.flipster.js"></script>
<script>$(function(){ $(".flipster").flipster({ style: 'carousel', start: 0 }); });</script>

</body>
</html>