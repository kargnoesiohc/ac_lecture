package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.CartDAO;
import com.dto.CartDTO;
import com.dto.OrderDTO;

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
			if(n != 0) {
				session.commit();
				System.out.println("장바구니 저장 commit 성공");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return n;
	}

	public List<CartDTO> cartList(String userid) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		List<CartDTO> list = null;
		try {
			list = dao.cartList(session, userid);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		
		return list;
	}

	public int cartDel(int num) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.cartDel(session, num);
			if(n>0) {
				session.commit();
				System.out.println("장바구니 삭제 commit 성공");
			}
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return n;
	}

	public int cartUpdate(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.cartUpdate(session, map);
			if(n>0) {
				session.commit();
				System.out.println("장바구니 수량 수정 commit 성공");
			}
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return n;
	}

	public int cartAllDel(List<String> list) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.cartAllDel(session, list);
			if(n>0) {
				session.commit();
				System.out.println("장바구니 전체 삭제1 commit 성공");
			}
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return n;
	}

	public CartDTO cartByNum(int i) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		CartDTO cDTO = null;
		try {
			cDTO = dao.cartByNum(session, i);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return cDTO;
	}

	public int orderDone(OrderDTO oDTO, int orderNum) {
		// TODO Auto-generated method stub
		System.out.println("service");
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.orderDone(session,oDTO); //order테이블에 추가
			System.out.println("orderDone()");
			n = dao.cartDel(session,orderNum);//cart에서 삭제
			System.out.println("cartDel()");
			session.commit();
			System.out.println("commit()");
		} catch (Exception e) {
			// TODO: handle exception
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			System.out.println("close()");
		}
		return n;
	}

}
