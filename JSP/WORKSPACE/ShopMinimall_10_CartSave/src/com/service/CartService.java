package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.CartDAO;
import com.dto.CartDTO;

public class CartService {
	
	CartDAO dao;
	
	public CartService() {
		// TODO Auto-generated constructor stub
		dao = new CartDAO();
	}

	public int cartAdd(CartDTO xxx) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.cartAdd(session, xxx);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return n;
	}

}
