package com.management.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public Connection connection()
	{
		Connection conn=null;	
		String databaseUrl="jdbc:mysql://localhost:3306/SchoolManagement";
		String userName="root";
		String userPassword="mysql";
		
		
			try {
				conn=DriverManager.getConnection(databaseUrl, userName, userPassword);
				
			} 
			catch (SQLException e) 
			{
				
				e.printStackTrace();  //
			}
			
		return conn;
	}
}
