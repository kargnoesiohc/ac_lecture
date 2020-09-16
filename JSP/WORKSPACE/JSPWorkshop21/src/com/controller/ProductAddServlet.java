package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.ProductDTO;

/**
 * Servlet implementation class ProductAddServlet
 */
@WebServlet("/ProductAddServlet")
public class ProductAddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String pname = request.getParameter("pname");
		String pid = request.getParameter("pid");
		int amount = Integer.parseInt(request.getParameter("amount"));
		
		ProductDTO dto = new ProductDTO(pname,pid,amount);
		
		HttpSession session = request.getSession();
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		ProductDTO checkDto = (ProductDTO) session.getAttribute(dto.getPid());
		
		out.print("<html><body>");
		if(checkDto != null && checkDto.getPid().trim().equals(pid.trim())) {
			checkDto.setAmount(checkDto.getAmount()+amount);
			session.setAttribute(checkDto.getPid(), checkDto);
		} else {
			session.setAttribute(dto.getPid(), dto );
		}
		
		out.print("<h2>상품 등록 성공</h2>");
		out.print("<a href='product.html'>등록화면보기</a><br>");
		out.print("<a href='ProductListServlet'>상품목록보기</a>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
