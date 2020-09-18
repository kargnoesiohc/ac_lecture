package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.dto.EmpDTO;


public class EmpDAO {
	public ArrayList<EmpDTO> selectAllEmp(Connection con){

		//prepareStatement 사용 데이터를 EmpDTO에 저장
		//list에 저장 리스트 리턴 
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String query = "select empno, ename, sal, to_char(hiredate, 'yyyy/mm/dd') hiredate, deptno "
					+ "from emp order by empno, deptno";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(rs.getInt(1));
				dto.setEname(rs.getString(2));
				dto.setSal(rs.getInt(3));
				dto.setHiredate(rs.getString(4));
				dto.setDeptno(rs.getInt(5));
				list.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return list;
	}
	
}
