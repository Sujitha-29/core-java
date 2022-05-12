package com.chainsys.jdbc;
import java.sql.*;

public class Demo
{ 
	public static void main(String args[]){  
	try
	{  
	//step1 load and register the driver class  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	//step2 create  the connection object  
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sujitha@29");  
	//step3 create the statement object 
	//provides methods to execute queries with the database
	Statement stmt=con.createStatement();  
	//step4 execute query  
	ResultSet rs=stmt.executeQuery("select * from customer");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	//step5 close the connection object  
	con.close();  
	}catch(Exception e)    
	{ 
		System.out.println(e);}  
	}  
	 
}
