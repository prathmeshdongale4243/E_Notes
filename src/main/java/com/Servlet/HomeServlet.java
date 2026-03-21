package com.Servlet;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import com.Dao.*;
import com.Entity.*;
import java.io.IOException;
import java.util.*;
@WebServlet("/home")
public class HomeServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Notes n=new Notes();
		NotesDao d=new NotesDao();
		ArrayList<Notes> al=d.showNotes();
		for(Notes n1:al)
		{
			System.out.print(n1.getNoid());
		}
		req.setAttribute("al", al);
		req.getRequestDispatcher("Home.jsp").forward(req, resp);
	}

}
