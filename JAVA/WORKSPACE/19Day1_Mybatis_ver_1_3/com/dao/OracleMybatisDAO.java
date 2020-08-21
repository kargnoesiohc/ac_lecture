package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMybatisDAO {

		public List<Dept> deptSelectAll(SqlSession session) {
				// <select id="deptSelectAll"
				List<Dept> list = session.selectList("DeptMapper1.deptSelectAll");
				return list;
		} // end dpetSelectAll
		
		public Dept deptSelectOne(SqlSession session, int deptno) throws Exception {
				// TODO Auto-generated method stub
				Dept dept = session.selectOne("DeptMapper1.deptSelectOne",deptno);
				if(dept == null) {
						throw new Exception("찾는 레코드가 없습니다.");
				}
				return dept;
		} //end deptSelectOne

		public List<Dept> deptSelectByNameAndLoc(SqlSession session, HashMap<String, String> map) throws Exception {
				// TODO Auto-generated method stub
				List<Dept> list;
				if(map.get("dname") == null) {
						list = session.selectList("DeptMapper1.deptSelectLoc",map.get("loc")); 
				} else if(map.get("loc") == null) {
						list = session.selectList("DeptMapper1.deptSelectName",map.get("dname"));
				} else
						list = session.selectList("DeptMapper1.deptSelectNameLoc",map);
				if(list.size() == 0) {
						throw new Exception("찾는 레코드가 없습니다.");
				}

				return list;
		} // end deptSelectPlural

		public void deptInsert(SqlSession session, Dept dept) {
				// TODO Auto-generated method stub
				int result = session.insert("DeptMapper2.deptInsert", dept);
				System.out.println(result+" 개 레코드 삽입");
				
		}//end deptInsert
		
		public void deptUpdate(SqlSession session, Dept dept) throws Exception {
				// TODO Auto-generated method stub
				int result = session.update("DeptMapper2.deptUpdate", dept);
				if(result == 0) 
						throw new Exception("업데이트 할 레코드가 없습니다.");
			  else 
						System.out.println(result + "개 레코드 업데이트");
		}//end deptUpdate
		
		public void deptDelete(SqlSession session, int deptno) throws Exception {
				// TODO Auto-generated method stub
				int result = session.delete("DeptMapper2.deptDelete", deptno);
				if(result == 0) 
						throw new Exception("업데이트 할 레코드가 없습니다.");
			  else 
						System.out.println(result + "개 레코드 삭제");
		}//end deptDelete

		public int deptRecordCount(SqlSession session) {
				List<Dept> list = session.selectList("DeptMapper1.deptSelectAll");
				int result = 0;
				for(Dept dept:list) {
						result++;
				} 
				return result;
				// TODO Auto-generated method stub
				
		}

		public List<Dept> deptSelectByHashMap(SqlSession session, HashMap<String, Integer> map) throws Exception {
				List<Dept> list = session.selectList("DeptMapper1.deptSelectHashMap",map);
				if(list.size() == 0) {
						throw new Exception("찾는 레코드가 없습니다.");
				}
				return list;
		}

		public List<Dept> deptSelectByDeptNoIn(SqlSession session, HashMap<String, Integer> map) throws Exception {
				// TODO Auto-generated method stub
				List<Dept> list = session.selectList("DeptMapper1.deptSelectByDeptNoIn",map);
				if(list.size() == 0) {
						throw new Exception("찾는 레코드가 없습니다.");
				}
				return list;
		}

		public HashMap<String,Dept> deptSelectByDeptnoHashMap(SqlSession session, int deptno) throws Exception {
				// TODO Auto-generated method stub
				HashMap<String,Dept> map = session.selectOne("DeptMapper1.deptSelectByDeptnoHashMap", deptno);
				if(map == null) {
						throw new Exception("찾는 레코드가 없습니다.");
				}
				return map;
		}

		

}
