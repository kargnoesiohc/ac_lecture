
public class variable_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("aaa\tbbb"); // tab
//		System.out.println("aaa\nbbb"); // 줄바꿈
//		System.out.println("aaa\'bbb"); // 작은 따옴표
//		System.out.println("aaa\"bbb"); // 큰 따옴표
//		System.out.println("aaa\\tbbb"); // 백슬래시

//		byte -> short -> int -> float -> double
//		int n = 10;
//		float f = 20.3f;
//		double d= n+f;
//		System.out.println(d); // dataType = double
		
//		short s = 10;
//		short s2 = 20;
//		short s3 = s + s2; //error : int안에 short 대입 불가	
//						   //int보다 작은 데이터형간의 연산 결과는 int로 자동 변경 

//		int n = 10;
//		short n2 = (short)n; 
//		System.out.println(n2); //명시적 형 변환(강제) 

//		short x = 10;
//		short x2 = 32000;
//		short x3 = (short)(x * x2); // int -> short 데이터 손실 발생		
//		int x4 = x * x2;
		
//		System.out.println(x3); //에러
//		System.out.println(x4); // 320000
		
//		문자열 + 문자열이 아닌데이터 -> 연결된 문자열로 변환
//		System.out.println("10"+1+2+3); // 10123
//		System.out.println(1+2+3+"10"); // 610, 1+2+3연산 후(6) 문자열 10연결
//		System.out.println(1+"10"+2+3); // 11023, 1+"10" -> 문자열 이기때문에 +2+3도 문자열로 이어붙음

//		Integer.parseInt(String s, int radix); 문자 -> 숫자, 기본은 10진수
//		String k = "10";
//		System.out.println(k+20); // 1020
//		int k2 = Integer.parseInt(k); //숫자가 포함된 문자열을 정수로 변환 
//		System.out.println(k2+20); // 30
		
//		String.valueOf(); 다른 데이터타입 -> 문자열
//		System.out.println(String.valueOf(10)); // "10"
//		System.out.println(String.valueOf(3.14)); "3.14"
//		System.out.println(String.valueOf(true)); "true"
		
//		작은 타입과 큰 타입 연산 -> 큰 타입
//		int p1 = 100;
//		double p2 = 3.14;
//		double p3=p1+p2;
//		System.out.println(p3);
		
//		상수: 값 변경 불가, 상수명은 대문자
		final int SIZE = 100;
// 		SIZE = 200; //error: 값 변경 불가
		System.out.println(SIZE);
	}

}

