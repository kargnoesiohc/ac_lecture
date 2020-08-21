package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Emp;

public class EmpDAO {

		public List<Emp> EmpSelectAll(SqlSession session) {
				// TODO Auto-generated method stub
				List<Emp> list = session.selectList("selectAll");
				return list;
		} // end EmpSelectAll()

		public Emp EmpSelectByNo(SqlSession session, int empno) {
				// TODO Auto-generated method stub
				Emp emp = session.selectOne("selectByNo", empno);
				return emp;
		} // end EmpSelectAll()

		public void EmpInsert(SqlSession session, Emp emp) {
				// TODO Auto-generated method stub
				int result = session.insert("insert",emp);
				System.out.println(result+" 개 레코드 삽입");
		}

		public void EmpUpdate(SqlSession session, Emp emp) throws Exception {
				// TODO Auto-generated method stub
				int result = session.update("update",emp);
				if(result == 0) {
						throw new Exception("업데이트 할 레코드가 없습니다.");
				} else
				System.out.println(result+" 개 레코드 업데이트");
		}

		public void EmpDelete(SqlSession session, int empno) throws Exception {
				// TODO Auto-generated method stub
				int result = session.delete("delete",empno);
				if(result == 0) {
						throw new Exception("삭제 할 레코드가 없습니다.");
				} else
						System.out.println(result+"개 레코드 업데이트");
		}


}
