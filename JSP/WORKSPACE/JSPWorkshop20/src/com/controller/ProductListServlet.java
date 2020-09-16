package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.ProductDTO;

/**
 * Servlet implementation class ProductListServlet
 */
@WebServlet("/ProductListServlet")
public class ProductListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		HttpSession session = request.getSession();
		Enumeration<String> key = session.getAttributeNames(); //전체 세션의 key만 얻어오기
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<b>상품 입력 결과</b><hr/><br>");
		
		String str = "<table border='1'>";
			   str += "<tr><th>상품 아이디</th><th>상품명</th><th>갯수</th></tr>";
			   
		while(key.hasMoreElements()) { //키가 있는가?
			String id = key.nextElement();//키 하나 얻기
			ProductDTO dto = (ProductDTO) session.getAttribute(id);
			str += "<tr><td>"+dto.getPid()+"</td><td>"+dto.getPname()+"</td><td>"+dto.getAmount()+"</td></tr>";
		}
		out.print(str);
		out.print("</table>");
		out.print("<a href='product.html'>등록화면보기</a>");
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
