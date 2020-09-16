package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpAddServlet
 */
@WebServlet("/EmpAddServlet")
public class EmpAddServlet extends HttpServlet {
	
	List<EmpDTO> list = new ArrayList<EmpDTO>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		EmpService service;
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		try {
			int empno = Integer.parseInt(request.getParameter("empno"));
			String ename = request.getParameter("ename");
			String job = request.getParameter("job");
			int mgr = Integer.parseInt(request.getParameter("mgr"));
			String hiredate = request.getParameter("hiredate");
			double sal =  Integer.parseInt(request.getParameter("sal"));
			
			
			EmpDTO empdto = new EmpDTO(empno,ename,job,mgr,hiredate,sal,0,0);
			
			service = new EmpService();
			int insertCheck = service.insert(empdto);
			System.out.println(insertCheck);
			
			
			out.print("<html><body>");
			if(insertCheck == 0) {
				out.print("<h3>회원가입 실패</h3>");
			} else {
				out.print("<h3>회원가입 성공</h3>");
			}
			out.print("<br><a href='EmpListServlet'>목록으로</a>");
			out.print("</body></html>");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
