package com.Servlet;
import java.io.IOException;
import com.Dao.*;
import com.Entity.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/notes")
public class NotesServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session=req.getSession();
		User u = (User) session.getAttribute("userd");

		int userId = u.getId();   // <-- THIS is how you pass user_id

		Notes n=new Notes();
		NotesDao d=new NotesDao();
		
		String question = req.getParameter("question");
		String answear = req.getParameter("answear");
		n.setUserId(userId);
		n.setQuestion(question);
		n.setAnswear(answear);
		
		boolean r=d.addNotes(n);
		if(r)
		{
			req.setAttribute("msg", "<h4 style='color:green'>Notes Add Successfully</h4>");
			req.getRequestDispatcher("Add Note.jsp").forward(req, resp);
		}
		else
		{
			req.setAttribute("msg", "<h4 style='color:red'>Notes not  Unsuccessfully</h4>");
			req.getRequestDispatcher("Add Note.jsp").forward(req, resp);
		}
		
		
	}

}
