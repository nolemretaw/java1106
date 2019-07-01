<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.lanou.entity.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
	</head>
	<body onload="load()">
<% 
	int countPage = (int)request.getAttribute("countPage");
%>
		<div id="wrap">
			<div id="top_content"> 
				<%@include file="head.jsp" %>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						员工列表
					</h1>
					<table class="table">
						<tr class="table_header" align="center">
							<td>
								ID
							</td>
							<td>
								姓名
							</td>
							<td>
								薪水
							</td>
							<td>
								年龄
							</td>
							<td>
								操作
							</td>
						</tr>
						<c:forEach items="${requestScope.emps}" var="e" varStatus="s">
						<tr class="row${s.count%2==0?1:2}" align="center">
							<td>
								${e.id}
							</td>
							<td>
								${e.name}
							</td>
							<td>
								${e.salary}
							</td>
							<td>
								${e.age}
							</td>
							<td>
								<a onclick="return confirm('确定删除？')" href="deleteEmp.do?id=${e.id}&pageNum=${pageNum}">删除</a>
								<a onclick="return confirm('确定修改')" href="toUpdateEmp.do?id=${e.id}&pageNum=${pageNum}">修改</a>
							</td>
						</tr>
						</c:forEach>
					</table>
					<p>
						<input type="button" class="button" 
						value="添加员工" onclick="window.location.replace('addEmp.jsp')"/>
					</p>
	<div  id="selectpage">
		<%-- <%if(pageNum>1){ %> --%>
		<c:if test="${pageNum > 1}">
		<span><button id="first" onclick="toFirst()">首页</button></span>		
		<span><button id="pre" onclick="toPre()">上一页</button></span>
		</c:if>

		<span>&nbsp第</span>
		<select onchange="change()" >
		</select><span>页&nbsp</span>
		
		<c:if test="${pageNum < countPage }">
		<span><button id="next" onclick="toNext()">下一页</button></span>
		<span><button id="final" onclick="toFinal()">末页</button></span>
		</c:if>
		
		<script src="js/jquery-1.4.3.js" type="js/javascript"></script>
		<script type="text/javascript">
		/* 动态设置页码数组，传入总页数以设定数组 
			参数:总页数=总条数%页容==0？总条数/页容:总条数/页容+1
		*/
		var countPage = ${countPage};
		var pageNum = ${pageNum};
		var $select = $("select")[0];
		function load() {
	
			for (var i = 0; i < countPage; i++) {
				//将总页码传入
				var $op = $("<option>"+(i+1)+"</option>");
				$op.click(function () {
					window.location.href="listEmp.do?pageNum="+(i+1);
				});
				if (i+1==pageNum) {
				$op.selected=true;				
				}
				$op.appendTo($select);
			}
		}
		function change(){//获取页码，并提交给分页查询
			var pageNum = select.selectedIndex+1;
			window.location.href="listEmp.do?pageNum="+pageNum;
		}
		</script>
	</div>
				</div>
			</div>
			<%@include file="footer.jsp" %>
		</div>
	</body>
</html>
