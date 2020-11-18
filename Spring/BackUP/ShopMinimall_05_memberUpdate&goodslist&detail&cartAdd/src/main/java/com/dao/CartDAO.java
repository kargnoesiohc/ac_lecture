package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.CartDTO;
import com.dto.OrderDTO;

@Repository
public class CartDAO {
	
	@Autowired
	SqlSessionTemplate template;
	
	public int cartAdd(CartDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("DAO : "+dto);
		return template.insert("cartAdd", dto);
	}

	public List<CartDTO> cartList(String userid) {
		// TODO Auto-generated method stub
		List<CartDTO> list = template.selectList("cartList", userid);
		return list;
	}
	
	
	//개별 삭제
	public int cartDel(int num) {
		// TODO Auto-generated method stub
		return template.delete("cartDel", num);
	}

	public int cartUpdate(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		System.out.println(map);
		return template.update("cartUpdate", map);
	}

	//전체 삭제
	public int cartAllDel(List<String> list) {
		// TODO Auto-generated method stub
		return template.delete("cartAllDel", list);
	}

	public CartDTO cartByNum(int i) {
		// TODO Auto-generated method stub
		CartDTO cDTO = template.selectOne("cartByNum",i);
		return cDTO;
	}

	public int orderDone(OrderDTO oDTO) {
		// TODO Auto-generated method stub
		return template.insert("orderDone",oDTO);
	}


}
