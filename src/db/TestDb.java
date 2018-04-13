package db;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDb {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//register driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//get Connection(url,un,psw)
		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb_2pm", "root", "");
		
		//insert sql
		
//		String sql = "insert into user(username,password) values('gita','@123')";
//		
//		Statement stm = con.createStatement();
//		stm.execute(sql);
		
		//====================select sql=====================
		
//		String sql = "select * from user";
//		
//		Statement stm = con.createStatement();
//		
//		  ResultSet rs  = stm.executeQuery(sql);
//		   
//		  while(rs.next()){
//			  
//			  System.out.println("Id  ="+rs.getInt("id"));
//			  System.out.println("UserName ="+rs.getString("username"));
//			  System.out.println("Password  ="+rs.getString("password"));
//			  
//			  System.out.println("==================================");
//			  
//		  }
		
		//============================delete sql ====================================
		
//		String sql = "delete from user where id = '1'";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
		
		
		//===================update sql=======================================
		
		String sql = "update user set username ='Hari', password = '1111'  where id = '2' ";
		
		Statement stm = con.createStatement();
		stm.execute(sql);
		
		
	}

}
