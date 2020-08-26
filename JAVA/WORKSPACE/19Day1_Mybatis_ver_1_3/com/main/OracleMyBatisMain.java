package com.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

		public static void main(String[] args) {
				// TODO Auto-generated method stub

				OracleMyBatisService service = new OracleMyBatisService();

				// deptSelectAll
//				List<Dept> list = service.deptSelectAll();
//				for (Dept dept : list) {
//						System.out.println(dept);
//				}

				// deptSelectOne(단수 매개변수)
//				Dept dept;
//				try {
//						dept = service.deptSelectOne(92);
//						System.out.println(dept);
//				} catch (Exception e) {
//						// TODO: handle exception
//						e.printStackTrace();
//				}

				// deptSelectByNameAndLoc(복수 매개변수, HashMap)
//				HashMap<String, String> map = new HashMap<>();
//				map.put("dname", "총무");
//				map.put("loc", null);
//				List<Dept> list;
//				try {
//						list = service.deptSelectByNameAndLoc(map);
//						for (Dept dept : list) {
//								System.out.println(dept);
//						}
//				} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//				}
				
				// deptSelectByHashMap
//				HashMap<String, Integer> map = new HashMap<>();
//				try {
//					map.put("deptnoA",20);
//					map.put("deptnoB",60);
//					List<Dept> list;
//						list = service.deptSelectByHashMap(map);
//						for(Dept dept:list) {
//								System.out.println(dept);
//						}
//				} catch (Exception e) {
//						// TODO: handle exception
//						e.printStackTrace();
//				} 
				// deptSelectByDeptNoIn
//				HashMap<String, Integer> map = new HashMap<>();
//				try {
//						map.put("a", 11);
//						map.put("b", 12);
//						map.put("c", 40);
//						List<Dept> list = service.deptSelectByDeptNoIn(map);
//						
//						for(Dept dept:list) {
//								System.out.println(dept);
//						}
//				} catch (Exception e) {
//						// TODO: handle exception
//						e.printStackTrace();
//				}
				
				// deptSelectByDeptnoHashMap
//				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//				
//				try {
//						int deptno = Integer.parseInt(br.readLine());
//						HashMap<String,Dept> map = service.deptSelectByDeptnoHashMap(deptno);
////						Set<String> keys = map.keySet(); //key 값 돌려서 전부 출력
////						
////						for(String key:keys) {
////								System.out.println(map.get(key));
////						}
//						System.out.println(map.get("DNAME"));
//
//				} catch (Exception e) {
//						// TODO: handle exception
//						e.printStackTrace();
//				}

				// deptInsert
//				service.deptInsert(new Dept(63, "총무", "경기"));

				// deptUpdate
//				try {
//						service.deptUpdate(new Dept(99, "총무", "서울"));
//				} catch (Exception e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//				}

				// deptDelete
//				try {
//						service.deptDelete(62);
//				} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//				}

				// deptRecordCount
//				System.out.println("레코드 개수 : " + service.deptRecordCount());
				
				//selectAllHash
				List<Map<String, Object>> list = service.selectAllHash();
				for(Map m:list) {
						String deptno = (BigDecimal)m.get("DEPTNO")+""; 
						String dname = (String) m.get("DNAME");
						String loc = (String) m.get("LOC");
						System.out.println(deptno+"\t"+dname+"\t"+loc);
				}

		}

}
