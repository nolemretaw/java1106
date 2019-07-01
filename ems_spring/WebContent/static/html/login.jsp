<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.lanou.dao.UserDao"%>
<%@page import="jdbc.DaoFactory"%>
<%@page import="com.lanou.entity.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	Cookie[] cookies = request.getCookies();
 	String username = null;
 	String password = null;
 	if(cookies!=null){//判断是否保存密码
 		for(Cookie cookie:cookies){
 			if(cookie.getName().equals("username")){
 				username = URLDecoder.decode(cookie.getValue(), "UTF-8");
 			}
 			if(cookie.getName().equals("password")){
 				password = URLDecoder.decode(cookie.getValue(), "UTF-8");
 			}
 		}
 	}
 %>
<html>
	<head>
		<title>user login</title>
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
						用户登录
					</h1>
					<form action="loginUser.do" method="post"
					onsubmit="return checkForm()">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									账号:
								</td>
								<td valign="middle" align="left" colspan="2">
									<input type="text" class="inputgri" 
									name="username" value="<%=username!=null?username:"" %>"
									onblur="checkName()"/>
									<span id="nameMsg"></span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									密码:
								</td>
								<td valign="middle" align="left" colspan="2">
									<input type="password" class="inputgri" 
									name="password" value="<%=password!=null?password:""%>"
									onblur="checkPwd()"/>
									<span id="pwdMsg"></span>
									<span class="errorMsg">
									${sessionScope.msg}</span>
									<!-- 显示完错误消息后从session对象中移除键值对 -->
									<%
									session.removeAttribute("msg");
									%>
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
									${sessionScope.validateCodeErrorMsg}
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
							value="登录"/>
							是否记住账户密码<input type="checkbox" name="reserve" value="reserved"/>
						</p>
					</form>
				</div>
			</div>
			<%@include file="footer.jsp" %>
		</div>
		<script type="text/javascript">
			//检测账号是否为空
			function checkName() {
				var name = document.querySelectorAll(".inputgri")[0].value;
				var span = document.getElementById("nameMsg");
				if (name=="") {
					span.innerText = "账号密码不能为空";
					span.className = "errorMsg";
					return false;
				}else {
					span.innerText = "";
					return true;
				}
			}
			function checkPwd() {
				var name = document.querySelectorAll(".inputgri")[1].value;
				var span = document.getElementById("pwdMsg");
				if (name=="") {
					span.innerText = "账号密码不能为空";
					span.className = "errorMsg";
					return false;
				}else {
					span.innerText = "";
					return true;
				}
			}
			//检测表单是否可以提交
			function checkForm() {
				return checkName()&&checkPwd();
			}
		</script>
	</body>
</html>
