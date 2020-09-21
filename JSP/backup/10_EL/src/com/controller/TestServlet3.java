package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet2
 */
@WebServlet("/TestServlet2")
public class TestServlet3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("xxx", 111);
		
		
		HttpSession session = request.getSession();
		session.setAttribute("xxx", 222);
		
		ServletContext ctx = getServletContext();//application
		ctx.setAttribute("xxx", 333);
		
		RequestDispatcher dis = request.getRequestDispatcher("02_bind3.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
