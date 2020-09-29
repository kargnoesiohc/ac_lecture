package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import com.dto.EmpDTO;
import com.dto.PageDTO;

public class EmpDAO {
	
	public int totalCount(SqlSession session, HashMap<String, String> map) {
		return session.selectOne("totalCount",map);
	}

	public PageDTO select(SqlSession session, HashMap<String, String> map, int curPage) {
		
		PageDTO pDTO = new PageDTO();
		int perPage = 2;
		int offset = (curPage-1)*perPage;
		List<EmpDTO> list = session.selectList("selectAll", map, new RowBounds(offset, perPage));
		
		pDTO.setCurPage(curPage);
		pDTO.setPerPage(perPage);
		pDTO.setList(list);
		pDTO.setTotalCount(totalCount(session, map));
		
		return pDTO;
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

	public int deleteEmp(SqlSession session, int empno) {
		// TODO Auto-generated method stub
		int n = session.delete("deleteEmp",empno);
		return n;
	}

	public List<EmpDTO> selectOrder(SqlSession session,  HashMap<String, String> map) {
		// TODO Auto-generated method stub
		List<EmpDTO> list = session.selectList("selectOrder",map);
		return list;
	}

	
	
	
	
}
