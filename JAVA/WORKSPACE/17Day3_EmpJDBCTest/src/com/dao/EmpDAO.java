package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;


public class EmpDAO {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
	public ArrayList<EmpDTO> selectAllEmp(Connection conn) throws SQLException{
			ArrayList<EmpDTO> list = new ArrayList<>();
			EmpDTO emp = null;
			String selectQuery = "select * from emp";
			pstmt = conn.prepareStatement(selectQuery);
			rs = pstmt.executeQuery();
			while(rs.next()) {
//					EmpDTO emp = new EmpDTO();
//					emp.setEmpno(rs.getInt(1));
//					emp.setEname(rs.getString(2));
//					emp.setJob(rs.getString(3));
//					emp.setMgr(rs.getInt(4));
//					emp.setHiredate(rs.getString(5));
//					emp.setSal(rs.getDouble(6));
//					emp.setComm(rs.getDouble(7));
//					emp.setDeptno(rs.getInt(8));
					emp  = new EmpDTO(rs.getInt(1),rs.getString(2),rs.getString(3),
									rs.getInt(4),rs.getString(5),rs.getDouble(6),
									rs.getDouble(7),rs.getInt(8));
					list.add(emp);
			}
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		//select 후 jdbcTemplate 이용 close
		return list;
	}
	//사원번호로 찾기
	public EmpDTO selectDetailEmp(Connection conn, int empno) throws DataNotFoundException, SQLException{
			//select 후 jdbcTemplate 이용 close
			EmpDTO emp = null;
			String selectQuery = "select * from emp where empno = ?";
			pstmt = conn.prepareStatement(selectQuery);
			pstmt.setInt(1, empno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp  = new EmpDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getDouble(6),rs.getDouble(7),rs.getInt(8));
			}
			if(emp == null) {
					throw new DataNotFoundException("찾는 레코드가 없습니다.");
			}
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		return emp;
	}
	
	public void empInsert(Connection conn, EmpDTO empDto) throws SQLException {
			String InsertQuery = "insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)"
							+ "values(?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(InsertQuery);
			pstmt.setInt(1, empDto.getEmpno());
			pstmt.setString(2, empDto.getEname());
			pstmt.setString(3, empDto.getJob());
			pstmt.setInt(4, empDto.getMgr());
			pstmt.setString(5, empDto.getHiredate());
			pstmt.setDouble(6, empDto.getSal());
			pstmt.setDouble(7, empDto.getComm());
			pstmt.setInt(8, empDto.getDeptno());
			
			int num = pstmt.executeUpdate();
			System.out.println(num+"개 행 삽입");
			
			JdbcTemplate.close(pstmt);
	}
	
	public void empDelete(Connection conn, int empno) throws DataNotFoundException, SQLException {
		//delte 후 jdbcTemplate 이용 close
			String deleteQuery = "delete from emp where empno = ?";
			pstmt = conn.prepareStatement(deleteQuery);
			pstmt.setInt(1, empno);
			int num = pstmt.executeUpdate();
			if(num == 0) {
					throw new DataNotFoundException("삭제 할 레코드가 없습니다.");
			} else
					System.out.println(num +"개 행 삭제");
			
			JdbcTemplate.close(pstmt);
	}
	
	public void empUpdate(Connection conn, EmpDTO empDto) throws DataNotFoundException, SQLException {
			String updateQuery = "update emp set ename = ?, sal = ?, comm = ? where empno = ?";
			pstmt = conn.prepareStatement(updateQuery);
			pstmt.setString(1, empDto.getEname());
			pstmt.setDouble(2, empDto.getSal());
			pstmt.setDouble(3, empDto.getComm());
			pstmt.setInt(4, empDto.getEmpno());
			int num = pstmt.executeUpdate();
			if(num == 0) {
					throw new DataNotFoundException("업데이트 할 레코드가 없습니다.");
			} else
					System.out.println(num+"개 행 업데이트");
			
			JdbcTemplate.close(pstmt);
	}
}
