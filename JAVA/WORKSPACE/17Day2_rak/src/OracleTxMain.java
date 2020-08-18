import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTxService;

public class OracleTxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
					OracleTxService service = new OracleTxService();
					//insert
//					Dept dept = new Dept(86,"생산","부산");
//					service.insert(dept);
					
					//update
//					Dept dept = new Dept(87,"인사","성남");
//					service.update(dept);
					
					//delete
//					service.delete(96);
					
					//insertDelete 
//					Dept dept = new Dept(24,"경리","인천");
//					service.insertDelete(dept, 12);
					
					//select
					ArrayList<Dept> list = service.select();
					for(Dept dept1:list) {
							System.out.println(dept1);
					}
			} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
			}
	
	}

}
