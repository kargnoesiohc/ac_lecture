import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementTest_2 {

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
//						String sql = "select deptno x, dname, loc from dept where dname = 'SALES' "; //''(작은따옴표) -> 문자열 또는 사용자 생성 변수(문자열) 삽입시 사용
						String name = "SALES";
						String sql = "select deptno x, dname, loc from dept where dname ='"+name+"'"; 
						
						stmt = conn.createStatement();
						System.out.println("sql실행");
						rs = stmt.executeQuery(sql);
						System.out.println("결과 받기 완료");
						while(rs.next()){
								int deptno = rs.getInt("x");
								String dname = rs.getString("dname");
								String loc = rs.getString("loc");
								System.out.println(deptno +"\t"+dname+"\t"+loc);
						}
				} catch (Exception e) {
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
