package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.DTO;

public class DAO {

		public List<DTO> selectNotAmount(SqlSession session, DTO dto) {
				// TODO Auto-generated method stub
				List<DTO> list = session.selectList("selectNotAmount", dto);
				return list;
		}

}
