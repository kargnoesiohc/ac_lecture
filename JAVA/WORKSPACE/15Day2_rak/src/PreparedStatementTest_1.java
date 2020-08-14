import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementTest_1 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				String driver = "oracle.jdbc.driver.OracleDriver"; 
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String userid = "scott";
				String passwd = "tiger";
				
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				try {
						Class.forName(driver);
						System.out.println("드라이버 로딩 성공");
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("db 접속 성공");
						String selectSql = "select deptno, dname, loc from dept";
						pstmt = conn.prepareStatement(selectSql); //주의
						System.out.println("쿼리 등록 성공");
						rs = pstmt.executeQuery(); //주의
						
						while(rs.next()) {
								int deptno = rs.getInt("deptno");
								String dname = rs.getString("dname");
								String loc = rs.getString("loc");
								System.out.println(deptno+"/"+dname+"/"+loc);
						}
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				} finally {
						try {
								if(rs!=null)rs.close();
								if(pstmt!=null)pstmt.close();
								if(conn!=null)conn.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
				}
		}

}
