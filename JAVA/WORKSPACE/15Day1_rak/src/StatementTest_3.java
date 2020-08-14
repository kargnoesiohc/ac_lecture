import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementTest_3 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				String driver = "oracle.jdbc.driver.OracleDriver"; 
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String userid = "scott";
				String passwd = "tiger";
				
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				
				try {
					Class.forName(driver);
					System.out.println("드라이버 로딩 성공");
					conn = DriverManager.getConnection(url,userid,passwd);
					System.out.println("db 접속 성공");
					//sql 작성
//					int deptno = 13;
//					String dname="개발";
//					String loc = "서울";
//					String insertSql = "insert into dept(deptno,dname,loc) values("+deptno+", '"+dname+"','"+loc+"')";
//					stmt = conn.createStatement();
//					System.out.println("쿼리 등록 성공");
//					int result = stmt.executeUpdate(insertSql);
//					System.out.println("실행된 레코드 갯수: "+ result);
					
					String selectSql = "select * from dept ";
					stmt = conn.createStatement();
					rs = stmt.executeQuery(selectSql);
					while(rs.next()) {
							int deptno = rs.getInt(1);
							String dname = rs.getString(2);
							String loc = rs.getString(3);
							System.out.println(deptno+"/"+dname+"/"+loc);
					}
					
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				} finally {
						try {
								rs.close();
								stmt.close();
								conn.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
				}
				
		}

}
