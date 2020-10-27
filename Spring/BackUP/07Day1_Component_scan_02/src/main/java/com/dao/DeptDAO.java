package com.dao;

import org.springframework.stereotype.Repository;

import com.entity.DeptDTO;

//@Repository //이름을 명시하지 않으면 기본적으로 첫 글자가 소문자로 바뀐 클래스명이 id값
@Repository("dao")
public class DeptDAO {

	public DeptDTO getInfo() {
		// TODO Auto-generated method stub
		return new DeptDTO(100,"관리","서울");
	}

}
