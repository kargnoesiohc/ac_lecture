package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.dto.CartDTO;

public class CartDAO {

	public int cartAdd(SqlSession session, CartDTO xxx) {
		// TODO Auto-generated method stub
		return session.insert("cartAdd", xxx);
	}

}
