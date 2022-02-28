package com.management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SchoolStudentDBOperation {

	DBconnection ob=new DBconnection();
	Connection conn=ob.connection();

	public boolean login(long sid,String password) throws SQLException
	{
		
		
		PreparedStatement stmt=conn.prepareStatement("select * from student where sId=? and Password=? ");
		stmt.setLong(1, sid);
		stmt.setString(2, password);
		
		ResultSet result=stmt.executeQuery();
		if(result.next()) //true or false
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	
	public ResultSet checkStudentinfo(long sId) throws SQLException
	{
		ResultSet result=null;
		try
		{
		PreparedStatement stmt=conn.prepareStatement("select * from student where sId=? ");
		stmt.setLong(1, sId);
		
		
		 result=stmt.executeQuery();
		}
		catch(Exception e)
		{
			System.out.println("wrong user id");
		}
		return result;
	}
	
	
	public ResultSet checkTimeTable(int ttId) throws SQLException
	{
		ResultSet result=null;
		try
		{
			String str="";
			switch(ttId)
			{
			case 1:
				str="Monday";
				break;
			case 2:
				str="Tuesday";
				break;
			case 3:
				str="Wednesday";
				break;
			case 4:
				str="Thursday";
				break;
			case 5:
				str="Friday";
				break;
			case 6:
				str="Saturday";
				break;
			}
	    System.out.println("****************************");	
		System.out.println("Day->"+str);
		System.out.println("****************************");
		PreparedStatement stmt=conn.prepareStatement("select * from time_table1 where day=? ");
		stmt.setString(1, str);
		
		
		 result=stmt.executeQuery();
		}
		catch(Exception e)
		{
			System.out.println("wrong user id");
		}
		return result;
	}
	
	
	
	
	
	public ResultSet marksheet(long ttId) throws SQLException
	{
		ResultSet result=null;
		try
		{
		PreparedStatement stmt=conn.prepareStatement("select * from marksheet where sId=? ");
		stmt.setLong(1, ttId);
		
		
		 result=stmt.executeQuery();
		}
		catch(Exception e)
		{
			System.out.println("wrong user id");
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	public boolean changePassword(long sid,String newPassword) throws SQLException
	{
		PreparedStatement stmt=conn.prepareStatement("update student set Password=? where sId=? ");
		stmt.setString(1,newPassword);
		stmt.setLong(2, sid);
		int affectedRows=stmt.executeUpdate();
		if(affectedRows>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public void logout() throws SQLException
	{
		conn.close();
		
	}
	
	
	
	
	
}