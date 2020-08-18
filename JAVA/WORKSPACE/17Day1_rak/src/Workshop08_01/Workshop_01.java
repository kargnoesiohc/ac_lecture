package Workshop08_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Workshop_01 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String userid = "test";
				String passwd = "test";
				
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				try {
						Class.forName(driver);
						System.out.println("Driver Loading");
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("DB Connection");
						System.out.print("매출 조회 메뉴 - [ 매출 일자순: 1, 상품별 매출순:2 ] : ");
						int n = scan.nextInt();
						switch(n) {
						case 1: 
								String selectQuery = "select to_char(o.odate,'yyyy-mm-dd'), sum(p.price*o.quantity) "
												+ "from d7_order o "
												+ "join d7_product p "
												+ "using(pid) "
												+ "group by o.odate "
												+ "order by o.odate";
								pstmt = conn.prepareStatement(selectQuery);
								rs = pstmt.executeQuery();
								System.out.println("영업일\t\t매출");
								while(rs.next()) {
										System.out.println(rs.getDate(1) +"\t"+rs.getInt(2));
								}
								
								break;
						case 2: 
								String selectQuery2 = "select p.pname, sum(p.price*o.quantity) as sum "
												+ "from d7_order o "
												+ "join d7_product p "
												+ "on o.pid = p.pid "
												+ "group by p.pname "
												+ "order by sum desc";
								pstmt = conn.prepareStatement(selectQuery2);
								rs = pstmt.executeQuery();
								System.out.println("상품명\t\t매출");
								while(rs.next()){
										System.out.println(rs.getString(1)+"\t\t"+rs.getInt(2));
								}
								break;
						default:
								break;
						}
						
				} catch (Exception e) {
						// TODO Auto-generated catch block
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
