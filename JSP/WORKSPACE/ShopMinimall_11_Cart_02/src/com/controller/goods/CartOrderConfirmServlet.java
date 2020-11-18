	package com.controller.goods;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.service.CartService;
import com.service.MemberService;

/**
 * Servlet implementation class CartOrderConfirmServlet
 */
@WebServlet("/CartOrderConfirmServlet")
public class CartOrderConfirmServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		
		String nextPage = null;
		if(dto!=null) {
			String num = request.getParameter("num");
			CartService cService = new CartService();
			CartDTO cDTO = cService.cartByNum(Integer.parseInt(num)); //Cart 조회
			
			String userid = dto.getUserid();
			MemberService mService = new MemberService();
			MemberDTO mDTO = mService.myPage(userid);//사용자 조회
			
			request.setAttribute("cDTO", cDTO);
			request.setAttribute("mDTO", mDTO);
			
			nextPage = "orderConfirm.jsp";
		} else {
			session.setAttribute("str", "로그인이 필요한 작업입니다.");
			nextPage = "loginForm.jsp";
		}
		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		dis.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
