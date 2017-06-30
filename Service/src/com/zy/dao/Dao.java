package com.zy.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Dao {
	
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","ydcyzz");
	Statement stmt = (Statement) conn.createStatement();
	//String sql = "insert into student values('100','li','123')"; 
			//stmt.execute(sql);
			String sql="select * from student";
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()){
				System.out.print(rs.getInt("id")+"-");
				System.out.print(rs.getString("password")+"-");
				System.out.print(rs.getString("name")+"-");
			}
}
}
