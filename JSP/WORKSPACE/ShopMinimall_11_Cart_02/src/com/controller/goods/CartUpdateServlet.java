package com.controller.goods;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.CartService;

/**
 * Servlet implementation class CartUpdateServlet
 */
@WebServlet("/CartUpdateServlet")
public class CartUpdateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		if(dto!=null ) {
			String num = request.getParameter("num");
			String gAmount = request.getParameter("gAmount");
			
				HashMap<String, Integer> map = new HashMap<>();
				map.put("num",Integer.parseInt(num));
				map.put("gamount",Integer.parseInt(gAmount));
				
				CartService service = new CartService();
				service.cartUpdate(map);
			session.setAttribute("str", "로그인이 필요한 작업입니다.");
			response.sendRedirect("loginForm.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
