<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
body{
	background-image:url(bears.jpg);
	background-repeat:no-repeat;
	background-size: 75%;
	font-size: 350%;
}
</style>
</head>

<body>
	<%
		String loginID = "aaa";
		String password = "1234";
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals(loginID) && pw.equals(password)){
	%>
	<b>&emsp;로그인에 성공하였습니다</b>
	<%} else if(!id.equals(loginID) && pw.equals(password)){ %>
	<b>&emsp;id가 틀립니다</b>
	<%} else if(id.equals(loginID) && !pw.equals(password)){ %>
	<b>&emsp;pw가 틀립니다</b>
	<%} else { %>
	<b>&emsp;id, pw가 모두 틀립니다</b>
	<%} %>
</body>
</html>