package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;

/**
 * Servlet implementation class MemberAddServlet
 */
@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
				String username = request.getParameter("username");
				int age = Integer.parseInt(request.getParameter("age"));
				String address = request.getParameter("address");
				
				
				MemberDTO dto = new MemberDTO(username,age,address);
				
				System.out.println("==========="+dto);
				
				//세션 생성
				response.setContentType("text/html;charset=UTF-8");
				
				PrintWriter out = response.getWriter();
				HttpSession session = request.getSession();
				
				MemberDTO checkDto = (MemberDTO)session.getAttribute("user"); //세션 검사
				
				out.print("<html><body>");
				
				if(checkDto != null && username.trim().equals(checkDto.getUsername().trim())) {//null이 아닌경우 이름 비교
					out.print("<h2>중복 데이터로 인한 저장 실패</h2>");
					out.print("<a href='member.html'>회원등록화면</a>");
				} else {
					session.setAttribute("user", dto);
					out.print("<h2>세션에 이름/나이/주소 저장 성공</h2><br>");
					out.print("<a href='MemberListServlet'>세션정보 보기</a>");
				}
				
				out.print("</body></html>");
				
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
