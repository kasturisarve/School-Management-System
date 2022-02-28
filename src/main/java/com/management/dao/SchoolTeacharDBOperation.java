package com.management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.management.entities.SchoolStudent;
import com.management.entities.SchoolTeachar;


public class SchoolTeacharDBOperation {

	DBconnection ob=new DBconnection();
	Connection conn=ob.connection();

	public boolean login(long eid,String password) throws SQLException
	{
		
		
		PreparedStatement stmt=conn.prepareStatement("select * from teachar where t_Id=? and Password=? ");
		stmt.setLong(1, eid);
		stmt.setString(2, password);
		
		ResultSet result=stmt.executeQuery();
		if(result.next())
		{
		return true;
		}
		else
		{
			return false;
		}
	}

	
	
	
	synchronized public boolean Addmission(SchoolStudent e) throws SQLException
	{
		PreparedStatement stmt=conn.prepareStatement("insert into student values(?,?,?,?,?,?,?,?)");
		stmt.setLong(1,  e.getsId());
		stmt.setString(2,e.getsName());
		
		stmt.setString(3,e.getPassword());
		stmt.setLong(4,e.getPhone());
		stmt.setString(5, e.getEmail());
		stmt.setString(6,e.getGender());
		stmt.setString(7,e.getsAddress());
		stmt.setString(8,e.getBranch());
		
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
	
	
	public boolean addmissionClose(long sId) throws SQLException
	{
		PreparedStatement stmt=conn.prepareStatement("delete from student where sId=?");
		stmt.setLong(1, sId);
		
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
	

	public ResultSet checkStudentinfo(long accId) throws SQLException
	{
		ResultSet result=null;
		try
		{
		PreparedStatement stmt=conn.prepareStatement("select * from student where sId=? ");
		stmt.setLong(1, accId);
		
		
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
	
	
	public boolean changePassword(long tid,String newPassword) throws SQLException
	{
		PreparedStatement stmt=conn.prepareStatement("update teachar set Password=? where t_Id=? ");
		stmt.setString(1,newPassword);
		stmt.setLong(2, tid);
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
