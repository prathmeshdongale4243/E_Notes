package com.Servlet;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.*;

import java.io.IOException;
import java.util.*;
import com.Dao.*;
import com.Entity.*;

@WebServlet("/show")
public class ShowServlet extends HttpServlet
{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	HttpSession session=req.getSession();
	NotesDao d=new NotesDao();
	User u=new User();
	u=(User) session.getAttribute("userd");
	ArrayList<Notes> al=d.showNotes(u);
	req.setAttribute("al", al);
	req.getRequestDispatcher("Show Notes.jsp").forward(req, resp);
	
}
}
