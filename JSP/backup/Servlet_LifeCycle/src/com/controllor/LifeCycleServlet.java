package com.controllor;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	
//    웹 컨테이너에 의해서 서블릿 인스턴스가 처음 생성 될 때, 단 한번 호출된다. 초기화 작업시 주로 사용
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("--- init() 호출 ---");
	}

	/**
	 * @see Servlet#destroy()
	 */
//	서블릿 인스턴스가 웹 컨테이너에서 제거될 때 호출, 따라서 init 메서드에서 구현했던 초기화 작업을 반납 처리하는 작업 시 주로 사용
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("--- destroy() 호출 ---");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("--- doGet() 호출 ---");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
