package com.main;

import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

		public static void main(String[] args) {
				// TODO Auto-generated method stub

				OracleMyBatisService service = new OracleMyBatisService();

				// deptSelectAll
		List<Dept> list = service.deptSelectAll();
		for(Dept dept:list) {
				System.out.println(dept);
		}

				// deptSelectOne(단수 매개변수)
//		Dept dept;
//		try {
//				dept = service.deptSelectOne(92);
//				System.out.println(dept);
//		} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//		}

				// deptSelectPlural(복수 매개변수)
//		Dept dept = new Dept(98,"인사",null);
//		List<Dept> list;
//		try {
//				list = service.deptSelectPlural(dept);
//				for(Dept d:list) {
//						System.out.println(d);
//				}
//		} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//		}
//		
				// deptInsert
//		service.deptInsert(new Dept(92,"총무","경기"));

				// deptUpdate
//				try {
//						service.deptUpdate(new Dept(92, "총무", "서울"));
//				} catch (Exception e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//				}

				// deptDelete
//				try {
//						service.deptDelete(92);
//				} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//				}
		}

}
