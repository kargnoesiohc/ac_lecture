import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test08_03 {
		
		static String driver = "oracle.jdbc.driver.OracleDriver";
		static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		static String userid = "test";
		static String passwd = "test";
		
		static Connection conn = null;
		static PreparedStatement pstmt = null;
		static ResultSet rs = null;
		
		public static void main(String[] args) {
				Discarded_Product prod = new Discarded_Product();
				try {
						Class.forName(driver);
						System.out.println("Driver Loading");
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("Connection");

						String createQuery = "create table DISCARDED_PRODUCT( "
										+ "pdno int not null,"
										+ "pdname varchar2(10),"
										+ "pdsubname varchar2(10),"
										+ "factno varchar2(5),"
										+ "pddate date,"
										+ "pdcost int,"
										+ "pdprice int,"
										+ "pdamount int,"
										+ "discarded_date date, "
										+ "primary key(pdno), "
										+ "foreign key(factno) references factory(factno) "+")";
						pstmt = conn.prepareStatement(createQuery);
						pstmt.execute(createQuery);
						System.out.println("테이블 생성");
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}finally {
						try {
								if(pstmt!=null)pstmt.close();
								if(conn!=null)conn.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
				}
		}
}
