package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.StudentDAO;
import com.dto.PageDTO;
import com.dto.StudentDTO;

public class StudentService {

	private StudentDAO dao;
	
	public StudentService() {
	   dao = new StudentDAO();
	}
	
   public PageDTO selectAllPageStudent(int curPage){
		
		
	}
	
}
