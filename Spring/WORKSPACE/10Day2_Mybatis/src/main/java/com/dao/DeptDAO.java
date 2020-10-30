package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.DeptDTO;

@Repository
public class DeptDAO {
	@Autowired
	SqlSessionTemplate template;
	
	public List<DeptDTO> selectAll() {
		return template.selectList("selectAll");
	}
}
