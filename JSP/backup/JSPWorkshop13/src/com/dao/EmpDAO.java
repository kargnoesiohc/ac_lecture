package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {

	public List<EmpDTO> selectAll(SqlSession session) {
		// TODO Auto-generated method stub
		List<EmpDTO> list = session.selectList("selectAll");
		return list;
	}

}