<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Review</title>
</head>
<body>

	<h1>새로운 리뷰 작성</h1>
	<form action="addok" method="post">
		<table>
			<tr><td> 카페 이름 </td><td><input type="text" name="cafe"/></td></tr>
			<tr><td> 음료 이름 </td><td><input type="text" name="drink"/></td></tr>
			<tr><td> 음료 가격 </td><td><input type="text" name="price"/></td></tr>
			<tr><td> 음료 별점 </td><td><input type="text" name="star"/></td></tr>
			<tr><td> 음료 사진 </td><td><input type="file" name="photo"/></td></tr>
			<tr><td> 음료 리뷰 </td><td><textarea cols="50" rows="5" name="content"></textarea></td></tr>
		</table>
		<button type = "button" onclick = "location.href='list'">목록 보기</button>
		<button type = "submit">등록하기</button>
	</form>
</body>
</html>