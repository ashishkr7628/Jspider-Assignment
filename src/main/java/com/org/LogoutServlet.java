package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub

	Cookie[] cookies = req.getCookies();

	PrintWriter out = resp.getWriter();
	resp.setContentType("text/html");
	for(Cookie c:cookies) {
		
		c.setMaxAge(0);
		
		resp.addCookie(c);
	}
	
	RequestDispatcher rd = req.getRequestDispatcher("login.html");
	rd.forward(req, resp);

	
}
}
