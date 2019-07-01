<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@page import="com.lanou.dao.UserDao"%>
<%@page import="jdbc.DaoFactory"%>
<%@page import="com.lanou.entity.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
	<head>
		<title>user regist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="css/style.css" />
		<link rel="stylesheet" type="text/css"
			href="css/msg.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content">
				<%@include file="head.jsp" %>	
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						注册账号
					</h1>
					<form action="registUser.do" method="post"
					onsubmit="return checkForm()">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									账号:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" 
									name="username" onblur="checkName()"/>
									<span id="nameMsg"></span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									密码:
								</td>
								<td valign="middle" align="left">
									<input type="password" class="inputgri" 
									name="password" onblur="checkPwd()"/>
									<span id="pwdMsg"></span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									重复密码:
								</td>
								<td valign="middle" align="left">
									<input type="password" class="inputgri" 
									name="password"
									onblur="checkRePwd()" />
									<span id="rePwdMsg"></span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									验证码:
								</td>
								<td valign="middle" align="left">
									<!-- 图片验证码
									         邮箱验证码
									         短信验证码
									 -->
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" 
							value="注册" />
							<a href="login.jsp">已有账号</a>
						</p>
					</form>
				</div>
			</div>
			<%@include file="footer.jsp" %>
		</div>
	<script>
	//检测账号格式是否正确 6~10位数字字母下划线
	function checkName(){
		//1、定义正则表达式
		var regex = /^\w{6,10}$/;
		//2、获取用户填写的账号
		var usernameInput = document.querySelector(".inputgri");
		var username = usernameInput.value;
		var span = document.getElementById("nameMsg");
		//检测用户账号是否为空
		if(username==""){
			span.className = "errorMsg"; 
			span.innerText = "账号不能为空";
			return false;	
		}
		//3、检测是否符合正则表达式
		var result = regex.test(username);
		//将匹配结果显示在span
		if(result){
			span.className ="successMsg"; 
			span.innerText = "格式正确";
			return true;
		}else{
			span.className ="errorMsg"; 
			span.innerText = "格式错误";
			return false;
		}
	}
	//检测密码是否符合格式
	function checkPwd(){
		//1、获取密码输入框
		var pwdInput = document.querySelectorAll(".inputgri")[1];
		var pwdSpan = document.getElementById("pwdMsg");
		//2、非空验证
		var pwd = pwdInput.value;
		if(pwd==""){
		pwdInput.innerText = "密码不为空";
		pwdInput.className = "errorMsg";
		return false;
		}
		
		//3、使用正则表达式检测密码格式(6个纯数字)
		var regex = /^\d{6}$/;
		var result = regex.test(pwd);
		if(!result){
			pwdSpan.innerText = "密码格式不正确";
			pwdSpan.className="errorMsg";
			return false;
		}else{
			pwdSpan.innerText = "密码格式正确";
			pwdSpan.className="successMsg";
			return true;
		}
	}
	function checkRePwd(){
		var pwdInput = document.querySelectorAll(".inputgri")[1];
		var rePwdInput = document.querySelectorAll(".inputgri")[2];
		//2、判断两次密码是否一致
		var rePwdSpan = document.getElementById("rePwdMsg");
		var pwd = pwdInput.value;
		var rePwd = rePwdInput.value;
		if(pwd==rePwd){
			rePwdSpan.innerText = "密码通过";
			rePwdSpan.className="successMsg";
			return true;
		}else{
			rePwdSpan.innerText = "密码不一致";
			rePwdSpan.className="errorMsg";
			return false;
		}
	}
	function checkForm(){
		return checkName()&&checkPwd()&&checkRePwd();
	}
	</script>
	</body>
</html>
