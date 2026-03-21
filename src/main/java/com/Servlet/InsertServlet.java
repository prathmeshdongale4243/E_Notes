package com.Servlet;
import java.io.IOException;
import com.Entity.*;
import com.Dao.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet("/save")
public class InsertServlet extends HttpServlet 
{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name=req.getParameter("username");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String gender=req.getParameter("gender");
		
		User u=new User();
		u.setName(name);
		u.setEmail(email);
		u.setPassword(password);
		u.setGender(gender);
		resp.setContentType("text/html");
		UserDao d=new UserDao();
		boolean r=d.insertData(u);
		if(r)
		{
			req.setAttribute("msg", "<h4 style='color:green;'>Register Successfully</h4>");
			
			resp.sendRedirect("login.jsp");
		}
		else
		{
			req.setAttribute("msg", "<h4 style='color:red'>Register Unsuccessfully</h4>");
			req.getRequestDispatcher("register.jsp").forward(req, resp);
		}
		
		
	}
}
