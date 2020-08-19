package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMybatisDAO {

		public List<Dept> deptSelectAll(SqlSession session) {
				// <select id="deptSelectAll"
				List<Dept> list = session.selectList("deptSelectAll");
				return list;
		} // end dpetSelectAll
		
		public Dept deptSelectOne(SqlSession session, int deptno) throws Exception {
				// TODO Auto-generated method stub
				Dept dept = session.selectOne("deptSelectOne",deptno);
				if(dept == null) {
						throw new Exception("찾으려는 레코드가 없습니다.");
				}
				return dept;
		} //end deptSelectOne

		public List<Dept> deptSelectPlural(SqlSession session, Dept dept) throws Exception {
				// TODO Auto-generated method stub
				List<Dept> list = session.selectList("deptSelectPlural", dept);
				if(list.size() == 0) {
						throw new Exception("찾으려는 레코드가 없습니다.");
				}

				return list;
		} // end deptSelectPlural

		public void deptInsert(SqlSession session, Dept dept) {
				// TODO Auto-generated method stub
				int result = session.insert("deptInsert", dept);
				
		}//end deptInsert
		
		public void deptUpdate(SqlSession session, Dept dept) throws Exception {
				// TODO Auto-generated method stub
				int result = session.update("deptUpdate", dept);
				if(result == 0) 
						throw new Exception("업데이트 할 레코드가 없습니다.");
			  else 
						System.out.println(result + "개 레코드 업데이트");
		}//end deptUpdate
		
		public void deptDelete(SqlSession session, int deptno) throws Exception {
				// TODO Auto-generated method stub
				int result = session.delete("deptDelete", deptno);
				if(result == 0) 
						throw new Exception("업데이트 할 레코드가 없습니다.");
			  else 
						System.out.println(result + "개 레코드 삭제");
		}//end deptDelete

		

}
