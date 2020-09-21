package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {

	public List<EmpDTO> selectAll(SqlSession session) {
		// TODO Auto-generated method stub
		List<EmpDTO> list = session.selectList("selectAll");
		System.out.println("레코드 개수 -> "+list.size()+"개");
		return list;
	}
	
	public int insertEmp(SqlSession session, EmpDTO emp) {
		System.out.println("1");
		System.out.println(emp);
		int num = session.insert("insertEmp", emp);
		System.out.println("2");
		return num;
		
	}

}
