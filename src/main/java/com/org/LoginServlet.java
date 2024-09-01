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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String userEmail = req.getParameter("email");
		String userPassword = req.getParameter("password");

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		if (userEmail.equals("ashish@gmail.com") && userPassword.equals("ashish")) {

			Cookie cookie = new Cookie("msg", "ashish");

			resp.addCookie(cookie);

			RequestDispatcher rd = req.getRequestDispatcher("home");
			rd.forward(req, resp);

		}

		else {

			out.println("<h1 style='color:red; text-align:center'>Invalid Credentials</h1>");

			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);

		}

	}
}
