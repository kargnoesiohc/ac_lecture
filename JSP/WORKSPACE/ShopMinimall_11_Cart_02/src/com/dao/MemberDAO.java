package com.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.dto.MemberDTO;

public class MemberDAO {
	
	  public int memberAdd(SqlSession session,MemberDTO dto) {
		// TODO Auto-generated method stub
		return session.insert("memberAdd", dto);
	  }

	public int idCheck(SqlSession session, String userid) {
		// TODO Auto-generated method stub
		int n = session.selectOne("idCheck", userid);
		return n;
	}

	public MemberDTO login(SqlSession session, HashMap<String, String> map) {
		// TODO Auto-generated method stub
		MemberDTO dto = session.selectOne("login",map);
		return dto;
	}

	public MemberDTO myPage(SqlSession session, String userid) {
		// TODO Auto-generated method stub
		MemberDTO n = session.selectOne("myPage",userid);
		return n;
	}

	public int memberUpdate(SqlSession session, MemberDTO dto2) {
		// TODO Auto-generated method stub
		return session.update("memberUpdate", dto2);
	}

	public String idSearch(SqlSession session, MemberDTO dto) {
		// TODO Auto-generated method stub
		String userid = session.selectOne("idSearch", dto);
		return userid;
	}
}
