<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="fatie.do" method="post">
		请发帖: <textarea name="content">
		        </textarea> <br/>
		        <%=
		        
		        session.getAttribute("errorMsg")==null?"":
		        session.getAttribute("errorMsg")
		        %>
		        
		        <%session.removeAttribute("errorMsg");%>
		        
		<input type="submit" value="发帖"/>
	</form>
</body>
</html>



