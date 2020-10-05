package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.GoodsDTO;

public class GoodsDAO {

	public List<GoodsDTO> goodsList(SqlSession session, String str) {
		// TODO Auto-generated method stub
		List<GoodsDTO> list = session.selectList("goodsList",str);
		return list;
	}

}
