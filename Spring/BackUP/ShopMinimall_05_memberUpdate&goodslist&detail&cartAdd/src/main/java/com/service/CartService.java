package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CartDAO;
import com.dto.CartDTO;
import com.dto.OrderDTO;

@Service
public class CartService {
	@Autowired
	CartDAO dao;

	public int cartAdd(CartDTO dto) {
		// TODO Auto-generated method stub
		int n = dao.cartAdd(dto);
		return n;
	}

	public List<CartDTO> cartList(String userid) {
		// TODO Auto-generated method stub
		List<CartDTO> list =  dao.cartList(userid);
		return list;
	}

	public int cartDel(int num) {
		// TODO Auto-generated method stub
		int n = dao.cartDel(num);
		return n;
	}

	public int cartUpdate(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
			int n = dao.cartUpdate(map);
			return n;
	}

	public int cartAllDel(List<String> list) {
		// TODO Auto-generated method stub
			int n = dao.cartAllDel(list);
			return n;
	}

	public CartDTO cartByNum(int i) {
		// TODO Auto-generated method stub
			CartDTO cDTO = dao.cartByNum(i);
			return cDTO;
	}

	public int orderDone(OrderDTO oDTO, int orderNum) {
		// TODO Auto-generated method stub
		int n = dao.orderDone(oDTO); //order테이블에 추가
		System.out.println("orderDone()");
		n += dao.cartDel(orderNum);//cart에서 삭제
		return n;
	}

}
