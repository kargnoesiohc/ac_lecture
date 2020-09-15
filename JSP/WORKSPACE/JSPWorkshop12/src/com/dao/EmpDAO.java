package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.EmpDTO;

public class EmpDAO {
	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ArrayList<EmpDTO> selectAll(Connection conn) throws SQLException {
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		EmpDTO emp = null;
		
		String selectQuery = "select empno, ename, sal, to_char(hiredate,'yyyy/mm/dd') hiredate, deptno from emp order by deptno, empno";
		pstmt = conn.prepareStatement(selectQuery);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			emp = new EmpDTO(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5));
			list.add(emp);
		}
		try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
	} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
	}
		return list;
		
	}


}
