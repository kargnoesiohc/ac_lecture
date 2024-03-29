package com.controller.goods;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.service.CartService;

/**
 * Servlet implementation class GoodsCartServlet
 */
@WebServlet("/GoodsCartServlet")
public class GoodsCartServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		
		String nextPage = null;
		if(dto!=null) {
			String gCode = request.getParameter("gCode");
			String gImage = request.getParameter("gImage");
			String gName = request.getParameter("gName");
			String gPrice = request.getParameter("gPrice");
			String gSize = request.getParameter("gSize");
			String gColor = request.getParameter("gColor");
			String gAmount = request.getParameter("gAmount");
			String userid = dto.getUserid();
			
			if(Integer.parseInt(gAmount) > 10) {
				nextPage = "GoodsRetrieveServlet?gCode="+gCode;
				session.setAttribute("str", "수량을 10개 이하로 선택하세요.");
			} else {
				CartDTO xxx = new CartDTO();
				xxx.setgCode(gCode);
				xxx.setgImage(gImage);
				xxx.setgName(gName);
				xxx.setgPrice(Integer.parseInt(gPrice));
				xxx.setgSize(gSize);
				xxx.setgColor(gColor);
				xxx.setgAmount(Integer.parseInt(gAmount));
				xxx.setUserid(userid);
				
				
				CartService service = new CartService();
				service.cartAdd(xxx);
				nextPage = "GoodsRetrieveServlet?gCode="+gCode;
				session.setAttribute("str", gName+" 장바구니 저장 성공");
			}
			
		} else {
			nextPage = "loginForm.jsp";
			session.setAttribute("str", "로그인이 필요한 작업입니다.");
		}
		response.sendRedirect(nextPage);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
