package com.controller.goods;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.dto.OrderDTO;
import com.service.CartService;

/**
 * Servlet implementation class CartOrderDoneServlet
 */
@WebServlet("/CartOrderDoneServlet")
public class CartOrderDoneServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String nextPage = null;
		if(dto!=null) {
			int orderNum = Integer.parseInt(request.getParameter("orderNum"));
			String userid = dto.getUserid();
			String gCode = request.getParameter("gCode");
			String gName = request.getParameter("gName");
			int gPrice = Integer.parseInt(request.getParameter("gPrice"));
			String gSize = request.getParameter("gSize");
			String gColor = request.getParameter("gColor");
			int gAmount = Integer.parseInt(request.getParameter("gAmount"));
			String gImage = request.getParameter("gImage");
			String orderName = request.getParameter("orderName");
			String post = request.getParameter("post");
			String addr1 = request.getParameter("addr1");
			String addr2 = request.getParameter("addr2");
			String phone = request.getParameter("phone");
			String payMethod = request.getParameter("payMethod");

			OrderDTO oDTO = new OrderDTO(0, userid, gCode, 
					gName, gPrice, gSize, gColor, gAmount, gImage, 
					orderName, post, addr1, addr2, phone, payMethod, null);
			
			CartService service = new CartService();
			service.orderDone(oDTO, orderNum);
			
			request.setAttribute("orderDTO",oDTO);//주문완료 확인용
			nextPage="orderDone.jsp";
		} else {
			nextPage = "loginForm.jsp";
			session.setAttribute("str", "로그인이 필요한 작업입니다.");
		}
		
		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
