import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementTest_1 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				//DB 종료에 따른 JDBC DRIVER 클래스
				String driver = "oracle.jdbc.driver.OracleDriver"; //6_g.jar파일
				//DB접속 url
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				//DB접속 id, password
				String userid = "scott";
				String passwd = "tiger";
				
				Connection conn = null; //jdbc 연결 Connection 생성
				Statement stmt = null; // Statement(실행 객체) 생성
				ResultSet rs = null; // 결과를 담을 ResultSet 생성
				
				try {
						Class.forName(driver); //1. 드라이버 로딩
						System.out.println("드라이버 로딩 성공");
						//2.오라클 연결(Connection)
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("db 접속 성공");
						//3.sql 작성
						String sql = "select deptno x, dname, loc from dept";
//						String sql = "select deptno, dname, loc from dept";
						//실행할 쿼리정보 등록
						//4.Connection에서 명령을 실행해 줄 Statement 객체를 얻어옴
						stmt = conn.createStatement();
						//5.Statement를 이용 쿼리 실행
						rs = stmt.executeQuery(sql);
						while(rs.next()) {
								int deptno = rs.getInt(1); //"x" 컬럼 index로도 가능
								String dname = rs.getString(2); //"dname" 컬럼 index로도 가능
								String loc = rs.getString(3); //"loc" 컬럼 index로도 가능
								System.out.println(deptno+"/"+dname+"/"+loc);
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
