package com.biz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpBiz {
	Connection conn = null;
	EmpDAO dao;
	
	public EmpBiz() {
		//dao 생성
			dao = new EmpDAO();
	}
	public ArrayList<EmpDTO> selectAllEmp() throws SQLException, ClassNotFoundException{
		// JdbcTemplate.getConnection()에서 conn 얻기
		//jdbcTemplate 이용 close
			conn = JdbcTemplate.getConnection();
			ArrayList<EmpDTO> list = dao.selectAllEmp(conn);
			JdbcTemplate.close(conn);
		return list;
	}
	
	public EmpDTO selectDetailEmp(int empno) throws DataNotFoundException, SQLException{
	// JdbcTemplate.getConnection()에서 conn 얻기
	//dao.selectDetailEmp(conn); 호출
	//dbcTemplate 이용 close
			conn = JdbcTemplate.getConnection();
			EmpDTO emp = dao.selectDetailEmp(conn, empno);
			JdbcTemplate.close(conn);
		return emp;
	}
	public void empInsert(EmpDTO empDTO) throws SQLException {
			conn = JdbcTemplate.getConnection();
			dao.empInsert(conn, empDTO);
			JdbcTemplate.commit(conn);
			JdbcTemplate.close(conn);
	}
	public void empUpdate(EmpDTO empDTO) throws DataNotFoundException, SQLException{
				conn = JdbcTemplate.getConnection();
				dao.empUpdate(conn, empDTO);
				JdbcTemplate.commit(conn);
				JdbcTemplate.close(conn);
	}
	public void empDelete(int empno) throws DataNotFoundException, SQLException{
			conn = JdbcTemplate.getConnection();
			dao.empDelete(conn, empno);
			JdbcTemplate.commit(conn);
			JdbcTemplate.close(conn);
	}
}
