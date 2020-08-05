import java.util.Arrays;

public class TestEmp {
		// emps 배열 생성(데이터는 객체)
		public Emp[] createArrEmp() {
				Emp[] emps = new Emp[] { 
								new Manager("매니저", "홍길동", "영업부"), 
								new Manager("매니저", "이완용", "영업부"), 
								new Engineer("엔지니어", "이순신", "제조"),
								new Engineer("엔지니어", "강감찬", "검품"),
								};
				return emps;
		}

		// emps 배열 데이터 전체 출력
		public void printEmpArr(Emp[] emps) {
				for (Emp emp : emps) {
						System.out.println(emp);
				}
		}

		// emps배열의 객체를 구분하여 출력
		public void printEmpChild(Emp emps[]) {
				for (Emp emp : emps) {
						if (emp instanceof Manager) {
								Manager m = (Manager) emp; // 참조 변수 형 변환
								System.out.println(m.getDepart());
						} else if (emp instanceof Engineer) {
								Engineer e = (Engineer) emp; // 참조 변수 형 변환
								System.out.println(e.getSkill());
						}
				}
		}

		//search 메소드로 리턴한 데이터 출력(오버로딩)
		public void printEmpChild(Emp emp) {
				System.out.println("이름이 홍길동인 사람의 이름과 부서: ");
				if(emp instanceof Manager) {
						Manager m = (Manager)emp;
						System.out.println(m.getName()+"\t"+m.getDepart());
				} else if (emp instanceof Engineer) {
						Engineer e = (Engineer) emp;
						System.out.println(e.getName()+"\t"+e.getSkill());
				}
			
		}
		//배열 검색 함수
		public Emp searchChild(Emp emps[], String name) {
				Emp result = null;
				for (Emp emp : emps) {
						
//				이름이 홍길동인 사람 검색
						if (name.equals(emp.getName())) { // "==": 주소 비교/ "name.equals(emp.getName())": 데이터 비교
								result = emp;
								}
						}
						return result;
				}
		public void printEmpChild(String name) {
				System.out.println("부서가 영업부인 사람의 이름: ");
				System.out.println(name);
		}

		//searchChild 메소드 오버로딩(인자 순서만 바뀜)
		public String searchChild(String depart, Emp emps[] ) {
				String result = "";
				for(Emp emp:emps) {
						if(emp instanceof Manager) {
								Manager m = (Manager)emp;
								if(depart.equals(m.getDepart())) { // "==": 주소 비교/ "depart.equals(emp.getDepart())": 데이터 비교
										result += m.getName()+"/";
								}
						}
				}
				return "검색 결과: " + result;
				
		}

		public static void main(String[] args) {
				System.out.println("보직\t이름\t부서/업무");
				TestEmp testemp = new TestEmp();
				Emp emp = new Emp();
				Emp[] emps = testemp.createArrEmp();
				testemp.printEmpArr(emps);
				testemp.printEmpChild(emps);
				Emp search = testemp.searchChild(emps, "홍길동");
				testemp.printEmpChild(search);//오버로딩 함수 호출
				String search2 = testemp.searchChild("영업부",emps);
				testemp.printEmpChild(search2);
		}


}
