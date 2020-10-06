package com.controller.member;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		HashMap<String, String> map = new HashMap<>();
		map.put("userid", userid);
		map.put("passwd", passwd);
		
		MemberDTO dto = new MemberDTO();
		
		MemberService service = new MemberService();
		dto = service.login(map);
		
		String nextPage = null;
		String str = null;
		HttpSession session = request.getSession();
		if(dto != null) {
			session.setAttribute("login", dto);
			nextPage = "main";
		} else {
			str = "아이디 또는 비밀번호 확인";
			session.setAttribute("str", str);
			nextPage = "LoginUIServlet";
		}
		response.sendRedirect(nextPage);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
