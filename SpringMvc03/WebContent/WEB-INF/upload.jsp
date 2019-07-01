<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<style>
		img{
		border:2px black solid;
			width:200px;
			height: auto;
		}
	</style>
</head>
<body>

	<h2>文件上传</h2>
	<form action="upload.do" method="post"
		enctype="multipart/form-data">
		文件:<input type="file" name="uploadFile"/><br/>
		<input type="submit" value="上传"><br/>
	</form>
	
	<hr/>
	<!-- 判断上传的文件是否为图片 -->
	<c:if test="${!empty isImg }">
		<h3>显示图片</h3>
		${filePath}<br/>
		<img alt="图片" src="<%=request.getContextPath()%>${filePath}">
	</c:if>
	
	<!-- 下载 -->
	<a href="<%=request.getContextPath()%>/download.do?fileName=${filePath}">
	下载
	</a>
</body>
</html>