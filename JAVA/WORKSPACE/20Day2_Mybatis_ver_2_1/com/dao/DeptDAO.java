package com.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class DeptDAO {

		public List<Dept> multiSelect(SqlSession session, List<Integer> deptnoes) {
				// TODO Auto-generated method stub
				List<Dept> list = session.selectList("multiSelect",deptnoes);
				return list;
		}

		public void multiUpdateLoc(SqlSession session, List<Integer> deptno) throws Exception {
				// TODO Auto-generated method stub
				int result = session.update("updateLoc", deptno);
				if(result == 0) {
						throw new Exception("업데이트 할 레코드가 없습니다.");
				} else
						System.out.println(result+" 개 레코드 업데이트");
				
		}

		public void multiDelete(SqlSession session, List<Integer> deptno) throws Exception {
				int result = session.delete("deleteLoc", deptno);
				
				if(result == 0) {
						throw new Exception("삭제 할 레코드가 없습니다.");
				} else 
						System.out.println(result+" 개 레코드 삭제");
				
				// TODO Auto-generated method stub
				
		}

		public void multiInsertAll(SqlSession session, List<Dept> depts) {
				// TODO Auto-generated method stub
				int result = session.insert("insertAll",depts);
				System.out.println(result+" 개 레코드 삽입");

				
		}

		public List<Dept> selectTopN(SqlSession session, int offset, int limit) {
				// TODO Auto-generated method stub
				RowBounds row = new RowBounds(offset, limit);
				List<Dept> list = session.selectList("selectTopN",null,row);
				return list;
		}

}
