package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.TB_StuDAO;
import com.dto.TB_StuDTO;

public class TB_StuService {
	
	TB_StuDAO dao;
	public TB_StuService() {
		// TODO Auto-generated constructor stub
		dao = new TB_StuDAO();
	}

	public List<TB_StuDTO> selectSsnHideStu() {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			List<TB_StuDTO> list = dao.selectSsnHide(session);
			return list;
		} finally {
			// TODO: handle finally clause
			session.close();
		}
	}

}
