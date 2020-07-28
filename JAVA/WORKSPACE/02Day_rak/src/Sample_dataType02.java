
public class Sample_dataType02 {
	int globalScope = 10;
	public static void main(String[] args) {
//		//1. 변수 선언 
//		String name; //문자열, 참조형 변수
//		int age; //정수
//		String address; //문자열, 참조형 변수
//		char gender; //문자
//		boolean isMarried; //논리값
//		float height; // 실수f
//		double weight; //실수d
//		
//		//2. 변수 초기화
//		name = "홍길동";
//		age = 20;
//		address = "서울";
//		gender = '남';
//		isMarried = false;
//		height = 111f;
//		weight = 111;
		
		String name = "홍길등"; //문자열, 참조형 변수
		int age = 20; //정수
		String address = "서울"; //문자열, 참조형 변수
		char gender = '남'; //문자
		boolean isMarried = true; //논리값
		float height = 111f; // 실수f
		double weight = 111; //실수d
		
		
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		System.out.println("성별: " + gender);
		System.out.println("결혼 여부: " + isMarried);
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
	}

}
