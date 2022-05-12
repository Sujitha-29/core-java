package com.chainsys.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.*;
public class pstmt {

	public static void main(String[] args) 
	{
		//insert();
		 update();
	}
	
     public static void insert()
	  {
	    try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sujitha@29");
			PreparedStatement stmt=con.prepareStatement("insert into students values(?,?,?,?,?)");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter students roll_no,  s_name,  s_dept,  year,mark");
            int rn=sc.nextInt();
            String name=sc.next();
            String dept=sc.next();
            int year=sc.nextInt();
            int mark=sc.nextInt();
            stmt.setInt(1,rn);
            stmt.setString(2,name);
            stmt.setString(3,dept);
            stmt.setInt(4,year);
            stmt.setInt(5,mark);
            int rows=stmt.executeUpdate();
            System.out.println(rows + "Updated.....");
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
 			 PreparedStatement stmt=con.prepareStatement("update students set dept=? where roll_no=? values(?,?,?,?,?)");
 			 Scanner sc=new Scanner(System.in);
             System.out.println("Enter students roll_no,s_dept,");
             int rn=sc.nextInt();
 			 String dept=sc.next();
 			 stmt.setInt(1,rn);  
 			 stmt.setString(3,dept);//1 specifies the first parameter in the query i.e. name  
 			 int i=stmt.executeUpdate();  
 			 System.out.println(i+" records updated");   
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
 			 PreparedStatement stmt=con.prepareStatement("delete from emp where id=?");  
 			 stmt.setInt(1,101);  
 			 int i=stmt.executeUpdate();  
 			 System.out.println(i+" records deleted");  
    	 }catch(Exception e)
    	 {
    		 
    	 }

    	 
     }

}
