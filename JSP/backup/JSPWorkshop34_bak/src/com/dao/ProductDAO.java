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
		return session.delete("deleteProduct", prodid);
	}

}
