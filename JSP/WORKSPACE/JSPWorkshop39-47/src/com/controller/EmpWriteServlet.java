package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpWriteServlet
 */
@WebServlet("/EmpWriteServlet")
public class EmpWriteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int empno = Integer.parseInt(request.getParameter("empno"));
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		int mgr = Integer.parseInt(request.getParameter("mgr"));
		int sal = Integer.parseInt(request.getParameter("sal"));
		
//		EmpDTO dto = new EmpDTO(empno, ename, job, mgr, null, sal, 0, 0);
		
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(empno);
		dto.setEname(ename);
		dto.setJob(job);
		dto.setMgr(mgr);
		dto.setSal(sal);
		
		EmpService service = new EmpService();
		service.insertEmp(dto);
		
		response.sendRedirect("EmpListServlet"); //데이터를 넘겨줄 것이 없기때문에 EmpListServlet만 호출
				
		
		
		
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
