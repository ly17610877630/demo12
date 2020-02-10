<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/public/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath }/public/js/jquery.min.1.12.4.js"></script>
<script src="${pageContext.request.contextPath }/public/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath }/public/css/index.css"  rel="stylesheet">
</head>
<body>
	<h1 align="center"><span style="font-family: cursive;">能源公司</span></h1>
	<table class="table table-hover">
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>资金总数</td>
			<td>内容</td>
			<td>管理者</td>
			<td>关联id</td>
		</tr>
		<c:forEach items="${info.list}" var="li">
			<tr>
				<td>${li.id}</td>
				<td>${li.name}</td>
				<td>${li.amout}</td>
				<td>${li.manger}</td>
				<td>${li.content}</td>
				<td>${li.did}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100" align="center">
				<jsp:include page="/WEB-INF/pages2.jsp"></jsp:include>
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	function goPage(page) {
		location.href="${pageContext.request.contextPath}/selectPlan?page="+page;
	}
</script>
</html>