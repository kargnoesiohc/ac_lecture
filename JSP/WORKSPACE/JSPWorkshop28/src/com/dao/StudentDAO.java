package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.PageDTO;
import com.dto.StudentDTO;

public class StudentDAO {

	public int totalCount(SqlSession session) {
		// 전체 목록수 구하기 
	}
	
    public PageDTO selectAllPageStudent(SqlSession session, int curPage){
		
   

		//PageDTO 생성
		//페이지당 게시물수와 curPage 이용 offset 구하기 (시작점)
		//리스트에 해당 게시물만 select
		//pDTO에  curpage, perPage, totalpage, list 설정 리턴

	}
	
}
