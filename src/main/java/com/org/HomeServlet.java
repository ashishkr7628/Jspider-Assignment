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

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[] cookies = req.getCookies();
	

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		if(cookies!=null) {

			out.println("<html>" + "<body style='background-color:grey'>"
					+ "<div style ='background-color:black; width:100%; height: 5%; color:white' ; >"
					+ "<span style='  margin-left: 50px; color:white'><a href='mobile'>Mobile</a></span>"
					+ "<span style=' margin-left: 50px; color:white'><a href='laptop'>Laptop</a></span>"
					+ "<span style='margin-left: 50px; color:white '><a href='logout'>Logout</a></span>" + "</div>" + ""
					+ "<img src='h1.jpg' style='height:30%; width:20% ;margin-top:10%;  margin-left: 50px;' ></img>"
					+ "<img src='h2.jpg' style='height:30%; width:20% ;margin-top:10%;  margin-left: 50px;' ></img>"
					+ "<img src='h3.jpg' style='height:30%; width:20% ;margin-top:10% ;  margin-left: 50px;' ></img>"
					+ "</body>" + "</html>" + "" + "" + "" + "" + "");
	
	}
		else {
			resp.sendRedirect("login.html");
			
		}

	}
	}

