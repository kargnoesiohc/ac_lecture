
public class Static_Instance02 { //클래스
	int num2 = 30; //인스턴스 변수: 인스턴스 생성 필요, 각각 다른 값 부여 가능
//	static int num2 = 30; //static 변수 : 인스턴스를 생성하지 않고 사용 가능, 공통된 값 사용
	/* static */ { //a블럭
		int num = 10;
		System.out.println("a: " + num);
		System.out.println(num2); //this: 인스턴스 자신을 가리키는 참조 변수, 
							      //인스턴스의 주소가 저장되어 있으며, 
								  //모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재	  
	}
	/* static */ { //b블럭
		int num = 20;
		System.out.println("b: " + num);
		System.out.println(num2); 
	}
	public static void main(String[] args) { //메인 블럭
		// TODO Auto-generated method stub
//		System.out.println(num2);
		Static_Instance02 s02 = new Static_Instance02(); //인스턴스 생성
	}

}
