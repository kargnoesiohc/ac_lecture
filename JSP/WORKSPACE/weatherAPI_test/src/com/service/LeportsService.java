package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.LeportsDAO;
import com.dto.LeportsDTO;

public class LeportsService {
	LeportsDAO dao;
	
	public LeportsService() {
		// TODO Auto-generated constructor stub
		dao = new LeportsDAO();
	}
	
	public List<LeportsDTO> selectByCity(String cityName) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		List<LeportsDTO> list = null;
		try {
			list = dao.selectByCity(session, cityName);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return list;
	}

}
