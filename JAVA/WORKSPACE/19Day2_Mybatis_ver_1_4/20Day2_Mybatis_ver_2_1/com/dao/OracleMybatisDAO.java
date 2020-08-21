package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMybatisDAO {

		public List<Dept> selectDynamicDeptno(SqlSession session, Dept dept) throws Exception {
				// TODO Auto-generated method stub
				List<Dept> list = session.selectList("DeptMapper1.selectDynamicDeptno", dept);
				if(list.size() == 0) {
	  				throw new Exception("찾는 레코드가 없습니다.");
	  		}
				return list;
				
		}

		  public List<Dept> selectDynamicChoose(SqlSession session, HashMap<String, String> map) throws Exception {
				// TODO Auto-generated method stub
		  		List<Dept> list = session.selectList("Mapper1.selectDynamicChoose",map);
		  		if(list.size() == 0) {
		  				throw new Exception("찾는 레코드가 없습니다.");
		  		}
				return list;
		}
		  
		  

		

}
