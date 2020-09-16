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
import com.dto.MemberIDPW;
import com.service.MemberService;

/**
 * Servlet implementation class MemberLoginServlet
 */
@WebServlet("/MemberLoginServlet")
public class MemberLoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		MemberDTO xxx = new MemberDTO();
		xxx.setUserid(userid);
		xxx.setPasswd(passwd);
		
		MemberService service = new MemberService();
		MemberDTO dto = service.LoginCheck(xxx);
			
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		if(dto==null) {
			out.print("아이디와 비밀번호를 확인하시오.<br>");
			out.print("<a href='loginForm.html'>로그인</a>");
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("login", dto);
			out.print("환영합니다."+dto.getUserid()+"<br>");
			out.print("<a href='MemberLogoutServlet'>로그아웃</a><br>");
			out.print("<a href='MemberInfoServlet'>회원정보보기</a>");
			}
		out.print("</body></html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
