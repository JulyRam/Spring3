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
<h1>Insert Page</h1>

<div class="container-fluid">
	<form class="col-md-5 mx-auto" action="./bankbookInsert" method="post">
		<div class="mb-3">
		<label for="bookName" class="form-label">Book Name</label>
		<input type="text" class="form-control" name="bookName" id="bookName" placeholder="book name">
		</div>
		
		<div class="mb-3">
		<label for="bookRate" class="form-label">Book Rate</label>
		<input type="text" class="form-control" name="bookRate" id="bookRate" placeholder="book rate">
		</div>
		
		<div class="form-check">
		<input class="form-check-input" type="radio" name="bookSale" value="1" id="flexRadioDefault1">
		<label class="form-check-label" for="bookSale">
		Sale
		</label>
		</div>
		<div class="form-check">
		<input class="form-check-input" type="radio" name="bookSale" value="2" id="flexRadioDefault2" checked>
		<label class="form-check-label" for="bookSale">
		Not Sale
		</label>
		</div>
		
		<button type="submit" class="btn btn-info" name="">Add</button>
		
	</form>
</div>
</body>
</html>