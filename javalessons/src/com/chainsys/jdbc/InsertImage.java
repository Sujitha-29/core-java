package com.chainsys.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class InsertImage {

	public static void main(String[] args)
	{
		try
		{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sujitha@29");
			 PreparedStatement ps=con.prepareStatement("insert into image values(?,?)");
			 ps.setString(1,"chainsys");
			 FileInputStream fin=new FileInputStream("d:\\temp\\chainsyslogo.png");
			 ps.setBinaryStream(2, fin,fin.available());
			 int i=ps.executeUpdate();
			 System.out.println(i + "Rows affected");
			 con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
