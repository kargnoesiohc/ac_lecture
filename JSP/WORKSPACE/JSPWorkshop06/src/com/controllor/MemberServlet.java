package com.controllor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String ssn = request.getParameter("ssn");
		String hobby [] = request.getParameterValues("hobby");
		String marry [] = request.getParameterValues("marry");
		
		String gender = (ssn.substring(7,8)).equals("1")? "남자":"여자";
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String mesg = "이름은 "+username+"<br> 성별은 "+gender+"<br> 취미는 ";
		for(String h: hobby) {
			mesg += h+" ";
		}
		
		for(String m: marry) {
			mesg += "<br> 결혼상태는 "+m+"입니다.";
		}
		out.print(mesg);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
