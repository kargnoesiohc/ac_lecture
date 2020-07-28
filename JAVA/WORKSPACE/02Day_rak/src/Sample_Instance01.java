
public class Sample_Instance01 {
	String name = "aaa";
	char c = 'c';
	int m = 1234; 
	//인스턴스 변수(instance variable)
	//생성 시점: 인스턴스 생성~인스턴스 소멸
	//메모리 : 힙(heap)
	//자동 초기화
	//인스턴스 별로 다른 값을 가질 수 있음

	static int k = 4321; 
	//static변수(클래스 변수)
	//생성 시점: 클래스가 메모리에 할당 된 후 ~ 클래스 종료
	//메모리: method area(클래스 정보, static, 상수 등)
	//자동 초기화
	//public을 붙이면 전역변수가 되며, 인스턴스를 생성하지 않고 클래스 이름, 클래스 변수명을 통해 접근 가능
	{
		System.out.println(this.m); //this: 인스턴스 자신을 가리키는 참조 변수, 
	      							//인스턴스의 주소가 저장되어 있으며, 
		  							//모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//로컬 변수(local variable, 지역변수): 메서드 안에서 선언
		//생성 시점: 메서드 호출 ~ 종료;
		//메모리 : 스택
		//주의할 점: 반드시 사용전 초기화
		
		int n = 0;
		System.out.println(n);
		
		Sample_Instance01 s01 = new Sample_Instance01();
		System.out.println(s01.name); 
		System.out.println(s01.c);
		System.out.println(s01.m);
		System.out.println(k);
		
	}

}
