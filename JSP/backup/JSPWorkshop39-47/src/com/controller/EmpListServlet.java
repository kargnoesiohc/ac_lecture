package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDAO;
import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/EmpListServlet") //페이지의 시작 지점  
public class EmpListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		EmpService service = new EmpService();
		List<EmpDTO> list = service.select();
		
		request.setAttribute("list", list);
		System.out.println("레코드 갯수 : " + list.size());
		
		
		//RequsetDispatcher
		//클라이언트로부터 요청을 받은 정보를 서버의 다른 자원(html,jsp,servlet 등)에 보내는 역할을 하는 인터페이스
		//forward
		//클라이언트의 요청을 받는 Servlet에서 다른  Servlet,jsp등으로 수행 권한을 넘겨서 결과가 대신 클라이언트로 응답되도록 하는 기능의 메소드
		RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
		dis.forward(request, response);
				
		
	}

}
