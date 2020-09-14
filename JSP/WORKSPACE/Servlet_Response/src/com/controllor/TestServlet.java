package com.controllor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//0. 사용자 요청 데이터 뽑기
		//1. 사용자 요청 데이터 처리
		//2. 요청 완료 후 응답 처리
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8"); //2-1. HTML Content Type 지정
		PrintWriter out = response.getWriter(); //2-2. 자바에서 웹으로 데이터 출력
		out.print("<html><body>");//2-3. 응답할 html 코드 작성
		out.print("<h1>서블릿 응답처리 실습<h1>");
		out.print("<p>Hello World<p>");
		out.print("</html></body>");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
