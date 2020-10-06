package com.service;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MemberDAO;
import com.dto.MemberDTO;

public class MemberService {
	MemberDAO dao;
	public MemberService() {
		// TODO Auto-generated constructor stub
		dao = new MemberDAO();
	}
	
	public int memberAdd(MemberDTO member) {
		
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.memberAdd(session, member);
			if(n > 0) {
				session.commit();
			}
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		
		return n;

	  }

	public int idCheck(String userid) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.idCheck(session, userid);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return n;
	}

	public MemberDTO login(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		MemberDTO member = null;
		try {
			member = dao.login(session, map);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return member;
	}

	public MemberDTO myPage(String userid) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		MemberDTO member = null;
		try {
			MemberDAO dao = new MemberDAO();
			member = dao.myPage(session, userid);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return member;
	}// end myPage
}
