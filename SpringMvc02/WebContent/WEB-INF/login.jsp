<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>登陆页面</h1>
	<form action="login2.do" method="post">
		<fieldset>
			<legend>用户登录</legend>
			账号:<input type="text" name="username"/><br/>
			密码:<input type="password" name="password"/><br/>
			年龄:<input type="text" name="age"><br/>
			日期:<input type="date" name="birth"><br/>
			<input type="submit" value="登录"/>
		</fieldset>
	</form>
	
	
</body>
</html>