<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Insert title here</title>
	<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
	<c:import url="../temp/boot_nav.jsp"></c:import>

	<h1>List Renewal</h1>
	
	<div class="container-fluid">
	<div class="col-md-8 mx-auto my-0">
		<table class="table table-dark table-striped">
			<tr>
				<th>Number</th><th>Name</th><th>Rate</th>
			</tr>
			<c:forEach items="${list}" var="dto"></c:forEach>
			<tr>
				<<th>${dio.bookNumber}</th>
				<<th>${dio.bookName}</th>
				<<th>${dio.bookRate}</th>
			</tr>
		</table>
	</div>
	
	</div>
</body>
</html>