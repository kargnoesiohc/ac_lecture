package com.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.dto.MemberDTO;

public class MemberDAO {
	
	  public int memberAdd(SqlSession session,MemberDTO dto) {
		
		return session.insert("memberAdd", dto);
	  }

	public int idCheck(SqlSession session, String userid) {
		// TODO Auto-generated method stub
		int n = session.selectOne("idCheck", userid);
		System.out.println(n);
		return n;
	}

	public MemberDTO login(SqlSession session, HashMap<String, String> map) {
		// TODO Auto-generated method stub
		MemberDTO member = session.selectOne("login",map);
		return member;
	}
}
