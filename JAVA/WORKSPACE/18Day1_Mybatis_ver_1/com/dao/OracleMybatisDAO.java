package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMybatisDAO {

	public List<Dept> selectAll(SqlSession session) {
		//<select id="selectAll"
		List<Dept>	list = session.selectList("selectAll"); 
		return list;
	}
	public Dept selectOne(SqlSession session, int deptno) {
			Dept dept = session.selectOne("selectOne", deptno);
		return dept;
			
	}

}
