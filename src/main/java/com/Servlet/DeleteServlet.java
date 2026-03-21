package com.Servlet;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.*;
import com.Dao.*;
import com.Entity.*;

@WebServlet("/deleteNote")
public class DeleteServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
	{
		int id=Integer.parseInt(req.getParameter("id"));
		
		NotesDao d=new NotesDao();
		Notes n=new Notes();
		n.setNoid(id);
		
		boolean r=d.deleteNode(n);
		if(r)
		{
			resp.sendRedirect(req.getContextPath()+"/show");
		}
		else
		{
			resp.sendRedirect(req.getContextPath()+"/show");
		}
		
	}

}
