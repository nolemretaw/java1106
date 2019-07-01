<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@page import="com.lanou.dao.UserDao"%>
<%@page import="jdbc.DaoFactory"%>
<%@page import="com.lanou.bean.User"%>
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
								<td valign="middle" align="left" colspan="2">
									<input type="text" class="inputgri" 
									name="username" onblur="checkName()"/>
									<span id="nameMsg">
									<%=session.getAttribute("dupNameMsg")==null?"":session.getAttribute("dupNameMsg") %>
									</span>
									<% session.removeAttribute("dupNameMsg");%>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									密码:
								</td>
								<td valign="middle" align="left" colspan="2">
									<input type="password" class="inputgri" 
									name="password" onblur="checkPwd()" />
									<span id="pwdMsg"></span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									重复密码:
								</td>
								<td valign="middle" align="left" colspan="2">
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
									 <!-- 验证码输入框 -->
									<input type="text" class="inputgri" 
									name="validateCode"/>
								</td>
								<td valign="middle" align="left">
									<!-- 显示验证码图片
										src:自动向生成验证码的servlet发请求
										欺骗浏览器点击图片验证码是向不同的地址发送请求，避免将浏览器将缓存的图片取出来
										 -->
									<img src="validate.do" onclick="this.src='validate.do?'+Math.random()">
									<span class="errorMsg">
									
									<%=
									session.getAttribute("validateCodeErrorMsg")==null?
											"":session.getAttribute("validateCodeErrorMsg")
									%>
									</span>
									<!-- 移除session中验证码错误信息 -->
									<% 
										session.removeAttribute("validateCodeErrorMsg");
									%>
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
		var regex = /^\w{3,10}|[\u4e00-\u9fa5]{2,6}$/;
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
		pwdSpan.innerText = "密码不为空";
		pwdSpan.className = "errorMsg";
		return false;
		}
		
		//3、使用正则表达式检测密码格式
		var regex = /^\w{6,10}$/;
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
		if (rePwd=="") {//判断重复密码是否为空
				rePwdSpan.innerText = "";
				return false;
		}else{
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
	}
	function checkForm(){
		return checkName()&&checkPwd()&&checkRePwd();
	}
	</script>
	</body>
</html>
