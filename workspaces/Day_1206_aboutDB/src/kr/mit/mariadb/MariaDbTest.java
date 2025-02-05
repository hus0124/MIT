package kr.mit.mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MariaDbTest {

	public static void main(String[] args) throws ClassNotFoundException {
		try{
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn=null;
			ResultSet rs = null;
			
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306",
					/* 나중에 쓸 때는 "jdbc:mariadb://localhost:3306/DB명" 을 입력한다. */
					"root",
					"mariadb");
			
			java.sql.Statement stmt=conn.createStatement();
			rs = stmt.executeQuery("show databases");
			
			while(rs.next()){
				String str = rs.getNString(1);
				System.out.println(str);
			}
		}catch(SQLException se){
			System.out.println("SQL 에러 발생 ");
			se.printStackTrace();
		}

	}

}
