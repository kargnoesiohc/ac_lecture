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

import com.dto.TB_StuDTO;
import com.service.TB_StuService;

/**
 * Servlet implementation class TB_StuServlet
 */
@WebServlet("/TB_StuServlet")
public class TB_StuServlet extends HttpServlet {
	
	private List<TB_StuDTO> list = new ArrayList<TB_StuDTO>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		TB_StuService service;
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		
		try {
			service = new TB_StuService();
			list = service.selectSsnHideStu();
			
			out.print("<html><body>");
			String str = "<table border='1'>";
		   	   str += "<tr>";
		       str += "<th>학번</th>";
		       str += "<th>학과번호</th>";
		       str += "<th>이름</th>";
		       str += "<th>주민번호</th>";
		       str += "<th>주소</th>";
		       str += "<th>입학년도</th>";
		       str += "<th>휴학여부</th>";
		       str += "</tr>";
		       
		       for(TB_StuDTO stu: list) {
		    	   str += "<tr><td>"+stu.getStudent_no()+"</td><td>"+stu.getDepartment_no()+
		    			   "</td><td>"+stu.getStudent_name()+"</td><td>";
		    	   str += stu.getStudent_ssn().replaceAll(stu.getStudent_ssn().substring(8,14), "******");
		    	   str += "</td><td>"+stu.getStudent_address()+"</td><td>"+stu.getEdate()+"</td><td>"+stu.getAbsence_yn()+"</td></tr>";
		       }
		       str += "</table>";
		       out.print(str);
		       out.print("</body></html>");
		  
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			out.print("입력항목을 확인해 주세요!<br/>");
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
