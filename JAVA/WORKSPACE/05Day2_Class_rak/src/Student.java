import java.util.ArrayList;

public class Student {
		
		
		// 캡슐화

				//인스턴스 변수, class범위(메소드 밖에서 선언)
				//new 사용시 변수 생성
				//생성 시점 -> 객체 생성 ~ 객체 소멸(참조변수가 못 가리킬때)
				//자동 초기화(각 타입 별 default)
				//접근제한자가 숨겨진 채로 앞에 붙어있음(ex> default String name;)
				private String name;
				//생성 가능, 다른 클래스에서 접근 불가
				private int age;
				private String address;
				

				public String stuInfo() {
						return name+"/"+age+"/"+address;
				}
				
				public String getName() {
						return name;
				}

				public void setName(String name) {
						this.name = name;
				}

				public int getAge() {
						return age;
				}

				public void setAge(int age) {
						this.age = age;
				}

				public String getAddress() {
						return address;
				}

				public void setAddress(String address) {
						this.address = address;
				}
				
				
				public void stu_Print() { //출력 메서드
						System.out.println(name+ "\\" +age+ "\\" +address );
				}
		
				public static void main(String[] args) {
						ArrayList<Student> stuList = new ArrayList<Student>();
						
						Student stu1 = new Student();
						Student stu2 = new Student();
						Student stu3 = new Student();
						
						stu1.name = "홍길동";
						stu1.age = 20;
						stu1.address = "경기도";
						stu2.name = "강감찬";
						stu2.age = 30;
						stu2.address = "서울시";
						stu3.name = "이순신";
						stu3.age = 18;
						stu3.address = "천안시";
						
						stuList.add(stu1);
						stuList.add(stu2);
						stuList.add(stu3);
						
						for(int i=0;i<stuList.size();i++) {
//							Student tmp = stuList.get(i);
//							tmp.stu_Print();
								stuList.get(i).stu_Print();
						}
				}

}
