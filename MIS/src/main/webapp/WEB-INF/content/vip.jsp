<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>会员页面</title>
<link rel="stylesheet" href="css/lanrenzhijia.css">
<script src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
<!--[if (gte IE 6)&(lte IE 8)]> 
		<script src="js/lanrenzhijia.js"></script>
	<![endif]-->
</head>
<body>
<ul class="menu">
  <li tabindex="1"> <a href="fc"><span class="title">空位查询</span></a>
     
  </li>
 <li tabindex="1">  <a href="RecordAction_hxc"><span class="title">历史记录查询</span></a>
    
  </li>
  <li tabindex="1"> <a href="ManageAction_hy"> <span class="title">我的预约</span></a>
  
  <li tabindex="1">  <a href="hx"> <span class="title">修改资料</span></a>
   
  </li>

<li tabindex="1"> <a href="emailUs"><span class="title">联系我们</span>
   </a>
   
  </li>
  <li tabindex="1">  <a href="index"><span class="title">退出登录</span></a>
  
  </li>
 
</ul>
<script>
	  (function(){
	  
		// Append a close trigger for each block
		$('.menu .content').append('<span class="close">x</span>');		
		// Show window
		function showContent(elem){
			hideContent();
			elem.find('.content').addClass('expanded');
			elem.addClass('cover');	
		}
		// Reset all
		function hideContent(){
			$('.menu .content').removeClass('expanded');
			$('.menu li').removeClass('cover');		
		}
		
		// When a li is clicked, show its content window and position it above all
		$('.menu li').click(function() {
			showContent($(this));
		});		
		// When tabbing, show its content window using ENTER key
		$('.menu li').keypress(function(e) {
			if (e.keyCode == 13) { 
				showContent($(this));
			}
		});

		// When right upper close element is clicked  - reset all
		$('.menu .close').click(function(e) {
			e.stopPropagation();
			hideContent();
		});		
		// Also, when ESC key is pressed - reset all
		$(document).keyup(function(e) {
			if (e.keyCode == 27) { 
			  hideContent();
			}
		});
		
	  })();
	</script>
</body>
</html>
