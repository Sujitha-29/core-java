package com.chainsys.jdbc;
import java.sql.*; 


class FetchRecord
{  
public static void main(String args[])throws Exception
{ 
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sujitha@29");  
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
		ResultSet rs=stmt.executeQuery("select * from std");    
		//getting the record of 3rd row  
		rs.absolute(2);  
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));   
		con.close();  
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
}  