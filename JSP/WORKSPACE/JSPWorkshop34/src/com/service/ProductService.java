package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.ProductDAO;
import com.dto.ProductDTO;

public class ProductService {
	ProductDAO dao;
	
	public ProductService() {
		// TODO Auto-generated constructor stub
		dao = new ProductDAO();
	}
	
	public List<ProductDTO> selectList() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<ProductDTO> list;
		try {
			list = dao.selectList(session);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return list;
	}
	
	public int deleteProduct(String prodid) {
		SqlSession session = MySqlSessionFactory.getSession();
		int num;
		
		try {
			num = dao.deleteProduct(session,prodid);
			session.commit();
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return num;
	}
	
	public int deleteAll(List<String> list) {
		SqlSession session = MySqlSessionFactory.getSession();
		int num;
		try {
			num = dao.deleteAll(session, list);
			session.commit();
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return num;
		
	}
	
	public int updateProduct(String prodid) {
		SqlSession session = MySqlSessionFactory.getSession();
		int num;
		
		try {
			num = dao.updataProduct(session,prodid);
			session.commit();
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return num;
	}

}
