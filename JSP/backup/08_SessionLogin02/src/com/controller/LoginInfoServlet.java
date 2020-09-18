package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginInfoServlet
 */
@WebServlet("/LoginInfoServlet")
public class LoginInfoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String userid = (String) session.getAttribute("userid");
		if(userid!=null) {
			response.sendRedirect("mypage.jsp"); //회원 정보 페이지로 이동
		} else {
			response.sendRedirect("error.jsp");//에러페이지로 이동
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
