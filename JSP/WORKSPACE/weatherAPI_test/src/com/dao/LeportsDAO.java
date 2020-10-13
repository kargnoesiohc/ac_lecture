package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.LeportsDTO;

public class LeportsDAO {

	public List<LeportsDTO> selectByCity(SqlSession session, String cityName) {
		// TODO Auto-generated method stub
//		System.out.println(cityName);
		List<LeportsDTO> list = session.selectList("selectByCity", cityName);
		System.out.println(list);
		return list;
	}

}
