package com.employee.biz;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;

public class EmployeeBiz implements IEmployeeBiz {

		// 사원 목록 보기
		@Override
		public List<Employee> selectAllEmployee() {
				List<Employee> list = new ArrayList<>();
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						// 리스트에서 사원정보를 읽고
						// 영업인 경우 salse 생성, 리스트에 담아 리턴
						// 엔지니어인 경우 engineer 생성, 리스트에 담아 리턴
						List<HashMap<String, Object>> map = session.selectList("employee.selectAllEmployee");
						for (HashMap<String, Object> m : map) {
								int empno = ((BigDecimal) m.get("EMPNO")).intValue();
								String ename = (String) m.get("ENAME");
								String hiredate = (String) m.get("HIREDATE");
								String loc = (String) m.get("LOC");
								int sal = ((BigDecimal) m.get("SAL")).intValue();
								String state = (String) m.get("STATE");
								if (m.get("DNAME").equals("영업")) {
										Sales s = new Sales(empno, ename, hiredate, loc, sal, state, sal * Sales.COMMISSION_RATE);
										list.add(s);
								} else {
										Engineer e = new Engineer(empno, ename, hiredate, loc, sal, state);
										list.add(e);
								}
						}

				} finally {
						session.close();
				}
				return list;
		}

		// 사원정보 검색하기
		@Override
		public List<Employee> searchList(String inputSubMenu, String searchWord) throws DataNotFoundException {
				/*
				 * 1.사번 검색 2.이름 검색 3.부서 검색 4.근무지 검색 5.연봉 검색
				 */
				List<Employee> list = new ArrayList<>();
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						// Map에 inputSubMenu0, searchWord 저장
						// selectList 시 Map을 넘김, 조건에 맞는 결과를 map을 담은 list로 받기
						// 영업인 경우 salse 생성, 리트스에 담아 리턴
						// 엔지니어인 경우 engineer 생성, 리트스에 담아 리턴
						HashMap<String, String> xxx = new HashMap<>();
						xxx.put("inputSubMenu", inputSubMenu.trim());
						xxx.put("searchWord", searchWord.trim());
						List<HashMap<String, Object>> map = session.selectList("employee.searchList", xxx);
						if (map.size() == 0) {
								throw new DataNotFoundException("찾는 사원이 없습니다.");
						} else {
								for (HashMap<String, Object> m : map) {
										int empno = ((BigDecimal) m.get("EMPNO")).intValue();
										String ename = (String) m.get("ENAME");
										String hiredate = (String) m.get("HIREDATE");
										String loc = (String) m.get("LOC");
										int sal = ((BigDecimal) m.get("SAL")).intValue();
										String state = (String) m.get("STATE");
										if (m.get("DNAME").equals("영업")) {
												Sales s = new Sales(empno, ename, hiredate, loc, sal, state, sal * Sales.COMMISSION_RATE);
												list.add(s);
										} else {
												Engineer e = new Engineer(empno, ename, hiredate, loc, sal, state);
												list.add(e);
										}
								}
						}
				} finally {
						session.close();
				}
				return list;
		}// end printSearchList

		@Override
		public int createEmployeeNum() {
				int num = 0;
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						num = session.selectOne("employee.createEmployeeNum");
						++num;
				} finally {
						session.close();
				}
				return num;
		}

		// 새로운 사원 생성
		@Override
		public void employeeInsert(Employee emp) {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						// map에 사원정보 저장
						// 영업일 경우 commission추가
						// 사업일경우 일 경우 dname추가
						// employee.employeeInsert 호출 map넘기기
						HashMap<String, Object> map = new HashMap<>();
						map.put("empno", emp.getEmpno());
						map.put("ename", emp.getEname());
						map.put("loc", emp.getLoc());
						map.put("hiredate", emp.getHiredate());
						map.put("sal", emp.getSal());
						map.put("state", emp.getState());
						if (emp instanceof Sales) {
								map.put("dname", "영업");
						} else {
								map.put("dname", "개발");
						}
						int num = session.insert("employee.employeeInsert", map);
						System.out.println(num + "명의 사원 정보 추가");
						session.commit();
				} finally {
						session.close();
				}
		}

		// 사원 수정
		@Override
		public void employeeUpdate(Employee emp) throws DataNotFoundException {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						HashMap<String, Object> map = new HashMap<>();
						map.put("empno", emp.getEmpno());
						map.put("ename", emp.getEname());
						map.put("loc", emp.getLoc());
						map.put("hiredate", emp.getHiredate());
						map.put("sal", emp.getSal());
						map.put("state", emp.getState());
						if (emp instanceof Sales) {
								map.put("dname", "영업");
						} else {
								map.put("dname", "개발");
						}
						int num = session.update("employee.employeeUpdate", map);
						if (num == 0) {
								throw new DataNotFoundException("업데이트 할 사원이 없습니다.");
						} else {
								System.out.println(num + "명의 사원 정보 업데이트");
								session.commit();
						}
				} finally {
						session.close();
				}
		}// end employeeUpdate

		// 사원 삭제
		@Override
		public void employeeDelete(int empno) throws DataNotFoundException {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						int num = session.delete("employee.employeeDelete", empno);
						if (num == 0) {
								throw new DataNotFoundException("삭제 할 사원이 없습니다.");
						} else {
								System.out.println(empno + "번 사원 정보 삭제");
								session.commit();
						}
				} finally {
						session.close();
				}
		}// end employeeDelete

		// 근태관리( 외출/출장/휴가/근무)
		@Override
		public void employeeService(int empno, String inputColumn) throws DataNotFoundException {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						// map에 사원번호 , 근태 상황저장 mapper.employeeSerivce
						HashMap<String, Object> map = new HashMap<>();
						map.put("empno", empno);
						map.put("inputColumn", inputColumn);
						int num = session.update("employee.employeeService",map);
						if(num == 0) {
								throw new DataNotFoundException("근태 정보를 변경 할 사원이 없습니다.");
						} else {
								System.out.println(num +"명의 사원 정보 업데이트");
								session.commit();
						}

				} finally {
						session.close();
				}
		}

}// end class
