<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table>
<th>����</th><th>X10</th>
<%
for(int i = 1; i < 101; i++){ %>
	<tr><td><%=i %></td>
	<td><%=i*10 %></td></tr>
<% } %>


</table>
</body>
</html>