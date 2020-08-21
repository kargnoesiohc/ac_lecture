package com.main;

import java.util.HashMap;
import java.util.List;

import com.dto.Emp;
import com.service.EmpService;

public class EmpMain {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
			EmpService service = new EmpService();
			
			//EmpSelectAll
//			List<Emp> list = service.EmpSelectAll();
//			for(Emp dept:list) {
//					System.out.println(dept);
//			}
			
			//EmpSelectByNo
//			try {
//					System.out.println(service.EmpSelectByNo(90));
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
			
			
//			
			//EmpInsert
//			service.EmpInsert(new Emp(90,"손흥민","축구선수",7566,"20160203",3300.0,250.0, 30));
			
			//EmpUpdate
//			try {
//				service.EmpUpdate(new Emp(90,"박지성","축구선수",7566,"20160203",3300.0,250.0, 30));
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
			
			//EmpDelete
//			try {
//				service.EmpDelete(91);
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
			
		}

}
