package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;

/**
 * Servlet implementation class MemberInfoServlet
 */
@WebServlet("/MemberInfoServlet")
public class MemberInfoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();	
		
		out.print("<html><body>");
		if(dto == null) {
			out.print("로그인 확인");
			out.print("<a href=loginForm.html>로그인</a>");
		} else {
			out.print("이름 : "+dto.getUsername());
			out.print("<br>주소 : "+dto.getAddress());
			out.print("<br>이메일 : "+dto.getEmail());
			out.print("<br><a href='MemberLogoutServlet'>로그아웃</a>");
		}
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
