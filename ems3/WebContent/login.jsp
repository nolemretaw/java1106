<%@page import="com.lanou.dao.UserDao"%>
<%@page import="jdbc.DaoFactory"%>
<%@page import="com.lanou.entity.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
								<td valign="middle" align="left">
									<input type="text" class="inputgri" 
									name="username"
									onblur="checkName()"/>
									<span id="nameMsg"></span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									密码:
								</td>
								<td valign="middle" align="left">
									<input type="password" class="inputgri" 
									name="password"
									onblur="checkName()"/>
									<span id="pwdMsg"></span>
									<span class="errorMsg"><%=application.getAttribute("msg")==
									null?"":application.getAttribute("msg")%></span>
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" 
							value="登录"/>
						</p>
					</form>
				</div>
			</div>
			<%@include file="footer.jsp" %>
		</div>
		<script type="text/javascript">
			//检测账号是否为空
			function checkname() {
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
