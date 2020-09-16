package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductRemoveServlet
 */
@WebServlet("/ProductRemoveServlet")
public class ProductRemoveServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String pid = request.getParameter("pid");
		HttpSession session = request.getSession();
		session.removeAttribute(pid); //key값에 해당하는 session 삭제
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("<h2>"+pid+"상품 삭제 성공</h2>");
		out.print("<a href='product.html'>등록화면보기</a><br>");
		out.print("<a href='ProductListServlet'>상품목록보기</a>");
		out.print("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
