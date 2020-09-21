package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.ProductDTO;

public class ProductDAO {

	public List<ProductDTO> selectList(SqlSession session) {
		// TODO Auto-generated method stub
		return session.selectList("selectList");
	}

	public int deleteProduct(SqlSession session, String prodid) {
		// TODO Auto-generated method stub
		int num = session.delete("deleteProduct", prodid);
		return num;
	}
	
	public int deleteAll(SqlSession session, List<String> list) {
		int num = session.delete("deleteByAllProduct",list);
		return num;
	}

	public int updataProduct(SqlSession session, String prodid) {
		// TODO Auto-generated method stub
		int num = session.update("updateProduct", prodid);
		return num;
	}

}
