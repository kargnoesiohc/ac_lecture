import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementTest_4 {

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
//						int deptno = 90;
//						String dname="개발";
//						String loc = "서울";
//						String insertSql = "insert into dept(deptno, dname, loc) values("+deptno+",'"+dname+"','"+loc+"')";
//						stmt = conn.createStatement();
//						System.out.println("쿼리 등록 성공");
//						stmt.executeUpdate(insertSql);
						
//						String dname="영업";
//						String loc="제주";
//						String updateSql = "update dept set dname='"+dname+"', loc='"+loc+"' where deptno = 90";
//						stmt = conn.createStatement();
//						stmt.executeUpdate(updateSql);
//						System.out.println("쿼리 등록 성공");
						
						int deptno=90;
						String deleteSql = "delete from dept where deptno='"+deptno+"'";
						stmt = conn.createStatement();
						stmt.executeUpdate(deleteSql);
						System.out.println("쿼리 등록 성공");

						String selectSql = "select * from dept";
						rs = stmt.executeQuery(selectSql);
						while(rs.next()) {
								deptno = rs.getInt(1);
								String dname = rs.getString(2);
								String loc = rs.getString(3);
								System.out.println(deptno+"/"+dname+"/"+loc);
						}
						
				}catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				} finally {
						try {
								if(rs!=null)rs.close();
								if(stmt!=null)stmt.close();
								if(conn!=null)conn.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
				}
		}

}
