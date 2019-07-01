<%@page pageEncoding="UTF-8"%>
<%
String name =(String)session.getAttribute("username");%>
<div id="header">
	<div id="rightheader">
		<p >
			<span id="datetime"></span>
			<br/>
			<!-- 显示当前登录用户名 -->
			<%if(name!=null){%>
			【<%=name%>】
			<!-- 销毁session，重定向到登陆界面 -->
			【<a href="logoutUser.do">退出</a>】
			<%}%>
		</p>
	</div>
	<div id="topheader">
		<h1 id="title">
			<a href="#">蓝鸥管理系统</a>
		</h1>
	</div>
	<div id="navigation">
	</div>
</div>
<script>
	//获取当前时间年月日时分秒
	function getTime(){
	var date = new Date();
	var year = date.getFullYear();
	var month = date.getMonth()+1;
	var day = date.getDate();
	var hour = date.getHours();
	var minute = date.getMinutes();
	var second = date.getSeconds();
	return year+"/"+month+"/"+day+" "+ hour+":"+minute+":"+second;
		
	}
	//定时器
	var span = document.getElementById("datetime");
	window.setInterval(function(){
		span.innerHTML = getTime();
		
	},1000);
</script>