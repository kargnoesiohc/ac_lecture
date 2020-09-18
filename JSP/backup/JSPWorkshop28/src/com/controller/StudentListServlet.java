package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.PageDTO;
import com.dto.StudentDTO;
import com.service.StudentService;


@WebServlet("/StudentListServlet")
public class StudentListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String curPage = request.getParameter("curPage");
		if(curPage == null) {
			curPage = "1";
		}
		
		StudentService service = new StudentService();
		PageDTO pDTO = service.selectAllPageStudent(Integer.parseInt(curPage));
 		
		List<StudentDTO> list = pDTO.getList();
		int perPage = pDTO.getPerPage();
		int totalCount = pDTO.getTotalCount();
		int totalPage = totalCount/perPage;
		if(totalCount%perPage != 0) totalPage++;
		System.out.println("totalCount -> " + totalCount);
		System.out.println("totalPage -> " + totalPage);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		String str = "<table border='1'>";
		   str += "<tr>";
		   str += "<th>학번</th>";
		   str += "<th>이름</th>";
		   str += "<th>주민번호</th>";
		   str += "<th>주소</th>";
		   str += "<th>입학년도</th>";
		   str += "<th>휴학여부</th>";
		   str += "</tr>";
		for(StudentDTO dto:list) {
			 str += "<tr>";
			   str += "<td>"+dto.getStuNo()+"</td>";
			   str += "<td>"+dto.getStuName()+"</td>";
			   str += "<td>"+dto.getStuSsn()+"</td>";
			   str += "<td>"+dto.getStuAddress()+"</td>";
			   str += "<td>"+dto.getEntDate()+"</td>";
			   str += "<td>"+dto.getAbsYn()+"</td>";
			   str += "</tr>";
		  }
		
		   str += "<tr><td colspan='6'>";
		for(int i=1; i<= totalPage; i++) {
			if(i==Integer.parseInt(curPage)) {
				str += "<span style='color:red'>"+i+"</span>&nbsp;&nbsp;";
			}else {
				str += "<a style='text-decoration: none' href='StudentListServlet?curPage="+i+"'>"+i+"</a>&nbsp;&nbsp;";
			}
		}
		 str += "</td></tr>";
		str += "</table>";
		out.print(str);
		out.print("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
