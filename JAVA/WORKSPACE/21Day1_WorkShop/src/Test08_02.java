import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test08_02 {
		
		String pdname;
		String pdsubname;
		int pdcost;
		int pdprice;
		
		static String driver = "oracle.jdbc.driver.OracleDriver";
		static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		static String userid = "test";
		static String passwd = "test";
		
		static Connection conn = null;
		static PreparedStatement pstmt = null;
		static ResultSet rs = null;
		
		public Test08_02() {
				// TODO Auto-generated constructor stub
		}
		
		
		public Test08_02(String pdname, String pdsubname, int pdcost, int pdprice) {
				super();
				this.pdname = pdname;
				this.pdsubname = pdsubname;
				this.pdcost = pdcost;
				this.pdprice = pdprice;
		}

		public String getPdsubname() {
				return pdsubname;
		}

		public void setPdsubname(String pdsubname) {
				this.pdsubname = pdsubname;
		}

		public int getPdcost() {
				return pdcost;
		}

		public void setPdcost(int pdcost) {
				this.pdcost = pdcost;
		}

		public int getPdprice() {
				return pdprice;
		}

		public void setPdprice(int pdprice) {
				this.pdprice = pdprice;
		}

		
		public String getPdname() {
				return pdname;
		}

		public void setPdname(String pdname) {
				this.pdname = pdname;
		}

		@Override
		public String toString() {
				return "Test08_02 [pdsubname=" + pdsubname + ", pdcost=" + pdcost + ", pdprice="
								+ pdprice + "]";
		}

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				try {
						
						Class.forName(driver);
						System.out.println("Driver Loading");
						List<Test08_02> list = new ArrayList<>();
						conn = DriverManager.getConnection(url,userid,passwd);
						
						String selectQuery = 
										"select pdsubname, pdcost, pdprice from product where pdcost "
										+ " > (select min(pdcost) from product where pdname = ?) " + 
										"and pdcost < (select max(pdcost) from product where pdname = ?)";
						pstmt = conn.prepareStatement(selectQuery);
						
						pstmt.setString(1, "TV");
						pstmt.setString(2, "CELLPHONE");
						rs = pstmt.executeQuery();
						
						while(rs.next()) {
								Test08_02 product = new Test08_02();
								product.setPdsubname(rs.getString(1));
								product.setPdcost(rs.getInt(2));
								product.setPdprice(rs.getInt(3));
								list.add(product);
					}
						for(Test08_02 product1:list) {
								System.out.println(product1);
						}
				} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
		}

}
