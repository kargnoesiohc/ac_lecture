package com.employee.test;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.common.util.CommonUtil;
import com.employee.biz.EmployeeBiz;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;
import com.notice.biz.NoticeBiz;
import com.notice.entity.Notice;


public class EmployeeTest {

	
	public static void main(String[] args) {
		
		EmployeeBiz empBiz = new EmployeeBiz();
		NoticeBiz noticeBiz = new NoticeBiz();
		
		while (true) {
			printMainMenu();
			String inputMenu =//CommonUtil.getUserInput사용
	if (inputMenu.equals("1")) {
	
		   printEmployeeList(empBiz);
		   System.out.println("====================================================================================\n");
		}else if (inputMenu.equals("2")) {
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
				String inputSubMenu = CommonUtil.getUserInput();
				int menu = Integer.parseInt(inputSubMenu);
				
				switch(menu){
			//	1,2,   사번, 이름, 부서   발
			//ase3 : 검색할 부서입력 1.영업, 2개발
			//4 근무지   5 연봉	  
				}//end switch
		
					String searchWord = CommonUtil.getUserInput();
					try {
						List<Employee> list = //전체 근무자 명단 가져오기 
						System.out.println("====================================================================================");
						System.out.println("사번\t이름\t부서\t근무지\t연봉\t커미션\t입사일\t\t근태");
						System.out.println("------------------------------------------------------------------------------------");
						for (Employee e : list) {
							//전체자료 출력
							//영업부서인 경우 부서이름과 커미션을 한국화폐단위로 표시할 것 CommonTutil.getCurrency이용
							
						}//end for

					} catch (DataNotFoundException e) {
						System.out.println(e.getMessage());
					}
				
			} else if (inputMenu.equals("3")) {
				System.out.println("*****************************************");
				System.out.println("\t[3.임직원 정보 추가 ]");
				System.out.println("*****************************************");
				int empno = empBiz.createEmployeeNum();
				System.out.println("사원번호[" + empno + "]를 생성하였습니다");
				System.out.print("추가할 이름을 입력하세요 => ");
				String ename = CommonUtil.getUserInput();
				System.out.print("추가할 부서를 입력하세요(1.영업 2.개발) => ");
				String dname = CommonUtil.getUserInput();			
				System.out.print("추가할 근무지를 입력하세요(서울,부산,인천 ) => ");
				String loc = CommonUtil.getUserInput();
				System.out.print("추가할 연봉을 입력하세요 => ");
				String sal = CommonUtil.getUserInput();
				System.out.print("추가할 입사일(예:2014-06-01)을 입력하세요 \n 엔터를 치면 현재날짜로 입력됩니다. => ");
				
				String hiredate = CommonUtil.getUserInput();
				if(hiredate.equals("")){
					hiredate = //CommonUtil.getDate 사용
				}
				System.out.println();
				System.out.println("*****************************");
				//사원 등록
			
               
				//사원 목록 출력
				printEmployeeList(empBiz);
			}else if (inputMenu.equals("4")) {
				
				System.out.println("*****************************************");
				System.out.println("\t[4.임직원 정보 수정 ]");
				System.out.println("*****************************************");
				System.out.print("수정할 사원번호를 입력하세요 => ");
				String empno = CommonUtil.getUserInput();
				System.out.print("수정할 이름을 입력하세요.\n Enter를 치면 이름은 수정하지 않습니다. => ");
				String ename = CommonUtil.getUserInput();
				System.out.print("수정할 부서를 입력하세요.(1.영업 2.개발) => ");
				String dname = CommonUtil.getUserInput();
				System.out.print("수정할 근무지를 입력하세요.(서울,부산,인천 )\n Enter를 치면 근무지는 수정하지 않습니다.=> ");
				String loc = CommonUtil.getUserInput();
				System.out.print("수정할 연봉을 입력하세요.\n Enter를 치면 연봉은 수정하지 않습니다. => ");
				String sal = CommonUtil.getUserInput();
				if(sal.equals("")){
					sal = "0";  //기본값
				}
				System.out.println();
				System.out.println("*****************************");
				//사원 수정
				
				//사원 목록 출력
				printEmployeeList(empBiz);
				
			} else if (inputMenu.equals("5")) {
				
				System.out.println("*****************************************");
				System.out.println("\t[5.임직원 정보 삭제 ]");
				System.out.println("*****************************************");
				System.out.print("삭제할 사원번호를 입력하세요 => ");
				String empno = CommonUtil.getUserInput();
				System.out.println("*****************************");
	            try {
					empBiz.employeeDelete(Integer.parseInt(empno));
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (DataNotFoundException e) {
					System.out.println(e.getMessage());
				}
	            printEmployeeList(empBiz);
			}else if (inputMenu.equals("6")) {
				
				
				System.out.println("*****************************************");
				System.out.print("변경할 사원번호를 입력하세요 => ");
				String empno = CommonUtil.getUserInput();
				System.out.println("1.외출");
				System.out.println("2.출장");
				System.out.println("3.휴가");
				System.out.println("4.근무");
				System.out.println("------------------------------------------------");
				System.out.print("메뉴를 입력하세요(정수) => ");
				String inputColumn = CommonUtil.getUserInput();
				System.out.println("------------------------------------------------");
				try {
					empBiz.employeeService(Integer.parseInt(empno), inputColumn);
				} catch (DataNotFoundException e) {
					System.out.println(e.getMessage());
				}
				 printEmployeeList(empBiz);
			}
			else if (inputMenu.equals("7")) {
				
				//공지사항 목록
				 List<Notice> list = noticeBiz.selectAllNotice();
					System.out.println("======================================================================");
			        System.out.println("NO\t\t제목\t\t작성자\t작성일자");
			        System.out.println("----------------------------------------------------------------------");
			//공지사항 목록 출력 
			if (list.size() == 0)System.out.println("공지사항이 없습니다.");
			
			  System.out.println("======================================================================\n");
				
		   }else if (inputMenu.equals("8")) {
			System.out.println("*****************************************");
			System.out.print("공지 글 번호를 입력하세요 => ");
			String inputNum = CommonUtil.getUserInput();
			
			Notice notice=null;
			try {
				//공지글 하나 얻어오기 
				System.out.println("======================================================================");
				System.out.println("NO\t\t제목\t\t작성자\t작성일자");
				System.out.println("----------------------------------------------------------------------");
			//공지글에 대한 내용 출력 
				System.out.println("----------------------------------------------------------------------");
				System.out.println("\t"+notice.getContent());
				System.out.println("----------------------------------------------------------------------");
			} catch (DataNotFoundException e) {
				System.out.println(e.getMessage());
			}

		} else if (inputMenu.equals("9")) {
			System.out.println("*****************************************");
			System.out.print("수정 할 공지 글번호를 입력하세요 => ");
			String no = CommonUtil.getUserInput();
			System.out.println("1.제목수정");
			System.out.println("2.내용수정");
			System.out.println("3.모두수정");
			System.out.println("------------------------------------------------");
			System.out.print("메뉴를 입력하세요(정수) => ");
			String inputColumn = CommonUtil.getUserInput();
			System.out.println("------------------------------------------------");
			 Notice notice = null;
			try {
				//수정할 공지글 하나 얻어오기 
			} catch (DataNotFoundException e) {
				System.out.println(e.getMessage());
			}  
			if(inputColumn.equals("1")){
				System.out.print("수정 할 제목 입력 => ");
				String inputTitle = CommonUtil.getUserInput();
				//공지글의 제목수정
				System.out.println("------------------------------------------------");
			}else if(inputColumn.equals("2")){
				System.out.print("수정 할 내용 입력 => ");
				String inputContent = CommonUtil.getUserInput();
				//공지글의 내용수정
				System.out.println("------------------------------------------------");
			}else{
				System.out.print("수정 할 제목 입력 => ");
				String inputTitle = CommonUtil.getUserInput();
				System.out.println("------------------------------------------------");
				System.out.print("수정 할 내용 입력 => ");
				String inputContent = CommonUtil.getUserInput();
				System.out.println("------------------------------------------------");
				//제목, 내용 수정
			}
			
			  //db 공지글 수정
			    //공지사항 목록
					try {
						notice = noticeBiz.selectDetailNotice(no);
						System.out.println("======================================================================");
						System.out.println("NO\t\t제목\t\t작성자\t작성일자");
						System.out.println("----------------------------------------------------------------------");
						System.out.print(notice.getNo() + "\t");
						System.out.print(notice.getTitle() + "\t");
						System.out.print(notice.getName() + "\t");
						System.out.println(notice.getWriteday());
						System.out.println("----------------------------------------------------------------------");
						System.out.println("\t"+notice.getContent());
						System.out.println("----------------------------------------------------------------------");
					} catch (DataNotFoundException e) {
						System.out.println(e.getMessage());
					}
			   
			   
		  System.out.println("======================================================================\n");
			    
			}else if (inputMenu.equals("10")) {
				System.out.println("*****************************************");
				System.out.print("삭제 할 공지 글번호를 입력하세요 => ");
				String inputNum = CommonUtil.getUserInput();
				try {
					//공지글 삭제 
					System.out.println(inputNum+"번 글이 삭제되었습니다.");
				} catch (DataNotFoundException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("------------------------------------------------");
			} else {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

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
	}//
	
	//사원 목록 출력
	public static void printEmployeeList(EmployeeBiz empBiz){
		  //사원 목록 리스트
		     List<Employee> list = empBiz.selectAllEmployee();	
				System.out.println("====================================================================================");
				System.out.println("사번\t이름\t부서\t근무지\t연봉\t커미션\t입사일\t\t근태");
				System.out.println("------------------------------------------------------------------------------------");
				for (Employee e : list) {
					System.out.print(e.getEmpno() + "\t");
					System.out.print(e.getEname() + "\t");
					String dname = "개발";
					if(e instanceof Sales){
						dname = "영업";
					}
					System.out.print(dname + "\t");
					System.out.print(e.getLoc() + "\t");
					System.out.print(CommonUtil.getCurrency(e.getSal()) + "\t");
					double commission = 0;
					if(e instanceof Sales){
						Sales s = (Sales)e;
						commission = s.getCommission();
						System.out.print(CommonUtil.getCurrency(((int)commission))+"\t");
					}else{
						System.out.print("\t");
					}
					
					System.out.print(e.getHiredate() + "\t");
					String state = e.getState();
					System.out.print(state);
					System.out.println();
				}//end for
	}//end printEmployeeList
	


}
