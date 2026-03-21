package com.Servlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

import com.Dao.*;
import com.Entity.*;

@WebServlet("/check")
public class LoginServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		User u =new User();
		u.setEmail(email);
		u.setPassword(password);
		
		UserDao d=new UserDao();
		User user=d.checkLogin(u);
		if(user!=null)
		{
			HttpSession session=req.getSession();
			session.setAttribute("userd", user);
			resp.sendRedirect(req.getContextPath() +"/home");
		}
		else
		{
			req.setAttribute("msg", "<h4 style='color:red'>Login Unsuccessfully</h4>");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
		
		


	}
	

}
