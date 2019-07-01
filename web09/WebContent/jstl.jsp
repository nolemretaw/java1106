<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		border:1px solid black;
	}
	table td{
		border:1px solid black;
		width:120px;
		text-align:center;
	}
	.row1{
		background:orange;
	}
	.row2{
		background:yellow;
	}
</style>
</head>
<body>
	姓名:${user.name}						<br/>
	性别:${user.sex=="男"?"男人":"女人"}		<br/>
	<!-- 使用jstl标签判断性别
		test:判断，结果为true才会显示标签中间内容
		var:临时保存test的结果值(true/false)
		scope:将这个临时变量保存在哪个域对象(默认是page)
	 -->
	1、if的条件判断							<br/>
	<!-- 使用jstl标签来判断性别 -->
	性别:<c:if test="${user.sex=='男'}"
			var="rs" scope="request">
			男人
		</c:if>
		<c:if test="${!rs}">
			女人
		</c:if>
		
		<hr/>
	2、choose条件判断
		年龄:${user.age}					<br/>
		年龄阶段:
			<c:choose>
				<c:when test="${user.age<10 }">少年</c:when>
				<c:when test="${user.age<20 }">青年</c:when>
				<c:when test="${user.age<30 }">壮年</c:when>
				<c:otherwise>老年</c:otherwise>
			</c:choose>
		<hr/>
	
	3、forEach迭代	<br/>
		<!--
		items: 从域对象中取出要遍历的集合或数组
		var:每遍历出一个对象，将赋给变量u,存入pageContext
		begin:从第几个元素开始遍历
		end:遍历到第几个元素为止
		step:每几个遍历一次
		varStatus:保存当前遍历行的状态
		index:当前元素在源集合中的下标
		count:遍历中的第几个元素
		 -->
		<c:forEach items="${users}" var="u"
				begin="0" step="2" varStatus="s">
			<p>
				编号:${u.id}
				姓名:${u.name}
				年龄:${u.age}
				性别:${u.sex}
				爱好:${u.hobbies[0]}
				下标:${s.index}
				个数:${s.count}
			</p>
		</c:forEach>
		
		<hr/>
		
		<table>
			<tr>
				<td>编号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>年龄</td>
				<td>爱好</td>
			</tr>
			<c:forEach items="${users}" var="u" varStatus="s">
				<tr class="row${s.count%2==0?1:2}">
					<td>${u.id}</td>
					<td>${u.name}</td>
					<td>
						<c:if test="${u.sex=='男'}" var="rs">
							男人
						</c:if>
						<c:if test="${!rs }">
							女人
						</c:if>
					</td>
					<td>
						<c:choose>
							<c:when test="${u.age }<20">少年</c:when>
							<c:when test="${u.age }<30">壮年</c:when>
							<c:otherwise>老年</c:otherwise>
						</c:choose>
					</td>
					<td>
						<c:forEach items="${u.hobbies}" var="h">
							${h} &nbsp
						</c:forEach>
					</td>
				</tr>
			</c:forEach>
		</table>
	
</body>
</html>