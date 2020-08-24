package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.DAO;
import com.dto.DTO;

public class Service {
		DAO dao;
		public Service() {
				// TODO Auto-generated constructor stub
				dao = new DAO();
		}
		
		public List<DTO>selectNotAmount(DTO dto) {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						List<DTO> list = dao.selectNotAmount(session, dto);
						return list;
				} finally {
						// TODO: handle finally clause
						session.close();
				}
				
		}
}
