package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpOrderServlet
 */
@WebServlet("/EmpOrderServlet")
public class EmpOrderServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String order = request.getParameter("order");
		String curPage = request.getParameter("curPage");
		if(curPage == null) curPage = "1";
		System.out.println(order);
		
		EmpService service = new EmpService();

		List<EmpDTO> list = service.selectOrder(order);
		
		request.setAttribute("order", order);
		request.setAttribute("list", list);
		System.out.println("레코드 갯수 : " + list.size());
		
		RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
		dis.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
