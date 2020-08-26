import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test08_05 {
		
		static String driver = "oracle.jdbc.driver.OracleDriver";
		static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		static String userid = "test";
		static String passwd = "test";
		
		static Connection conn= null;
		static ResultSet rs= null;
		static PreparedStatement pstmt= null;


		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Discarded_Product prod = null;
				try {
						Class.forName(driver);
						System.out.println("Driver Loading");
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("Connection");
						
						String deleteSql = "delete from product where factno in "
										+ "(select factno from Discarded_Product)";
						pstmt = conn.prepareStatement(deleteSql);
						int num = pstmt.executeUpdate();
						System.out.println(num + "개 레코드 삭제 ");
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}
				
		}

}
