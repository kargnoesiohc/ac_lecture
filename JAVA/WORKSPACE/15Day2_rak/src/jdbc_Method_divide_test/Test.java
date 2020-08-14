package jdbc_Method_divide_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";
		
		Connection conn= null;
		ResultSet rs= null;
		PreparedStatement pstmt= null;
		public Test() {
				// TODO Auto-generated constructor stub
				try {
						Class.forName(driver);
						System.out.println("드라이버 로딩 완료");
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("db 접속 성공");
				} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
		}
		public  PreparedStatement deptAdata() {
				//deptno를 select 하기 위한 sql문 작성
				// 한부서의 정보를 string으로 리턴 
				try {
						String selectQuery = "Select deptno, dname, loc from dept";
						pstmt = conn.prepareStatement(selectQuery);
						rs = pstmt.executeQuery();
						while(rs.next()) {
								int deptno = rs.getInt("deptno");
								String dname = rs.getString("dname");
								String loc = rs.getString("loc");
								System.out.println(deptno+"/"+dname+"/"+loc);
						}
				} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
				
				return pstmt;
			}
		
}
