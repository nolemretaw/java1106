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
									邮箱:
								</td>
								<td valign="middle" align="left">
									<input type="email" class="inputgri" 
									name="email"/>
								</td>
								<td valign="middle" align="left">
									<input type="button" 
											value="免费获取邮箱动态码"/>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									邮箱动态码:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" 
									name="emailValidateCode"/>
								</td>
								<td valign="middle" align="left">
									<span class="errorMsg">${emailCodeError}</span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									账号:
								</td>
								<td valign="middle" align="left" colspan="2">
									<input type="text" class="inputgri" 
									id="username"
									name="username" onblur="checkName()"/>
									<span id="nameMsg"></span>
									<span id="nameExistsMsg"></span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									密码:
								</td>
								<td valign="middle" align="left" colspan="2">
									<input type="password" class="inputgri" 
									id="password"
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
									id="repeat"
									name="password"
									onblur="checkRePwd()" />
									<span id="rePwdMsg"></span>
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
	<script src="js/jquery-1.4.3.js"></script>
	<script>
	/*
		给按钮绑定点击事件，点击后获取用户填写的邮箱，以Ajax方式发送给服务器
	*/
	$(":button").click(function () {
		var email = $("input[type='email']").val();
		/* console.log(email); */
		$.ajax({
			type:"POST",
			url:"emailValidateCode.do",
			data:"email="+email,
			success:function(data){
				data = data.trim();
				console.log(data);
				if(data=="ok"){
					$(":button").attr("disabled",true);
					var times = 60;
					var task = window.setInterval(function(){
						if (times<=0) {
							$(":button").attr("disabled",false);
							$(":button").val("重新发送");
							window.clearInterval(task);
							return;							
						}
						$(":button").val("重新发送("+(times--)+")");
					},1000);
				}
			}
		});
	});
	
	
	//检测账号格式是否正确 6~10位数字字母下划线
	function checkName(){
		var checkName = true;
		//1、定义正则表达式
		var regex = /^\w{3,10}|[\u4e00-\u9fa5]{2,6}$/;
		//2、获取用户填写的账号
		var usernameInput = document.getElementById("username");
		var username = usernameInput.value;
		var span = document.getElementById("nameMsg");
		//检测用户账号是否为空
		if(username==""){
			span.className = "errorMsg"; 
			span.innerText = "账号不能为空";
			checkName= false;	
		}
		//3、检测是否符合正则表达式
		var result = regex.test(username);
		//将匹配结果显示在span
		if(result){
			span.className ="successMsg"; 
			span.innerText = "格式正确";
			//将用户名发送给服务器，检测是否存在
			$.ajax({
				type:"POST",
				url:"checkName.do",
				data:"username="+username,
				success:function(data){
					data = data.trim();
					console.log(data);
					if (data=="true") {//账号存在
						$("#nameExistsMsg").html("账号已存在，换一个");
						$("#nameExistsMsg").removeClass("successMsg");
						$("#nameExistsMsg").addClass("errorMsg");
						checkName=false;
					}else if (data=="false") {//账号不存在
						$("#nameExistsMsg").html("账号可以使用");
						$("#nameExistsMsg").removeClass("errorMsg");
						$("#nameExistsMsg").addClass("successMsg");
						checkName=true;
					}
				}
			})
		}else{
			span.className ="errorMsg"; 
			span.innerText = "格式错误";
			checkName=false;
		}
		return checkName;
	}
	//检测密码是否符合格式
	function checkPwd(){
		//1、获取密码输入框
		var pwdInput = document.getElementById("password");
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
		var pwdInput = document.getElementById("repeat");
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
