<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name="";
	String value="";
	String cookie = request.getHeader("Cookie");
	if (cookie != null){
		Cookie cookies[] = request.getCookies();
		
		for(int i=0; i<cookies.length;i++){
			if(cookies[i].getName().equals("name")){
				name=cookies[i].getName();
				value=cookies[i].getValue();
			}
		}
	}
%>
현재 저장된 쿠키의 이름은 <%=name %>이며, <br>
쿠키 값은 <%=value %> 입니다.
</body>
</html>