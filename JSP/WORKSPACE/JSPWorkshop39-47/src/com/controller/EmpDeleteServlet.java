package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.EmpService;

/**
 * Servlet implementation class EmpDeleteServlet
 */
@WebServlet("/EmpDeleteServlet")
public class EmpDeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int empno = Integer.parseInt(request.getParameter("empno"));
		System.out.println("삭제할 사원번호 : "+empno);
		EmpService service = new EmpService();
		service.deleteEmp(empno);
		
		response.sendRedirect("EmpListServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
