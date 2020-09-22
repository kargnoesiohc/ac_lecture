package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpUpdateServlet
 */
@WebServlet("/EmpUpdateServlet")
public class EmpUpdateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int empno = Integer.parseInt(request.getParameter("empno"));
		String job = request.getParameter("job");
		int sal = Integer.parseInt(request.getParameter("sal"));
		
//		EmpDTO dto = new EmpDTO(empno, null, job, 0, null, sal, 0,0);
		
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(empno);
		dto.setJob(job);
		dto.setSal(sal);
		
		EmpService service = new EmpService();
		service.updateEmp(dto);
		
		response.sendRedirect("EmpListServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
