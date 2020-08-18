import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dto.Dept;
import com.service.OracleService;

public class Main {

		public static void main(String[] args){
				// TODO Auto-generated method stub
				//Select
				OracleService service = new OracleService();
				HashMap<String, String> map = new HashMap<>();
//				try {
//						ArrayList<Dept> list = service.select();
//						for(Dept dept:list) {
//								System.out.println(dept);
//						}
//				} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//				}
				//Insert
//				Dept dept = new Dept(95,"세무","경기");
//				try {
//						service.insert(dept);
//				} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//				}
				
				//Update
//				try {
//						
//						service.update(new Dept(32,"세무","제주"));
//				} catch (Exception e) {
//						// TODO: handle exception
//						System.out.println(e.getMessage());
//				}
				
				//Delete 
//				try {
//						service.delete(14);
//				} catch (Exception e) {
//						// TODO: handle exception
//						System.out.println(e.getMessage());
//				}
				
				//selectByDeptno
//				try {
//						ArrayList<Dept> list = service.selectByDeptno(3);
//						for(Dept dept:list) {
//								System.out.println(dept);
//						}
//				} catch (Exception e) {
//						// TODO: handle exception
//						System.out.println(e.getMessage());
//				}
				map.put("dname", "개발");
				map.put("loc", "서울");
				try {
						ArrayList<Dept> list = service.selectByNameLoc(map);
						for(Dept dept:list) {
								System.out.println(dept);
						}
				} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
				}
		}

}
