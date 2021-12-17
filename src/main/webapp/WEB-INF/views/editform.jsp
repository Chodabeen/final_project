<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Edit Post</title>
</head>
<body>
	<h1>리뷰 수정</h1>
	
	<form:form commandName="boardVO" method="POST" action="../editok">
		<form:hidden path="seq"/>
		<table id="edit">
			<tr><td> 카페 이름 </td><td><form:input path="cafe"/></td></tr>
			<tr><td> 카페 음료 </td><td><form:input path="drink"/></td></tr>
			<tr><td> 음료 가격 </td><td><form:input path="price"/></td></tr>
			<tr><td> 음료 별점 </td><td><form:input path="star"/></td></tr>
			<tr><td> 음료 사진 </td><td><form:input path="photo"/></td></tr>
			<tr><td> 음료 리뷰 </td><td><form:input path="review"/></td></tr>
			<tr><td> 리뷰 날짜 </td><td><form:input path="date"/></td></tr>
		</table>
		
		<input type="submit" value="수정하기"/>
		<input type="button" value="취소하기" onclick="history.back()">
	</form:form>
</body>
</html>