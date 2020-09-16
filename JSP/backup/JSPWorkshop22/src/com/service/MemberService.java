package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MemberDAO;
import com.dto.MemberDTO;
import com.dto.MemberIDPW;

public class MemberService {
	
	MemberDAO dao;
	
	public MemberService() {
		// TODO Auto-generated constructor stub
		dao = new MemberDAO();
	}

	public MemberDTO LoginCheck(MemberDTO xxx) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			return dao.LoginCheck(session, xxx);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		
	}

	
}
 