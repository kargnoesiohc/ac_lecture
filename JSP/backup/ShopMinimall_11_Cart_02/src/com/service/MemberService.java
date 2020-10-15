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
		} catch (Exception e) {
			// TODO: handle exception
			session.rollback();
			e.printStackTrace();
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
		MemberDTO dto = null;
		try {
			dto = dao.login(session, map);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return dto;
	}

	public MemberDTO myPage(String userid) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		MemberDTO dto = null;
		try {
			MemberDAO dao = new MemberDAO();
			dto = dao.myPage(session, userid);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return dto;
	}// end myPage

	public int memberUpdate(MemberDTO dto2) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.memberUpdate(session, dto2);
			if(n > 0 ) {
				session.commit();
			}
		} catch (Exception e) {
			// TODO: handle exception
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return n;
	}

	public String idSearch(MemberDTO dto) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		String userid = null;
		try {
			userid = dao.idSearch(session, dto);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return userid;
	}
}
