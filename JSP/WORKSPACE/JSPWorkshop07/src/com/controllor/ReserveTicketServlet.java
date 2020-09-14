package com.controllor;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReserveTicketServlet
 */
@WebServlet("/reserveTicket")
public class ReserveTicketServlet extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String birth = request.getParameter("birthday");
		String type [] = request.getParameterValues("type");
		
		LocalDate currDate = LocalDate.now();
		
		int age = currDate.getYear() - Integer.parseInt(birth.substring(0,4))+1;
		
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String mesg1="";
		String mesg2="";
		double price;
		
		
		
		mesg1 += "입력한 생년월일 : "+birth;
		for(String t:type) {
			mesg1 += " 선택한 티켓 : "+t;
		}
		out.print("<b>"+mesg1+"</b>");
		
		mesg2 += "<br>나이 : " + age;
		
		for(String t:type) {
			if(age<=9) {
				price = Math.round(Integer.parseInt(t)*0.6);
				mesg2 += " 등급 : 미성년자, 할인 적용 금액 : "+price;
				
				
			} else if (age>=19 && age<=60) {
				price = Math.round(Integer.parseInt(t)*0.9);
				mesg2 += " 등급 : 성인, 할인 적용 금액 : "+price;
			} else {
				price = Math.round(Integer.parseInt(t)*0.5);
				mesg2 += " 등급 : 경로우대자, 할인 적용 금액 : "+price;
			}
		}
		out.print(mesg2);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
