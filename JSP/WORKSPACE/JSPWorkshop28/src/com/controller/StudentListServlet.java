package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.PageDTO;
import com.dto.StudentDTO;
import com.service.StudentService;


@WebServlet("/StudentListServlet")
public class StudentListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//curPae 현재 페이지, perPage 한페이지당 목로굿
	//totalPage전체 목록수
	//현재 페이지를 파싱 null이면  1로설정
	//service의 selectAllPageStudent사용
	//1페이지 목록 또는 curPages 내용 읽어와 게시
	//아랫부분에 페이지 번호 출력
		out.print(my);
		out.print("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
