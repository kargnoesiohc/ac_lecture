package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.EmpDAO;
import com.dto.Dept;
import com.dto.Emp;

public class EmpService {

		EmpDAO empDao;

		public EmpService() {
				empDao = new EmpDAO();
		}


}
