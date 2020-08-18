package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTxDAO {
		 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
	public void update(Connection conn,Dept dept)throws RecordNotFoundException, SQLException {
					String updateQuery = "update dept set dname = ?, loc = ? where deptno = ?";
					pstmt = conn.prepareStatement(updateQuery);
					pstmt.setString(1, dept.getDname());
					pstmt.setString(2, dept.getLoc());
					pstmt.setInt(3, dept.getDeptno());
					int num = pstmt.executeUpdate();
					if(num<=0) 
							throw new RecordNotFoundException("업데이트 할 자료가 없습니다.");
					else
							System.out.println(num+"개 행 업데이트");
					
					
					try {
							if(pstmt!=null)pstmt.close();
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
			
	}//end upate

	public void delete(Connection conn,int n) throws SQLException, RecordNotFoundException {
					String deleteQuery = "delete from dept where deptno = ?";
					pstmt = conn.prepareStatement(deleteQuery);
					pstmt.setInt(1, n);
					int num = pstmt.executeUpdate();
					if(num <= 0) 
							throw new RecordNotFoundException("삭제 할 행이 없습니다.");
					else
							System.out.println(num+"개 행 삭제");
					try {
							if(pstmt!=null)pstmt.close();
					} catch (Exception e2) {
						// TODO: handle exception
							e2.printStackTrace();
					}
					
	}
	public void insert(Connection conn,Dept dept) throws SQLException {
				String insertQuery = "insert into dept(deptno, dname, loc) values (?,?,?)";
				pstmt = conn.prepareStatement(insertQuery);
				pstmt.setInt(1, dept.getDeptno());
				pstmt.setString(2, dept.getDname());
				pstmt.setString(3, dept.getLoc());
				int num = pstmt.executeUpdate();
				System.out.println(num+"개 행 삽입 ");
				
				try {
						if(pstmt!=null)pstmt.close();
				} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
				}
	}//end insert
	
	
	
	public ArrayList<Dept> select(Connection conn)throws SQLException{
			ArrayList<Dept> list = new ArrayList<>();
			
					String selectQuery = "select * from dept";
					pstmt = conn.prepareStatement(selectQuery);
					rs = pstmt.executeQuery();
					while(rs.next()) {
							Dept dept = new Dept();
							dept.setDeptno(rs.getInt(1));
							dept.setDname(rs.getString(2));
							dept.setLoc(rs.getString(3));
							list.add(dept);
					}
					
				try {
						if(rs!=null)rs.close();
						if(pstmt!=null)pstmt.close();
				} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
				}
			
			return list;
	
	}//end select
}
