package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dto.Dept;
import com.service.DeptService;
import com.service.EmpService;

public class EmpDeptMain {

		public static void main(String[] args) {
				// TODO Auto-generated method stub

				DeptService deptService = new DeptService();
				EmpService empService = new EmpService();
				
				//multiSelect
//				List<Integer> deptnoes = Arrays.asList(18,21,40);
//				List<Dept> list = deptService.multiSelect(deptnoes);
//				for(Dept dept:list) {
//						System.out.println(dept);
//				}
				
				
				//multiUpdateLoc
//				try {
//						List<Integer> deptno = Arrays.asList(10,20,30);
//						deptService.multiUpdateLoc(deptno);
//				} catch (Exception e) {
//						// TODO: handle exception
//						e.printStackTrace();
//				}
				
				
				//multiDelete
//				try {
//						List<Integer> deptno = Arrays.asList(93,97);
////						List<Dept> depts = Arrays.asList(new Dept(19,"",""), new Dept(21,"",""));
//						deptService.multiDelete(deptno);
//				} catch (Exception e) {
//						// TODO: handle exception
//						e.printStackTrace();
//				}
				
				//multiInsert
//				List<Dept> depts = Arrays.asList(new Dept(19,"총무","원주"), 
//																				new Dept(21,"개발","대전"),
//																				new Dept(22,"인사","천안"));
//				deptService.multiInsertAll(depts);
				
				//Top-N 분석(가장 큰 값 n개, 가장 작은값 n개 등) -> 페이징 처리
				List<Dept> list = deptService.selectTopN(0,3);
				for(Dept dept:list) {
						System.out.println(dept);
				}
				
		}

}
