package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	
	private List<Product> products = new ArrayList<Product>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>상품 입력 결과</title></head><body>");
		out.print("<b>상품 입력 결과</b><hr/>");
		
		try { //데이터 파싱
			
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			int amount = Integer.parseInt(request.getParameter("amount"));
			
			if(products.size()!=0) { //list의 사이즈가 0이 아니면(객체가 있으면)
				//for(Product p: products)
				boolean flag = true; //존재 여부 판단
				for(int i=0;i<products.size();i++) { //객체 크기 만큼 for문 돌려서
					Product p = products.get(i);
					if(p.getId().equals(id)) { //list안의 객체 id와 사용자가 입력한 id비교, 존재 시
						p.setAmount(p.getAmount()+amount); //기존 amout값 + 사용자가 입력한 amount값(수량 증가)
						flag = false; //add를 금지 시키기 위해 flag를 false로
					}//end if
				}// end for
				if(flag) { //flag값이 true인 경우 add -> 사용자가 입력한 id가 list에 존재하지 않으면 flag = true 유지
					products.add(new Product(name,id,amount)); //해당 id가 없을 경우 list에 객체 생성 후 추가
				} 
			} else {
				products.add(new Product(name,id,amount));//list 사이즈가 0인 경우 list 객체 생성 후 추가 
			}
				
			
			out.print("<table border='1'>");
			out.print("<tr><th>상품명</th><th>상품아이디</th><th>수량</th></tr>");
			
			
			for(Product p : products) { 
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
