<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="forwardTest1.jsp" method = "post">
	<input type ="hidden" name="forwardPage" value="forwardTest2.jsp">
	<br>이름<input type="text" name="name">
	<br>나이<input type="text" name="age">
	<br>주소<input type="text" name="address">
	<input type="submit" value="전송">
</form></body>

</html>