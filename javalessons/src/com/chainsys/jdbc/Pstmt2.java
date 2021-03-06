  package com.chainsys.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Pstmt2 {

	public static void main(String[] args) 
	{
		insert();
		//update();
		//delete();
		//retrieve();
		//view();

	}
	public static void insert()
	{
		try
		{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sujitha@29");  	  
			PreparedStatement stmt=con.prepareStatement("insert into std values(?,?,?)");  
			stmt.setString(1,"jaya");//1 specifies the first parameter in the query  
			stmt.setInt(2,105);
			stmt.setInt(3,60000);
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  	  
			con.close();    
			}catch(Exception e)
		    {
			  System.out.println(e);
			}  
			 
		} 
	public static void update()
	{
	 try
	  {
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sujitha@29"); 
		PreparedStatement stmt=con.prepareStatement("update std set name=? where id=?");  
		stmt.setString(1,"jaya");//1 specifies the first parameter in the query i.e. name  
		stmt.setInt(2,103);  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records updated");  
	    stmt.close();
	  }catch(Exception e)
	    {
		  System.out.println(e);
		}
	}
	public static void delete()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sujitha@29"); 
			PreparedStatement stmt=con.prepareStatement("delete from std where id=?");  
			stmt.setInt(1,105);  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records deleted");  
		}catch(Exception e)
	    {
		  System.out.println(e);
		} 
	}
	public static void retrieve()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sujitha@29"); 
			PreparedStatement stmt=con.prepareStatement("select * from std");  
			ResultSet rs=stmt.executeQuery();  
			while(rs.next())
			{  
			System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));  
			}  
		}catch(Exception e)
	    {
		  System.out.println(e);
		} 
	}
	public static void view()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sujitha@29"); 
			Statement  stmt = (Statement) con.createStatement();
		    String query = "select *from Std where id=121";
		    ResultSet myRs =((java.sql.Statement) stmt).executeQuery(query);
		        while(myRs.next())
		        {
		        System.out.println(myRs.getString(1)+" "+myRs.getInt(2)+" "+myRs.getInt(3));
		        }
		}catch(Exception e)
	    {
		  System.out.println(e);
		}
	}
		
	}
