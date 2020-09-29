package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpRetrieveServlet
 */
@WebServlet("/EmpRetrieveServlet")
public class EmpRetrieveServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		int empno = Integer.parseInt(request.getParameter("empno"));
		
		EmpService service = new EmpService();
		EmpDTO dto  = service.selectEmp(empno);
		
		request.setAttribute("dto", dto);
		
		RequestDispatcher dis = request.getRequestDispatcher("retrieve.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
