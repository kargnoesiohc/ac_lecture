package com.service;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dao.OracleDAO;
import com.dto.Dept;

public class OracleService {
		OracleDAO dao = new OracleDAO();
		public OracleService() {
				// TODO Auto-generated constructor stub
		}
		
		public ArrayList<Dept> select() throws Exception {
				ArrayList<Dept> list = dao.select();
				return list;
		}
		
		public void insert(Dept dept) throws Exception {
				dao.insert(dept);
		}
		
		public void update(Dept dept) throws Exception {
				dao.update(dept);
		}
		
		public void delete(int deptno) throws Exception {
				dao.delete(deptno);
		}
		public ArrayList<Dept> selectByDeptno(int deptno) throws Exception {
				ArrayList<Dept> list = dao.selectByDeptno(deptno);
				return list;
		}
		
		public ArrayList<Dept> selectByNameLoc(HashMap<String, String> map) throws Exception{
				ArrayList<Dept> list = dao.selectByNameLoc(map);
				return null;
		}
		
}
