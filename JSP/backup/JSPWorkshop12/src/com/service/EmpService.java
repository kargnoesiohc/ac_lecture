package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	
	EmpDAO dao;
	
	Connection conn = null;
	
	public EmpService() throws ClassNotFoundException {
		Class.forName(driver);
		System.out.println("Driver Loading");
		dao = new EmpDAO();
		
	}

	public ArrayList<EmpDTO> selectAllEmp() throws Exception {
		// TODO Auto-generated method stub
		conn = DriverManager.getConnection(url,userid,passwd);
		System.out.println("DB Connect");
		ArrayList<EmpDTO> list = dao.selectAll(conn); 
		try {
			if(conn != null)conn.close();
	} catch (SQLException e) {
		// TODO: handle exception
			e.printStackTrace();
	}	
		return list;
	}


}
