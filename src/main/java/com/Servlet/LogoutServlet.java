package com.Servlet;

import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
        HttpSession session = req.getSession(false);
        if (session != null) {
            session.invalidate(); // destroy session
        }

        resp.sendRedirect("login.jsp");

	}

}
