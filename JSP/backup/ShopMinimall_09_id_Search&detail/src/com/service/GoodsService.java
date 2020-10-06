package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.GoodsDAO;
import com.dto.GoodsDTO;

public class GoodsService {
	GoodsDAO dao;
	public GoodsService() {
		// TODO Auto-generated constructor stub
		dao = new GoodsDAO();
	}
	public List<GoodsDTO> goodsList(String str) {
		// TODO Auto-generated method stub
		
		SqlSession session = MySqlSessionFactory.getSession();
		List<GoodsDTO> list = null;
		try {
			list = dao.goodsList(session, str);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return list;
	}
	public GoodsDTO goodsRetrieve(String gCode) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		GoodsDTO dto = null;
		try {
			dto = dao.goodsRetrieve(session, gCode);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
				
		return null;
	}
}
