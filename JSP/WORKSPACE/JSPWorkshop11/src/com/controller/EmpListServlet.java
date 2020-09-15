package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {
	
	public String driver = "oracle.jdbc.driver.OracleDriver"; 
	public String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	public String userid = "scott";
	public String passwd = "tiger";
	
	public void init() { //드라이버 로딩
		try {
			Class.forName(driver);
			System.out.println("db loading");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(url,userid,passwd); //커넥션 연결
			System.out.println("connection");
			String sql = "select empno, ename, sal, to_char(hiredate,'yyyy/mm/dd') hiredate"
					+ ", deptno from emp order by deptno, empno";
			pstmt = conn.prepareStatement(sql);//쿼리 날릴 준비
			rs = pstmt.executeQuery();//쿼리 실행 후 결과 받기
			
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			
			String str = "<table border='1'>";
				   str += "<tr>";
				   str += "<th>사원번호</th>";
				   str += "<th>사원이름</th>";
				   str += "<th>월급</th>";
				   str += "<th>입사일</th>";
				   str += "<th>부서번호</th>";
				   str += "</tr>";
		    while(rs.next()) {
		    	str += "<tr>";
		    	str += "<td>"+rs.getInt("empno")+"</td>";
		    	str += "<td>"+rs.getString("ename")+"</td>";
		    	str += "<td>"+rs.getInt("sal")+"</td>";
		    	str += "<td>"+rs.getString("hiredate")+"</td>";
		    	str += "<td>"+rs.getInt("deptno")+"</td>";
		    	str += "</tr>";
		    }
			str += "</table>";
			out.print(str);
			out.print("</body></html>");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
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
