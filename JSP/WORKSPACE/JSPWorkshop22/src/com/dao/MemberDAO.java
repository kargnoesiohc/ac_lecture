package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.MemberDTO;
import com.dto.MemberIDPW;

public class MemberDAO {

	public MemberDTO LoginCheck(SqlSession session, MemberDTO xxx) {
		
		 return session.selectOne("LoginCheck", xxx);
		
		
		// TODO Auto-generated method stub
		
	}

}
