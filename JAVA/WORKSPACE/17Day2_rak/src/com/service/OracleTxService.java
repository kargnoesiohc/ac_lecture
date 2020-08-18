package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleTxDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTxService {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";

	OracleTxDAO dao;
	
	Connection conn = null;

	public OracleTxService() throws ClassNotFoundException {
			Class.forName(driver);
			System.out.println("Driver Loading");
			dao = new OracleTxDAO();
		//드라이버 로딩
		//dao생성
	}// end OracleDAO

	public ArrayList<Dept> select() throws SQLException {
			conn = DriverManager.getConnection(url,userid,passwd);
			System.out.println("DB Connect");
			ArrayList<Dept> list = dao.select(conn);
				try {
						if(conn != null)conn.close();
				} catch (SQLException e) {
					// TODO: handle exception
						e.printStackTrace();
				}	
			
		return list;
		//db연결
		//select호출 - conn을 인자로 넘김
		//connection 끊기
	}// end select

	public void insert(Dept dept) throws SQLException {
			conn = DriverManager.getConnection(url,userid,passwd);
			System.out.println("DB Connect");
			dao.insert(conn, dept);
			try {
					if(conn != null)conn.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
			}
				
	}// end insert
	public void update(Dept dept)throws RecordNotFoundException, SQLException {
			conn = DriverManager.getConnection(url,userid,passwd);
			System.out.println("DB Connect");
			dao.update(conn, dept);
			try {
					if(conn != null)conn.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
			}

	}//end update

	public void delete(int n) throws SQLException, RecordNotFoundException {
		// TODO Auto-generated method stub
			conn = DriverManager.getConnection(url,userid,passwd);
			System.out.println("DB Connect");
			dao.delete(conn, n);
			
			try {
					if(conn != null)conn.close();
			} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
			}
	}//end delete
	
//기본적으로 auto commit, con.setAutoCommit(true/false) - default: true
//insert와 delete를 하나로 묶음 -> 트랜잭션(작업 단위)
	public void insertDelete(Dept dept, int i) throws SQLException, RecordNotFoundException {
			try {
					conn = DriverManager.getConnection(url,userid,passwd);
					conn.setAutoCommit(false);
					System.out.println("DB Connect");
					
					dao.insert(conn, dept);
					dao.delete(conn, i);
					
					conn.commit(); //트랜잭션 완료 시
		} catch (SQLException e) {
				// TODO: handle exception
				conn.rollback();
				System.out.println("rollback");
				e.printStackTrace();
		} finally {
						try {
								if(conn!=null) conn.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
		}
	}

}



