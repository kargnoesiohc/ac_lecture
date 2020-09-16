package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.TB_StuDTO;

public class TB_StuDAO {

	public List<TB_StuDTO> selectSsnHide(SqlSession session) {
		// TODO Auto-generated method stub
		List<TB_StuDTO> list = session.selectList("selectSsnHide");
		
		return list;
	}

}
