import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class Test08_04 {
		static String driver = "oracle.jdbc.driver.OracleDriver";
		static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		static String userid = "test";
		static String passwd = "test";
		
		static Connection conn= null;
		static ResultSet rs= null;
		static PreparedStatement pstmt= null;
		
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				try {
						Class.forName(driver);
						System.out.println("Driver Loading");
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("Connect");
								String insertSql = "insert into Discarded_Product"
												+ "(select pdno, pdname, pdsubname, factno, pddate, pdcost, pdprice, "
												+ "pdamount, sysdate from product "
												+ "where factno = (select factno from factory where facloc='CHANGWON'))";
								pstmt = conn.prepareStatement(insertSql);
								int num = pstmt.executeUpdate();
								System.out.println(num + "개 레코드 삽입");
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}
			

		}

}
