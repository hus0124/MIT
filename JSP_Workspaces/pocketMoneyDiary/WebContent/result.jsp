<%@ page import="java.sql.Connection"
import="java.sql.DriverManager"
import="java.sql.ResultSet"
import="java.sql.SQLException"
import="java.sql.Statement"  %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
tr,td, th {border : 1px solid}
</style>
</head>
<body>
<h3>&emsp;&emsp;&emsp;&emsp;&emsp;현 상 태</h3>
	
		
	<% String ID = "admin";
	   String PW = "1234";
	   
	   String userID = request.getParameter("id");
	   String userPW = request.getParameter("pw");
	   
	    int inMoney=0;
		int outMoney=0;
		int Money=0;
		
		String no=null;
		String date=null;
		String content=null;
		String in=null;
		String outM=null;
				
	   if(userID.equals(ID) && userPW.equals(PW)){%> 
		   
		   <table style="border:1px solid; border-collapse:collapse">
		     <tr><th>순번</th><th>일자</th><th>내용</th><th>수입</th><th>지출</th></tr>
		     
		   <% try{
				Class.forName("org.mariadb.jdbc.Driver");
				Connection conn=null;
				ResultSet rs = null;
				
				conn = DriverManager.getConnection(
						"jdbc:mariadb://localhost:3306/javadb",
						/* 나중에 쓸 때는 "jdbc:mariadb://localhost:3306/DB명" 을 입력한다. */
						"java",
						"java");
				
				System.out.println("데이터베이스에 정상적으로 연결됨.\n");
				
				Statement stmt=conn.createStatement();
				//rs = stmt.executeQuery("show databases");
				rs = stmt.executeQuery("SELECT SUM(`in`) AS \"총합\" FROM table_pocketmoneydiary");
				
				
				while(rs.next()){
					inMoney = rs.getInt(1);
					System.out.println("총수입 : " + inMoney);
				}
				
				ResultSet rs1 = stmt.executeQuery("SELECT SUM(`OUT`) AS \"총지출\" FROM table_pocketmoneydiary");
				
				while(rs1.next()){
					outMoney = rs1.getInt(1);
					System.out.println("총지출 : " + outMoney);
				}
				
				ResultSet rs2 = stmt.executeQuery("SELECT SUM(`in`)-SUM(`OUT`) AS \"총지출\" FROM table_pocketmoneydiary");
				
				while(rs2.next()){
					Money = rs2.getInt(1);
					System.out.println("현재 잔액 : " + Money);
				}
								
				ResultSet showTable = stmt.executeQuery("SELECT * FROM table_pocketmoneydiary ORDER BY NO DESC");
				
				while(showTable.next()) {
					no = showTable.getString("no");
					date = showTable.getString("date");
					content = showTable.getString("content");
					in = showTable.getString("in");
					outM = showTable.getString("out");
					System.out.println(no + date + content + in + outM); %>
				
					<tr>
						<td><%=no%></td>
						<td><%=date%></td>
						<td><%=content%></td>
						<td><%=in%></td>
						<td><%=outM%></td>
					</tr>
					
				<% }
				
				showTable = stmt.executeQuery("SELECT * FROM table_pocketmoneydiary WHERE `OUT` = (SELECT MAX(`out`) FROM table_pocketmoneydiary)");
				
				while(showTable.next()){
					no = showTable.getString("no");
					date = showTable.getString("date");
					content = showTable.getString("content");
					//in = rs3.getString("in");
					outM = showTable.getString("out");
					System.out.printf("%s, %s, %s, %s", no,date,content,outM);
				}
				
			}catch(ClassNotFoundException cnfe){
				System.out.println("디비 드라이버 로딩 실패 : " + cnfe.toString());
			}catch(SQLException se){
				System.out.println("디비 접속 실패: " + se.toString());
			}catch(Exception e){
				System.out.println("에러 이유를 모르겠어오");
				e.printStackTrace();
			}   
	%>
	</table><br>		
	총수입 : <%=inMoney %><br>
	총지출 : <%=outMoney %><br>
	현재잔액 : <%=Money %><br>
	최대지출이력 : <%=no%>&nbsp;<%=date%>&nbsp;<%=content%>&nbsp;<%=outM%><br><br>
	
	<a href = "input.jsp"><button>입력</button></a>
	
	<a href = "delete.jsp"><button>삭제</button></a>
	
	<%} else{
	%>
	<fieldset style="width:30%; font-size:30px; text-align:center">
	로그인 정보를 확인해 주세요<br><br>
	<a href = "index.html"><button style="width:180px;height:50px;font-size:20px;">다시 로그인 하기</button>
	</a></fieldset>
	<%} %>
</body>
</html>