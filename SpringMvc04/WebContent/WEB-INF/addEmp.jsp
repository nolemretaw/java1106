<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addEmp.do" method="post">
		<fieldset>
			<legend>添加员工</legend>
			姓名:<input type="text" name="name"/><br/>
			薪水:<input type="text" name="salary"/><br/>
			年龄:<input type="text" name="age"/><br/>
			生日:<input type="date" name="birth"><br/>
			<input type="submit" name="添加"/><br/>
		</fieldset>
	
	</form>
</body>
</html>