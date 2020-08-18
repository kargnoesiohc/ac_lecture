package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.dto.Dept;

public class OracleDAO {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";
		
		Connection conn= null;
		ResultSet rs= null;
		PreparedStatement pstmt= null;
		
		public OracleDAO() {
				// TODO Auto-generated constructor stub
				try {
						Class.forName(driver);
						System.out.println("Driver Loading");
				} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
		}
		
		public ArrayList<Dept> select() throws Exception{
				//전체 데이터 service로 리턴 -> service에서 다시 메인으로 리턴 -> 메인에서 출력
				ArrayList<Dept> list = new ArrayList<>();
				conn = DriverManager.getConnection(url,userid,passwd);
				System.out.println("DB Connect \n");
				String selectQuery = "select * from dept";
				pstmt = conn.prepareStatement(selectQuery);
				rs = pstmt.executeQuery();
				while(rs.next()) {
						Dept dept = new Dept();
						dept.setDeptno(rs.getInt(1));
						dept.setDname(rs.getString(2));
						dept.setLoc(rs.getString(2));
						list.add(dept);
				}
				try {
						if(rs!=null)rs.close(); 
						if(pstmt!=null)pstmt.close(); 
						if(conn!=null)conn.close(); 
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}
				
				return list;
		} //end select()
		
	
		
		public void insert(Dept dept) throws Exception {
				conn = DriverManager.getConnection(url,userid,passwd);
				System.out.println("DB Connect \n");
				String insertQuery = "insert into dept(deptno, dname, loc) values (?,?,?)";
				pstmt = conn.prepareStatement(insertQuery);
				pstmt.setInt(1, dept.getDeptno());
				pstmt.setString(2, dept.getDname());
				pstmt.setString(3, dept.getLoc());
				int num = pstmt.executeUpdate();
				System.out.println("\n"+num+"개 행 삽입");
				
				try {
						if(pstmt!=null)pstmt.close(); 
						if(conn!=null)conn.close(); 
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}
		} // end insert
		
		public void update(Dept dept) throws Exception {
				conn = DriverManager.getConnection(url,userid,passwd);
				System.out.println("DB Connect \n");
				String updateQuery = "update dept set dname=?,loc=? where deptno = ? ";
				pstmt = conn.prepareStatement(updateQuery);
				pstmt.setString(1, dept.getDname());
				pstmt.setString(2, dept.getLoc());
				pstmt.setInt(3, dept.getDeptno());
				int num = pstmt.executeUpdate();
				if(num <= 0 ) {
						throw new Exception("업데이트 할 자료가 없습니다.");
				} else
						System.out.println("\n"+num+"개 행 업데이트");
				
				try {
						if(pstmt!=null)pstmt.close(); 
						if(conn!=null)conn.close(); 
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}
		} // end update
		
		public void delete(int deptno) throws Exception {
				conn = DriverManager.getConnection(url,userid,passwd);
				System.out.println("DB Connect \n");
				String deleteQuery = "delete from dept where deptno =?";
				pstmt = conn.prepareStatement(deleteQuery);
				pstmt.setInt(1, deptno);
				int num = pstmt.executeUpdate();
				if(num <= 0) {
						throw new Exception("삭제 할 자료가 없습니다.");
				} else
						System.out.println("\n"+num+"개 행 삭제");
				try {
						if(pstmt!=null)pstmt.close(); 
						if(conn!=null)conn.close(); 
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}
		} // end delete
		
		public ArrayList<Dept> selectByDeptno(int deptno) throws Exception{
				//전체 데이터 service로 리턴 -> service에서 다시 메인으로 리턴 -> 메인에서 출력
				conn = DriverManager.getConnection(url,userid,passwd);
				System.out.println("DB Connect \n");
				ArrayList<Dept> list = new ArrayList<>();
				String selectQuery = "select * from dept where deptno = ?";
				pstmt = conn.prepareStatement(selectQuery);
				pstmt.setInt(1, deptno);
				rs = pstmt.executeQuery();
				while(rs.next()) {
						Dept dept = new Dept();
						dept.setDeptno(rs.getInt(1));
						dept.setDname(rs.getString(2));
						dept.setLoc(rs.getString(3));
						list.add(dept);
				}
				if(list.size() == 0) {
						throw new Exception("검색 할 자료가 없습니다.");
				}
				try {
						if(rs!=null)rs.close(); 
						if(pstmt!=null)pstmt.close(); 
						if(conn!=null)conn.close(); 
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}
				
				return list;
		} //end select()
		
		public ArrayList<Dept> selectByNameLoc(HashMap<String, String> map) throws Exception{
				conn = DriverManager.getConnection(url,userid,passwd);
				System.out.println("DB Connect \n");
				ArrayList<Dept> list = new ArrayList<>();
				String selectQuery = "select * from dept where dname = ? and loc = ?";
				pstmt = conn.prepareStatement(selectQuery);
				
				pstmt.setString(1, map.get("dname"));
				pstmt.setString(2, map.get("loc"));
				
				System.out.println(map.get("dname")+map.get("loc"));
				
				rs = pstmt.executeQuery();
				while(rs.next()) {
						Dept dept = new Dept();
						dept.setDeptno(rs.getInt(1));
						dept.setDname(rs.getString(2));
						dept.setLoc(rs.getString(3));
						list.add(dept);
				}
				if(list.size() == 0) {
						throw new Exception("검색 할 자료가 없습니다.");
				}
				
				try {
						if(rs!=null)rs.close(); 
						if(pstmt!=null)pstmt.close(); 
						if(conn!=null)conn.close(); 
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}
				
				return list;
		}
}
