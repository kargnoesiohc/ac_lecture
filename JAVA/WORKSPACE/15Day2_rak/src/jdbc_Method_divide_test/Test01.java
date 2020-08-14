package jdbc_Method_divide_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01 {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";
		
		Connection conn= null;
		ResultSet rs= null;
		PreparedStatement pstmt= null;
		
		public Test01() {
				// TODO Auto-generated constructor stub
				try {
						Class.forName(driver);
						System.out.println("드라이버 로딩 완료");
						
				} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
		}
		public  String deptAdata(int deptno) {
				//deptno를 select 하기 위한 sql문 작성
				// 한부서의 정보를 string으로 리턴 
				String result = null;
				try {
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("db 접속 성공");
						String selectQuery = "Select deptno, dname, loc from dept where deptno=?";
						pstmt = conn.prepareStatement(selectQuery);
						pstmt.setInt(1, deptno);
						rs = pstmt.executeQuery();
						while(rs.next()) {
								int deptnum = rs.getInt("deptno");
								String dname = rs.getString("dname");
								String loc = rs.getString("loc");
								result = deptnum+"/"+dname+"/"+loc;
						}
				} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				} finally {
						try {
								if(rs!=null)rs.close();
								if(pstmt!=null)pstmt.close();
								if(conn!=null)conn.close();
						} catch (Exception e) {
								// TODO: handle exception
								e.printStackTrace();
						}
				}
				return result;
			}
		public int delAdata(int deptno) {
				int num = 0;
				try {
						conn = DriverManager.getConnection(url,userid,passwd);
						String deleteQuery = "delete from dept where deptno = ?";
						pstmt = conn.prepareStatement(deleteQuery);
						pstmt.setInt(1, 99);
						num = pstmt.executeUpdate();
				} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				} finally {
						try {
								if(pstmt!=null)pstmt.close();
								if(conn!=null)conn.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
				}
				return num;
		}
		
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Test01 test01 = new Test01();
				System.out.println(test01.deptAdata(10));
				System.out.println("쿼리 실행 레코드 개수: " + test01.delAdata(99));
		}

}
