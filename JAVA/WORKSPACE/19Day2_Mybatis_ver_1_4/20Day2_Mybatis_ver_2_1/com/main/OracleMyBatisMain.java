package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

		public static void main(String[] args) {
				// TODO Auto-generated method stub

				OracleMyBatisService service = new OracleMyBatisService();

				
				// selectDynamicDeptno
				
				//  hashMap 사용
//				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//				HashMap<String,Integer> map = new HashMap<>();
//				try {
//						int deptno = Integer.parseInt(br.readLine());
//						map.put("deptno", deptno); //key 값을 이용한 검사
//						List<Dept> list = service.selectDynamicDeptno(map);
//						for(Dept dept:list) {
//								System.out.println(dept);
//						}
//				} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//				}
				// Dept 사용
//				Dept dept = new Dept(0,null,null);
//				try {
//						List<Dept> list = service.selectDynamicDeptno(dept);
//						for(Dept d:list) {
//								System.out.println(d);
//						}
//				} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//				}
				
				//selectDynamicChoose
				
				// hashmap 사용
//				HashMap<String, String> map = new HashMap<>();
//				map.put("dname", "인사");
//				map.put("loc", "경기");
//				try {
//						List<Dept> list = service.selectDynamicChoose(map);
//						for(Dept dept:list) {
//								System.out.println(dept);
//						}
//				} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//				}
				// Dept 사용
//				Dept dept = new Dept(0,"총무","경기");
//				try {
//						List<Dept> list = service.selectDynamicChoose(dept);
//						for(Dept d:list) {
//								System.out.println(d);
//						}
//				} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//				}
				
		}

}
