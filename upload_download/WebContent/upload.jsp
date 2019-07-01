<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="up" method="post"  enctype="multipart/form-data">
		<input type="text" name="name">
		<input type="text" name="upload">
		<input type="submit" value="上传">
	</form>
	<h1>超链接下载</h1>
	<a href="C:\Users\xalo\Desktop\添加.png"></a>
	
	<h1>servlet下载</h1>
	<a href="down?filename=C:\Users\xalo\Desktop\添加.png"> </a>
</body>
</html>