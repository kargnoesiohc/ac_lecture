package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.CartDTO;

public class CartDAO {

	public int cartAdd(SqlSession session, CartDTO xxx) {
		// TODO Auto-generated method stub
		int n = session.insert("cartAdd", xxx);
		return n;
	}

	public List<CartDTO> cartList(SqlSession session, String userid) {
		// TODO Auto-generated method stub
		List<CartDTO> list = session.selectList("cartList", userid);
		return list;
	}

	public int cartDel(SqlSession session, int num) {
		// TODO Auto-generated method stub
		return session.delete("cartDel", num);
	}

	public int cartUpdate(SqlSession session, HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		System.out.println(map);
		return session.update("cartUpdate", map);
	}

	public int cartAllDel(SqlSession session, List<String> list) {
		// TODO Auto-generated method stub
		
		return session.delete("cartAllDel", list);
	}


}
