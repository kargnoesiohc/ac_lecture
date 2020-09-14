package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		
		//Map형태로 파라미터 얻기
		Map<String, String[]> map = request.getParameterMap(); //key, value를 Map으로 리턴
		
		//응답처리
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		Set<String> keys = map.keySet(); //keySet()이용 key 전체를 Set으로 리턴
		for(String key: keys) {
			String [] values = map.get(key); //map에서 key를 이용하여 value를 꺼내서 배열에 저장
			String mesg = "";  //출력용 변수
			for(String v: values) { //map.get(key) -> 배열인 경우 for문을 한번 더 돌려서 값을 꺼내서 저장
				mesg += v; //values를 출력용 변수에 저장
			}
			out.print(key +" : "+mesg+"<br>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
