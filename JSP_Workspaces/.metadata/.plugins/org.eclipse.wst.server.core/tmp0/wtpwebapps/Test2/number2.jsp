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
	text-align:center;
	font-size: 350%;
}
</style>
</head>
<body>
<%
String num1 = request.getParameter("num1");
String num2 = request.getParameter("num2");
String num3 = request.getParameter("num3");
String num4 = request.getParameter("num4");
String num5 = request.getParameter("num5");


int anum1 = Integer.parseInt(num1);
int anum2 = Integer.parseInt(num2);
int anum3 = Integer.parseInt(num3);
int anum4 = Integer.parseInt(num4);
int anum5 = Integer.parseInt(num5);

int sum = 0;
sum = anum1 + anum2 + anum3 + anum4 + anum5;

%>
<p></p>
<b>다 더한 값은 <%=sum %> 입니다.</b>

</body>
</html>