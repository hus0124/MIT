<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>th,td {padding:10px;color:white;border-color:white;}
body{
	background-image:url(ssfwl4.png);
	background-repeat:no-repeat;
	
	}
</style>
</head>
<body>

<table border="2" style="border-collapse:collapse; text-align:center;">
<tr><th>����</th><th>X10</th></tr>
<%
String s_num = request.getParameter("num");
int tnum = Integer.parseInt(s_num);

for(int i = 1; i < tnum+1; i++){ %>
	<tr><td><%=i %></td>
	<td><%=i*10 %></td></tr>
<% } %>


</table>
</body>
</html>