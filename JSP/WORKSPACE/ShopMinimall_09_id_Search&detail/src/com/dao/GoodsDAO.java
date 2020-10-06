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

	public GoodsDTO goodsRetrieve(SqlSession session, String gCode) {
		// TODO Auto-generated method stub
		System.out.println(gCode);
		GoodsDTO dto = session.selectOne("goodsRetrieve", gCode);
		System.out.println(dto);
		return dto;
	}

}
