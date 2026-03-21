package com.Dao;
import com.Entity.*;
import com.utility.*;
import java.sql.*;

public class UserDao 
{
	public boolean insertData(User user)
	{
		Connection con=null;
		PreparedStatement p=null;
		try 
		{
			con=DB.DBConnection();
			p=con.prepareStatement("insert into register(name,email,password,gender) values(?,?,?,?)");
			p.setString(1, user.getName());
			p.setString(2, user.getEmail());
			p.setString(3, user.getPassword());
			p.setString(4, user.getGender());
			p.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		finally
		{
			try {
				p.close();
				con.close();
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		return true;
	}//insertdata end
	
	public User checkLogin(User user)
	{
		Connection con=null;
		PreparedStatement p=null;
		User u=null;
		try 
		{
			con=DB.DBConnection();
			p=con.prepareStatement("select * from register where email=? and password=?");
			p.setString(1, user.getEmail());
			p.setString(2, user.getPassword());
			ResultSet rs=p.executeQuery();
			while(rs.next())
			{
				u=new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				u.setGender(rs.getString("gender"));
			
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		finally
		{
			try
			{
				p.close();
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		return u;
	}
	
	public String getName(User u)
	{
		Connection con=null;
		PreparedStatement p=null;
		String name=null;
		try {
			con=DB.DBConnection();
			p=con.prepareStatement("select * from register where id=?");
			p.setInt(1, u.getId());
			ResultSet rs=p.executeQuery();
			while(rs.next())
			{
				name=rs.getString("name");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			
			try
			{
				p.close();
				con.close();
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
		
		return name;
	}


}
