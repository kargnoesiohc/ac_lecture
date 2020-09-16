package com.controllor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/productReg")
public class ProductServlet extends HttpServlet {
	
	private HashMap<String, Product> products = new HashMap<String, Product>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>상품 입력 결과</title></head><body>");
		out.print("<b>상품 입력 결과</b><hr/>");
		
		try {
			
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			int amount = Integer.parseInt(request.getParameter("amount"));
			
			Product temp = products.get(id);
			if(temp==null) { //같은 id를 가진 상품이 Map에 없는 경우 
				temp = new Product(name, id, amount); //사용자 데이터로 객체 생성
				products.put(id, temp); //생성된 객체를 Map에 추가
			} else { //같은 id를 가진 상품이 Map에 있는 경우 amount 값 증가
				temp.setAmount(temp.getAmount()+amount);
			}
			out.print("<table border='1'>");
			out.print("<tr><th>상품명</th><th>상품아이디</th><th>수량</th></tr>");
			
			for(Product p : products.values()) { //Map에서 value만 얻어오기
				out.print("<tr><td>"+p.getName()+"</td><td>"+p.getId()+"</td><td>"+p.getAmount()+"</td></tr>");
			}
			out.print("</table>");
		} catch (Exception e) {
			// TODO: handle exception
			out.print("입력항목을 확인해 주세요!<br/>");
		}
		
		out.print("<a href='productForm.html'>상품 입력하기</a>");
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
