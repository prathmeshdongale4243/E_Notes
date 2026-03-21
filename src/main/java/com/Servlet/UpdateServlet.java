package com.Servlet;

import java.io.IOException;

import com.Entity.*;
import com.Dao.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/updateNote")
public class UpdateServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id=Integer.parseInt(req.getParameter("id"));
		String question=req.getParameter("question");
		String answear=req.getParameter("answear");
		Notes n=new Notes();
		n.setNoid(id);
		n.setAnswear(answear);
		n.setQuestion(question);
		
		NotesDao d=new NotesDao();
		boolean r=d.updateNote(n);
		if(r)
		{
			resp.sendRedirect(req.getContextPath()+"/show");
		}
		
		
		
		
	}

}
