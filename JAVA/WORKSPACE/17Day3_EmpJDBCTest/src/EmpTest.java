
import java.sql.SQLException;
import java.util.ArrayList;

import com.biz.EmpBiz;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpTest {
	
	public static void main(String[] args) {
		
		EmpBiz empBiz = new EmpBiz();
		
//		try {
//				EmpDTO empDto = new EmpDTO(107,"강호동","인사",0,"20200722",1850,350,40);
//				empBiz.empInsert(empDto);
//		} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//		}
		
		//empDelete
//		try {
//				empBiz.empDelete(107);
//		} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//		}
		
		//empUpdate
//		try {
//				EmpDTO empdto = new EmpDTO(107,"강호동","인사",0,"20200722",1850,350,40);
//				empBiz.empUpdate(empdto);
//		} catch (DataNotFoundException | SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//		}
//		
		//selectDetailEmp
//		try {
//				System.out.println(empBiz.selectDetailEmp(9005));
//		} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//		}
		//select
		try {
				ArrayList<EmpDTO> list = empBiz.selectAllEmp();
				for(EmpDTO emp: list) {
						System.out.println(emp);
				}
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}//end main
}//end class
