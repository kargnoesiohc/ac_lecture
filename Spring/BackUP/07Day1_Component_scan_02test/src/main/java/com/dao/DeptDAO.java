package com.dao;

import org.springframework.stereotype.Repository;

import com.entity.DeptDTO;
@Repository
public class DeptDAO {

	public DeptDTO getDeptDTO() {
		// TODO Auto-generated method stub
		return new DeptDTO(100,"관리부","서울");
	}

}
