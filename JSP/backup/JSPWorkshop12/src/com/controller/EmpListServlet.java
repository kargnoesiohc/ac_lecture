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
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {
	
	private ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");

		EmpService service;
			
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
			
		try {
			service = new EmpService();
			list = service.selectAllEmp();
				
			out.print("<html><body>");
				
			String str = "<table border='1'>";
				   str += "<tr>";
				   str += "<th>사원번호</th>";
				   str += "<th>사원이름</th>";
				   str += "<th>월급</th>";
				   str += "<th>입사일</th>";
				   str += "<th>부서번호</th>";
				   str += "</tr>";
				   
				   
				   for(EmpDTO e: list) {
					   str +="<tr><td>"+e.getEmpno()+"</td><td>"+e.getEname()+"</td><td>"
				   +e.getSal()+"</td><td>"+e.getHiredate()+"</td><td>"+e.getDeptno()+"</td></tr>";
				   }
				   str += "</table>";
				   out.print(str);
				   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.print("입력항목을 확인해 주세요!<br/>");
		}
		out.print("</body></html>");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
