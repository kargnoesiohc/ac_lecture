package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookie
 */
@WebServlet("/GetCookie")
public class GetCookie extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 요청에서 쿠키 얻기
		Cookie[] cookies = request.getCookies();//사용자에게 쿠키 얻기
		
		
		//2. 쿠키 사용
		for(Cookie c: cookies) { //한 개의 Cookie(key:value)
			if("username".equals(c.getName())) { // Cookie에서 하나의 값
				String name = c.getName();
				String value = c.getValue();
				System.out.println(name + "\t" + value);
				
			}
		}
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
