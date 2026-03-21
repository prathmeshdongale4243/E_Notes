package com.Servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.Dao.*;
import com.Entity.*;

@WebServlet("/editNote")
public class EditServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		int id=Integer.parseInt(req.getParameter("id"));
		Notes n=new Notes();
		n.setNoid(id);
		
		NotesDao d=new NotesDao();
		Notes n1=d.editNote(n);
		req.setAttribute("notes", n1);
		req.getRequestDispatcher("Update.jsp").forward(req, resp);
			
		
		
	}
}
