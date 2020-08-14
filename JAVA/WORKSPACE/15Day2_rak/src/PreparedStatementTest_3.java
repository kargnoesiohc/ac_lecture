import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementTest_3 {

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
//						String updateQuery = "update dept set dname=?, loc=? where deptno = ?";
//						pstmt = conn.prepareStatement(updateQuery);
//						pstmt.setString(1, "영업");
//						pstmt.setString(2, "제주");
//						pstmt.setInt(3, 90);
//						int num = pstmt.executeUpdate();
//						System.out.println(num +"개 레코드 수정");
						
//						String selectQuery ="select * from dept where deptno = ?"; //1)deptno 가 90인 레코드만 출력
//						String selectQuery = "select * from dept where dname = ? or dname = ?"; //2)dname이 개발 또는 영업만  출력
//						String selectQuery = "select * from dept order by deptno"; //3)deptno 기준 오름차순
//						String selectQuery = "select count(*) from dept";//4) dept 테이블 레코드 개수
//						String selectQuery = "select loc from dept where deptno >= ?";//5)부서번호 20 이상인 부서의 지역
//						String selectQuery = "select * from dept where dname like ?";//6)부서 이름이 A로 시작
//						String selectQuery = "select  * from dept where deptno ="
//										+ "(select max(deptno) from dept)"; //7) 부서번호가 제일 높은 부서(subquery 이용)
//					
							//8) 부서번호 99, 개발, 서울 추가
//						String insertQuery = "insert into dept(deptno, dname, loc) values(?,?,?)";
//						pstmt = conn.prepareStatement(insertQuery);
//						pstmt.setInt(1, 99);
//						pstmt.setString(2, "개발");
//						pstmt.setString(3, "서울");
//						int num = pstmt.executeUpdate();
//						System.out.println(num +"개 레코드 수정");
						
						  //8) 부서번호 99인 레코드의 지역을 제주로 변경
//						String updateQuery = "update dept set loc=? where deptno = ?";
//						pstmt = conn.prepareStatement(updateQuery);
//						pstmt.setString(1, "제주");
//						pstmt.setInt(2, 99);
//						int num = pstmt.executeUpdate();
//						System.out.println(num +"개 레코드 수정");
						
						  //8) 부서번호 99인 레코드 출력
//						String selectQuery = "select * from dept where deptno = ?";
//						pstmt = conn.prepareStatement(selectQuery);
//						pstmt.setInt(1, 99);
//						pstmt = conn.prepareStatement(selectQuery);
//						pstmt.setInt(1, 90); //1)
//						pstmt.setString(1,"개발");//2)
//						pstmt.setString(2,"영업");//2)
//						pstmt.setInt(1,20);//5)
//						pstmt.setString(1,"A%");//6)
							
						int rowCount=0; //4) 레코드 카운트 변수
						
						rs = pstmt.executeQuery();
						while(rs.next()) {
								int deptno = rs.getInt("deptno");
								String dname = rs.getString("dname");
								String loc = rs.getString("loc");
								System.out.println(deptno+"/"+dname+"/"+loc);
//								rowCount = rs.getInt(1);//4)
//								System.out.println("레코드 개수: "+rowCount); //4)
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
