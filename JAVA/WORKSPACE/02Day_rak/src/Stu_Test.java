
public class Stu_Test {
	
	String name; // 인스턴스 변수 객체 생성, 자동 초기화, 객체정보 저장, 값은 인스턴스 각각 할당 
	int age;
	int count; // 0
	public void printInfo() { //멤버 메소드, 객체 생성, 호출 사용, 동작 관련
		int num = 1; // 로컬변수(지역변수)
		count++; // 1 출력
		System.out.println("printInfo() num===" + num);
		System.out.println(name + ":" + age);
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stu_Test stu1 = new Stu_Test();
		 stu1.name = "홍길동";
		 stu1.age = 20;
		 stu1.printInfo(); //printInfo 메서드 호출
		 stu1.count++; //printInfo 메서드 종료 후 실행
		 System.out.println(stu1.count); //2 출력
		 Stu_Test stu2 = new Stu_Test();// printInfo 메서드 호출
		 stu2.name = "강감찬";
		 stu2.age = 26;
		 stu2.printInfo(); //printInfo 메서드 호출
		 stu2.count++; //printInfo 메서드 종료 후 실행
		 System.out.println(stu1.count); //2 출력

		 
	}

}
