import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementTest_2 {

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
						conn = DriverManager.getConnection(url,userid,passwd);
						String insertSql = "insert into dept(deptno, dname, loc) values(?,?,?)";
						pstmt = conn.prepareStatement(insertSql);
						pstmt.setInt(1, 90); //컬럼 순서, ?에 들어갈 데이터 set 
						pstmt.setString(2, "개발");
						pstmt.setString(3, "서울");
						int num = pstmt.executeUpdate();
						System.out.println("수행 된 레코드 수: "+num);
						
						String selectSql = "select * from dept where deptno = ? or dname= ? ";
						pstmt = conn.prepareStatement(selectSql);
						pstmt.setInt(1, 12);
						pstmt.setString(2, "인사");
						rs = pstmt.executeQuery();
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
