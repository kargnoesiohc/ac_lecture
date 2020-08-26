package com.test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.common.util.CommonUtil;
import com.employee.biz.EmployeeBiz;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;
import com.notice.biz.NoticeBiz;
import com.notice.entity.Notice;

public class Test {

		public static void main(String[] args) {

				EmployeeBiz empBiz = new EmployeeBiz();
				NoticeBiz noticeBiz = new NoticeBiz();

				while (true) {
						printMainMenu();
						String inputMenu = CommonUtil.getUserInput();// 대메뉴 0~10번까지

						if (inputMenu.equals("1")) {
								List<Employee> list = empBiz.selectAllEmployee();
								printEmployeeList(list);
						} else if (inputMenu.equals("2")) {
								System.out.println("*****************************************");
								System.out.println("\t[2.임직원 정보 검색]");
								System.out.println("*****************************************");
								System.out.println("1.사번 검색");
								System.out.println("2.이름 검색");
								System.out.println("3.부서 검색");
								System.out.println("4.근무지 검색");
								System.out.println("5.연봉 검색");
								System.out.println("*****************************************");
								System.out.print("메뉴 입력(1~5 사이 정수로 입력) => ");
								String inputSubMenu = CommonUtil.getUserInput(); // 소메뉴
								int menu = Integer.parseInt(inputSubMenu);
								switch (menu) {
								case 1:
										System.out.println("검색 할 사번을 입력하시오.");
										break;
								case 2:
										System.out.println("검색 할 이름을 입력하시오.");
										break;
								case 3:
										System.out.println("검색 할 부서를 입력하시오.(1.영업, 2.개발 - 번호로 입력)");
										break;
								case 4:
										System.out.println("검색 할 근무지를 입력하시오.");
										break;
								case 5:
										System.out.println("검색 할 연봉을 입력하시오.");
										break;
								}// end switch

								String searchWord = CommonUtil.getUserInput(); // 검색 값 입력
								try {
										List<Employee> list = empBiz.searchList(inputSubMenu, searchWord);
										printEmployeeList(list); // 출력문
								} catch (Exception e) {
										System.out.println(e.getMessage());
								}

						} else if (inputMenu.equals("3")) {
								System.out.println("*****************************************");
								System.out.println("\t[3.임직원 정보 추가 ]");
								System.out.println("*****************************************");
								int empno = empBiz.createEmployeeNum();
								System.out.println("사원번호[" + empno + "]를 생성하였습니다");
								System.out.print("추가할 이름을 입력하세요 => ");
								String ename = (CommonUtil.getUserInput()).trim();
								System.out.print("추가할 부서를 입력하세요(1.영업 2.개발 - 번호로 입력) => ");
								String dname = (CommonUtil.getUserInput()).trim();
								System.out.print("추가할 근무지를 입력하세요(서울,부산,인천 ) => ");
								String loc = (CommonUtil.getUserInput()).trim();
								System.out.print("추가할 연봉을 입력하세요 => ");
								int sal = Integer.parseInt((CommonUtil.getUserInput()).trim());
								System.out.print("추가할 입사일(예:2014-06-01)을 입력하세요 \n 엔터를 치면 현재날짜로 입력됩니다. => ");
								String hiredate = (CommonUtil.getUserInput()).trim();
								if (hiredate.equals("")) {
										hiredate = CommonUtil.getDate(new Date());
								}
								System.out.println("*****************************");
								String state = "근무";
								Employee emp = null;
								if ("1".equals(dname)) {
										emp = new Sales(empno, ename, hiredate, loc, sal, state, Sales.getCommissionRate());
								} else {
										emp = new Engineer(empno, ename, hiredate, loc, sal, state);
								}
								empBiz.employeeInsert(emp);

								List<Employee> list = empBiz.selectAllEmployee();
								printEmployeeList(list);
						} else if (inputMenu.equals("4")) {

								System.out.println("*****************************************");
								System.out.println("\t[4.임직원 정보 수정 ]");
								System.out.println("*****************************************");
								System.out.print("수정할 사원번호를 입력하세요 => ");
								int empno = Integer.parseInt((CommonUtil.getUserInput()).trim());
								try {
										System.out.print("수정할 이름을 입력하세요.\n Enter를 치면 이름은 수정하지 않습니다. => ");
										String ename = (CommonUtil.getUserInput()).trim();
										if (ename.equals("")) {
												ename = null;
										}
										System.out.print("수정할 부서를 입력하세요.(1.영업 2.개발 - 번호로 입력) => ");
										String dname = (CommonUtil.getUserInput()).trim();

										System.out.print("수정할 근무지를 입력하세요.(서울,부산,인천 )\n Enter를 치면 근무지는 수정하지 않습니다.=> ");
										String loc = (CommonUtil.getUserInput()).trim();
										if (loc.equals("")) {
												loc = null;
										}
										System.out.print("수정할 연봉을 입력하세요.\n Enter를 치면 연봉은 수정하지 않습니다. => ");
										String sal = (CommonUtil.getUserInput()).trim();
										if (sal.equals("")) {
												sal = "0"; // 기본값
										}
										int sall = Integer.parseInt(sal);
										System.out.println();
										System.out.println("*****************************");
										Employee emp = null;
										if ("1".equals(dname)) {
												emp = new Sales(empno, ename, null, loc, sall, null, Sales.getCommissionRate());
										} else {
												emp = new Engineer(empno, ename, null, loc, sall, null);
										}
										empBiz.employeeUpdate(emp);

										List<Employee> list = empBiz.selectAllEmployee();
										printEmployeeList(list);

								} catch (Exception e) {
										// TODO: handle exception
										e.printStackTrace();

								}

								// 사원 수정
								// 사원 목록 출력

						} else if (inputMenu.equals("5")) {

								System.out.println("*****************************************");
								System.out.println("\t[5.임직원 정보 삭제 ]");
								System.out.println("*****************************************");
								System.out.print("삭제할 사원번호를 입력하세요 => ");
								int empno = Integer.parseInt((CommonUtil.getUserInput()).trim());
								System.out.println("*****************************");
								try {
										empBiz.employeeDelete(empno);

										List<Employee> list = empBiz.selectAllEmployee();
										printEmployeeList(list);

								} catch (Exception e) {
										e.printStackTrace();
								}
//								printEmployeeList(list);
						} else if (inputMenu.equals("6")) {

								System.out.println("*****************************************");
								System.out.print("변경할 사원번호를 입력하세요 => ");
								String empno = CommonUtil.getUserInput();
								System.out.println("1.외출");
								System.out.println("2.출장");
								System.out.println("3.휴가");
								System.out.println("4.근무");
								System.out.println("------------------------------------------------");
								System.out.print("메뉴를 입력하세요(번호로 입력) => ");
								String inputColumn = CommonUtil.getUserInput();
								System.out.println("------------------------------------------------");
								try {
										empBiz.employeeService(Integer.parseInt(empno), inputColumn);

										List<Employee> list = empBiz.selectAllEmployee();
										printEmployeeList(list);

								} catch (Exception e) {
										e.printStackTrace();
								}

						} else if (inputMenu.equals("7")) {
								// 공지사항 목록

								List<Notice> list = noticeBiz.selectAllNotice();
								printNoticeList(list);

								// 공지사항 목록 출력

						} else if (inputMenu.equals("8")) {
								System.out.println("*****************************************");
								List<Notice> list = noticeBiz.selectAllNotice();
								printNoticeList(list);
								System.out.print("공지 글 번호를 입력하세요 => ");
								String inputNum = CommonUtil.getUserInput();

								try {
										Notice notice = noticeBiz.selectDetailNotice(inputNum);
										printDetailList(notice);
										
								} catch (Exception e) {
										e.printStackTrace();
								}

						} else if (inputMenu.equals("9")) {
								System.out.println("*****************************************");
								List<Notice> list = noticeBiz.selectAllNotice();
								printNoticeList(list);
								System.out.print("수정 할 공지 글번호를 입력하세요 => ");
								try {
								String no = CommonUtil.getUserInput();
										System.out.println("1.제목수정");
										System.out.println("2.내용수정");
										System.out.println("3.모두수정");
										System.out.println("------------------------------------------------");
										System.out.print("메뉴를 입력하세요(번호로 입력) => ");
										String inputNum = CommonUtil.getUserInput();
										System.out.println("------------------------------------------------");
										
										if (inputNum.equals("1")) {
												System.out.print("수정 할 제목 입력 => ");
												String inputTitle = CommonUtil.getUserInput();
												noticeBiz.noticeUpdate(new Notice(Integer.parseInt(no), inputTitle, null, null, null));
												System.out.println("------------------------------------------------");
												//제목만 수정
										} else if (inputNum.equals("2")) {
												System.out.print("수정 할 내용 입력 => ");
												String inputContent = CommonUtil.getUserInput();
												noticeBiz.noticeUpdate(new Notice(Integer.parseInt(no), null, inputContent, null, null));
												System.out.println("------------------------------------------------");
												//내용만 수정
										} else if (inputNum.equals("3")) {
												System.out.print("수정 할 제목 입력 => ");
												String inputTitle = CommonUtil.getUserInput();
												System.out.println("------------------------------------------------");
												System.out.print("수정 할 내용 입력 => ");
												String inputContent = CommonUtil.getUserInput();
												noticeBiz.noticeUpdate(new Notice(Integer.parseInt(no), inputTitle, inputContent, null, null));
												System.out.println("------------------------------------------------");
										}// 제목, 내용 수정
										
												Notice notice = noticeBiz.selectDetailNotice(no);
												printDetailList(notice);
										} catch (Exception e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
										}

										System.out.println("======================================================================\n");
										
						} else if (inputMenu.equals("10")) {
								System.out.println("*****************************************");
								System.out.print("삭제 할 공지 글번호를 입력하세요 => ");
								String inputNum = CommonUtil.getUserInput();
								try {
										noticeBiz.noticeDelete(inputNum);
										
										List<Notice> list = noticeBiz.selectAllNotice();
										printNoticeList(list);
								} catch (Exception e) {
										e.printStackTrace();
								}
								System.out.println("------------------------------------------------");
						} else {
								
								break;
						}
				} // end while

				System.out.println("프로그램이 종료되었습니다.");
		} // end main

		private static void printMainMenu() {

				System.out.println("*****************************************");
				System.out.println("\t[임직원 관리 시스템 메뉴]");
				System.out.println("*****************************************");
				System.out.println("1.전체 임직원 목록");
				System.out.println("2.임직원 정보 검색");
				System.out.println("3.임직원 정보 추가");
				System.out.println("4.임직원 정보 수정");
				System.out.println("5.임직원 정보 삭제");
				System.out.println("6.근태관리");
				System.out.println("7.공지사항 목록");
				System.out.println("8.공지사항 상세보기");
				System.out.println("9.공지사항 수정");
				System.out.println("10.공지사항 삭제");
				System.out.println("0.종료");
				System.out.println("*****************************************");
				System.out.print("메뉴 입력 => ");
		}//end printMainMenu

		// 사원 목록 출력
		public static void printEmployeeList(List<Employee> xxx) {
				List<Employee> list = xxx;
			// 공지글 하나 얻어오기
				System.out.println("======================================================================");
				System.out.println("NO\t\t제목\t\t작성자\t작성일자");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("====================================================================================");
				System.out.println("사번\t이름\t부서\t근무지\t연봉\t커미션\t입사일\t\t근태");
				System.out.println("------------------------------------------------------------------------------------");
				for (Employee e : list) {
						System.out.print(e.getEmpno() + "\t");
						System.out.print(e.getEname() + "\t");
						String dname = "개발";
						if (e instanceof Sales) {
								dname = "영업";
						}
						System.out.print(dname + "\t");
						System.out.print(e.getLoc() + "\t");
						System.out.print(CommonUtil.getCurrency(e.getSal()) + "\t");
						double commission = 0;
						if (e instanceof Sales) {
								Sales s = (Sales) e;
								commission = s.getCommission();
								System.out.print(CommonUtil.getCurrency(((int) commission)) + "\t");
						} else {
								System.out.print("\t");
						}

						System.out.print(e.getHiredate() + "\t");
						String state = e.getState();
						System.out.println(state);
				} // end for
				System.out.println("====================================================================================\n");
		}// end printEmployeeList

		public static void printNoticeList(List<Notice> xxx) {
				List<Notice> list = xxx;
				System.out.println("======================================================================");
				System.out.println("NO\t\t제목\t\t작성자\t작성일자");
				System.out.println("----------------------------------------------------------------------");
				for (Notice n : list) {
						System.out.print(n.getNo() + "\t");
						System.out.print(n.getTitle() + "\t\t");
						System.out.print(n.getAuthor() + "\t\t");
						System.out.println(n.getWriteday());
				}
				System.out.println("======================================================================");
		}// end printNoticeList
		
		
		public static void printDetailList(Notice notice) {
				System.out.println("----------------------------------------------------------------------");
				System.out.print(notice.getNo() + "\t");
				System.out.print(notice.getTitle() + "\t\t");
				System.out.print(notice.getAuthor() + "\t\t");
				System.out.println(notice.getWriteday());
				System.out.println("----------------------------------------------------------------------");
				System.out.println("\t" + notice.getContent());
				System.out.println("----------------------------------------------------------------------");
		}// end printDetailList
		
		

}
