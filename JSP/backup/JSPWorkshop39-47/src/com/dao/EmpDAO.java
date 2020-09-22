package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.dto.EmpDTO;

public class EmpDAO {
	

	public List<EmpDTO> select(SqlSession session) {
		List<EmpDTO> list = session.selectList("selectAll");
		return list;
	}

	public EmpDTO selectEmp(SqlSession session, int empno) {
		// TODO Auto-generated method stub
		EmpDTO dto = session.selectOne("selectEmp", empno);
		return dto;
	}

	public int insertEmp(SqlSession session, EmpDTO dto) {
		// TODO Auto-generated method stub
		
		int n = session.insert("insertEmp", dto);
		return n;
	}

	public int updateEmp(SqlSession session, EmpDTO dto) {
		// TODO Auto-generated method stub
		int n = session.update("updateEmp", dto);
		return n;
	}
	
	
	
	
}
