package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.TestDTO;

/*
  create table test
( num number(4) primary key,
  username varchar2(10),
  address varchar2(10) );
  
  insert into test values ( 1, '홍길동' , '서울');
insert into test values ( 2, '이순신' , '전라');
insert into test values ( 3, '유관순' , '서울');
insert into test values ( 4, '강감찬' , '서울');
insert into test values ( 5, '유재석' , '서울');
   commit;
 */
@Repository
public class TestDAO {

	@Autowired
	DataSource datasource;
	public ArrayList<TestDTO> select() {
		ArrayList<TestDTO> list = new ArrayList<TestDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = datasource.getConnection();// connection연결
			String sql = "select * from test";// sql작성
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // select 는 executeQuery()//sql실행
			while (rs.next()) {// 결과에서 레코드 추출
				int n = rs.getInt("num");
				String n2 = rs.getString("username");
				String n3 = rs.getString("address");
				TestDTO dto = new TestDTO(n, n2, n3);// 모델 클래스에 저장
				list.add(dto);// 리스트에 모델 클래스 add
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}// end select

	public void insert(int num, String name, String address) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = datasource.getConnection();
			String sql = "insert into test (num, username,address) " + " values ( ? , ? , ? )";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num); // sql 들어갈 값 지정
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			// insert, delete, update 은 executeUpdate()
			int n = pstmt.executeUpdate();// sql실행, 결과 갯수 리턴
			if(n != 0) {
				System.out.println("레코드 삽입 성공");
			} else {
				System.out.println("레코드 삽입 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}// end insert

	// num에 해당하는 레코드 수정
	public void update(int num, String name, String address) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = datasource.getConnection();
			String sql = "update test set username =?, address= ? where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(3, num);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			// insert, delete, update 은 executeUpdate()
			int n = pstmt.executeUpdate();
			if(n != 0) {
				System.out.println("레코드 업데이트 성공");
			} else {
				System.out.println("레코드 업데이트 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void delete(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = datasource.getConnection();
			String sql = "delete from test where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			// insert, delete, update 은 executeUpdate()
			int n = pstmt.executeUpdate();
			if(n != 0) {
				System.out.println("레코드 삭제 성공");
			} else {
				System.out.println("레코드 삭제 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// end delete

}
