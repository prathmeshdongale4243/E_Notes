package com.utility;
import java.sql.*;
public class DB 
{
	private static final String url="jdbc:mysql://localhost:3306/enotes";
	private static final String username="root";
	private static final String password="Prathmesh@11";
	
	public static Connection DBConnection()
	{
		Connection con=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return con;
	}

}
