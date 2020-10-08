package com.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;

/**
 * Servlet implementation class MyPageServlet
 */
@WebServlet("/MyPageServlet")
public class MyPageServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		String nextPage = null;
		String str = null;
		if(dto != null) {
			nextPage = "myPage.jsp";
			String userid = dto.getUserid();
			
			MemberService service = new MemberService();
			MemberDTO x = service.myPage(userid);
			session.setAttribute("login", x);
		} else {
			str = "로그인이 필요한 서비스입니다.";
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
