import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 아스키코드 활용
//		String s1 = "1";
//		String s2 = "2";
//		boolean bnx = false;
//		char c1 = 'A';
//		char c2 = 'B';
//		char c3 = '1';
//		char c4 = '2';
//		int inx = 2;
//		
//		System.out.println(s1+s2);
//		System.out.println(!bnx);
//		System.out.println(c1+c2);
//		System.out.println(c3+inx);
//		System.out.println(c3+c4);
		
		//2. 결과를 100의자리만 남기고 나머지 자릿수는 0으로 바꿈
//		int num =456;
//		int result = num/100*100;
//		System.out.println(result);
		
		//3. 문자형 변수ch가 영문자일 때만 변수 b의 값이 true가 되도록 완성
//		char ch = 'z';
//		boolean b = (ch >= 'A' && ch <= 'Z') || (ch >='a'&&ch <= 'z') ?true:false;
//		System.out.println(b);
		
		//4. 화씨를 섭씨로 변경. 공식 : C = 5/9 *(F-32)
//		int fahrenheit = 100;
//		float celcius = 5/9f * (fahrenheit-32);
//		System.out.println("화씨 : " +fahrenheit);
//		System.out.println("섭씨 : " + celcius);
		
		//5. 변수 선언이 아래와 같이 되어 있을 때 실행 결과와 같이 출력 
//		byte a = 10;
//		byte b = 20;
//		byte c = (byte)(a+b);
//		char ch = 'A';
//		ch = (char)(ch+2);
//		float f2 = 0.1f;
//		double d = 0.1;
//		boolean result = (float)d == f2;
//		
//		System.out.println(c);
//		System.out.println(ch);
//		System.out.println(result);

		//6. 선언된 정수형 데이터가 홀수인지 짝수인지 출력. 단, 삼항연산자 이용
//		int i = 5;
//		String result = (i%2 == 1) ? "홀수" : "짝수";
//		System.out.println(result);
		
		//7. Scanner 클래스 사용 
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("1.이름을 입력하세요.");
//		String name = scanner.next();
//		System.out.println("2.나이를 입력하세요.");
//		int age = scanner.nextInt();
//		System.out.println("이름은 " + name + ", 나이는 " + age + " 입니다.");
//		
		
		//8. Scanner 클래스 사용, 두 개의 정수값을 입력받아 더하는 코드
//		Scanner scan = new Scanner(System.in);
//		System.out.println("첫 번째 값 입력");
//		int x = scan.nextInt();
//		System.out.println("두 번째 값 입력");
//		int y = scan.nextInt();
//		
//		int result = x+y;
//		System.out.println(result);
		
		//9.Scanner 클래스 사용, 두 정수 입력받아 최대값 구하기 
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 값 입력 : ");
		int x = scan.nextInt();
		System.out.println("두 번째 값 입력 : ");
		int y = scan.nextInt();
		int result = x > y ? x : y;
		
		System.out.println("정수 " + x + " 과 정수 " + y + " 중에서 최대 값: " + result);
	}

}
