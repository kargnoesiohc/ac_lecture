import java.io.BufferedReader;
import java.util.Scanner;

public class Test_03 {
	public static void main(String[] args) {
		//1. 조건문
//		int inx = 15;
		// 1. int형 변수 inx가 10보다 크고 20보다 작을 때 true인 조건식
//		if(inx>10 && inx <20 ){
//		System.out.println("true");
//		} else 
//			System.out.println("false");
//		char ch1 =' ';
		// 2. char형 변수 ch가 공백이 아닐 때 true인 조건식
//		if(ch1 == ' '){
//		System.out.println("true");
//		} else 
//			System.out.println("false");
//		char ch2 = 'x';
		// 3. char형 변수 ch가 ‘x’ 또는 ‘X’일 때 true인 조건식
//		if(ch2 == 'x' || ch2 =='X' ){
//		System.out.println("true");
//		} else 
//			System.out.println("false");
// 		char ch3 = '0';
		// 4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
//		if(ch3 >= '0' && ch3 <= '9'){
//		System.out.println("true");
//		} else 
//			System.out.println("false");
//		char ch4 = 'a';
		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//		if(ch4 >='a' && ch4 <='z' || ch4 >='A' && ch4 <='z'){
//		System.out.println("true");
//		} else 
//			System.out.println("false");
//		int year = 400;
		// 6. int형 변수 year가 400으로 나눠 떨어지거나, 또는 4로 나눠 떨어지고
		//    100으로 나눠 떨어지지 않을 때 true인 조건식
//		if(year%400 ==0 || year%4 ==0 && year%100 != 0){
//		System.out.println("true");
//		} else 
//			System.out.println("false");
//		boolean powerOn =false;
		// 7. boolean형 변수 powerOn가 false일 때 true인 조건식
//		if(!powerOn){
//		System.out.println("true");
//		} else 
//			System.out.println("false");
	
		// 4. 조건문 (세 주사위 합이 6이되는 경우의 수)
//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 6; j++) {
//				for (int k = 1; k <= 6; k++) {
//					if (i + j + k == 6) {
//						System.out.println(i + "+" + j + "+" + k + "=" + (i + j + k));
//					}
//				}
//			}
//		} 
			
		// 7. 1부터 100까지 더하는 프로그램. 단, Scanner로 1자리 정수로 입력 받아 입력 받은 수의 배수만 더한다.
//			Scanner scan = new Scanner(System.in);
//			System.out.println("한 자리 정수 값을 입력하시오.");
//			int sum = 0;
//			int num = scan.nextInt();
//			for(int i=1;i<=100;i++) {
//					if(i%num == 0) { //배수 조건
//							sum += i; //합계
//							if(i!=num) { 
//								System.out.print("+");
//							}
//							System.out.print(i);
//					}
//			}
//			System.out.println("="+ sum);
			// 11. Scanner클래스 사용, 두 정수값, b-a출력. 단, b값이 a값보다 작으면 b를 다시 입력받는다.
//			Scanner scan = new Scanner(System.in);
//			System.out.println("정수 a를 입력: ");
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			while(true) {
//					if(b<a) {
//							System.out.println("정수 2개 재입력:\n(첫 번째 정수보다 두번째 정수가 커야함) ");
//							a = scan.nextInt();
//							b = scan.nextInt();
//					} else {
//							
//							System.out.println(a+b);
//							break;
//					}
//			}
			
			//12. Scanner클래스, 양수 입력바당서 자릿수 출력. 단, 음수 입력시 재입력
			Scanner scan = new Scanner(System.in);
			System.out.println("정수 a를 입력: ");
			int a = scan.nextInt();
			while(true) {
					if(a>0) {
							break;
					}
					System.out.println("양의 정수 값 입력");
			}
			int i;   
			System.out.print("a는 ");
			for(i=1;i<a;i++) {  //소수점이 나올때까지 10으로 나눔 -> 10으로 나눈 횟수가 곧 자릿수
				if(a>1)
						a/=10;
			}
			System.out.println(i + "자리 입니다.");
			
//			int length = (int)Math.log10(a)+1; //Math.log10(double)
//			System.out.println(a+"는 "+ length + "자리 입니다.");
	}
}
