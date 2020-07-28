
public class MemberTest {
	static int num = 20;
	String name; 
	String phone;
	String address;
	char gender; //인스턴스 변수
	
	public void printInfo() { //멤버 메소드(함수) 객체마다 소유
		System.out.println(name+""+phone+""+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		
		System.out.println("로컬변수 "+num);
		MemberTest mem1 = new MemberTest(); //인스턴스(객체) 생성
		mem1.name = "홍길동"; //생성 인스턴스 접근, name 멤버변수 저장
		MemberTest mem2 = new MemberTest();//인스턴스(객체) 생성
		mem2.name = "이순신"; //생성 인스턴스 접근, name 멤버변수 저장
		mem1.printInfo();
		mem2.printInfo();
		MemberTest mem3 = new MemberTest();//인스턴스(객체) 생성
		mem3.name = "이철원";
		mem3.address = "서울";
		System.out.println(mem1.name); //멤버변수 사용
		System.out.println(mem2.name); //멤버변수 사용
		System.out.println(mem3.name + mem3.address);
		System.out.println(MemberTest.num); //static변수 사용
	}

}
