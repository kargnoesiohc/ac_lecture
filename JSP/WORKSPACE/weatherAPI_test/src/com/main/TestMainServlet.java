package com.main;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.LeportsDTO;
import com.service.LeportsService;

/**
 * Servlet implementation class TestMainServlet
 */
@WebServlet("/TestMainServlet")
public class TestMainServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cityName = request.getParameter("cityName");
		if(cityName == null) cityName = "서울";
		
		LeportsService service = new LeportsService();
		List<LeportsDTO> list = service.selectByCity(cityName);
		request.setAttribute("leportsList",list);
		RequestDispatcher dis = request.getRequestDispatcher("weather.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
