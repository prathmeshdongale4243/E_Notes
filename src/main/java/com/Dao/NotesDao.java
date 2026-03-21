package com.Dao;
import java.sql.*;
import com.Entity.*;
import com.utility.DB;

import java.util.*;
public class NotesDao 
{

	public boolean addNotes(Notes n)
	{
		Connection con=null;
		PreparedStatement p=null;
		try
		{
			con=DB.DBConnection();
			p=con.prepareStatement("insert into notes(userid,answear,question) values(?,?,?)");
			p.setInt(1, n.getUserId());
			p.setString(2, n.getAnswear());
			p.setString(3,n.getQuestion());
		    p.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
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
		return true;
	}//addNotes end
	
	public ArrayList<Notes> showNotes()
	{
		ArrayList<Notes> al=new ArrayList<>();
		Connection con=null;
		PreparedStatement p=null;
		try
		{
			con=DB.DBConnection();
			p=con.prepareStatement("select * from notes");
			ResultSet rs=p.executeQuery();
			while(rs.next())
			{
				Notes n=new Notes();
				n.setAnswear(rs.getString("answear"));
				n.setQuestion(rs.getString("question"));
				n.setNoid(rs.getInt("noid"));
				n.setUserId(rs.getInt("userid"));
				n.setCreatedat(rs.getString("created_at"));
				al.add(n);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				p.close();
				con.close();
			}
			catch(Exception e)
			{
				System.out.println();
			}
		}
		
		return al;
	}
	
	
	public ArrayList<Notes> showNotes(User u)
	{
		Connection con=null;
		PreparedStatement p=null;
		ArrayList<Notes> al=new ArrayList<>();
		
		try 
		{
			con=DB.DBConnection();
			p=con.prepareStatement("select * from notes where userid=?");
			p.setInt(1,u.getId());
			ResultSet rs=p.executeQuery();
			while(rs.next())
			{
				Notes n=new Notes();
				n.setNoid(rs.getInt("noid"));
				n.setAnswear(rs.getString("answear"));
				n.setQuestion(rs.getString("question"));
				al.add(n);
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
		return al;
	}//showNotes end
	
	public boolean deleteNode(Notes n)
	{
		Connection con=null;
		PreparedStatement p=null;
		try
		{
			con=DB.DBConnection();
			p=con.prepareStatement("delete from notes where noid=?");
			p.setInt(1,n.getNoid());
			p.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
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
		
		
		
		
		return true;
	}//deleteNode end
	
	public Notes editNote(Notes n)
	{
		Notes n1=new Notes();
		Connection con=null;
		PreparedStatement p=null;
		try
		{
			con=DB.DBConnection();
			p=con.prepareStatement("select * from notes where noid=?");
			p.setInt(1, n.getNoid());
			ResultSet rs=p.executeQuery();
			if(rs.next())
			{
				n1.setAnswear(rs.getString("answear"));
				n1.setQuestion(rs.getString("question"));
				n1.setNoid(rs.getInt("noid"));
				
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
		
		return n1;
	}//editNote end
	
	public boolean updateNote(Notes n)
	{
		Connection con=null;
		PreparedStatement p=null;
		try
		{
			con=DB.DBConnection();
			p=con.prepareStatement("update notes set answear=?,question=? where noid=?");
			p.setString(1, n.getAnswear());
			p.setString(2,n.getQuestion());
			p.setInt(3, n.getNoid());
			p.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
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
		
		return true;
	}
}
