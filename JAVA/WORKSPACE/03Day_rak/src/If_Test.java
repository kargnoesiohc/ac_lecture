import java.util.Scanner;

public class If_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 단일 if
//		System.out.println("문장 1");
//		int num = 0;
//		if(3==13) {
//			num=10;
//			System.out.println("문장2");
//			System.out.println("문장2-1");
//		}
//		System.out.println(num);
//		System.out.println("문장3");
		
		//2. if~else
//		System.out.println("Line_1");
//		int num = 0;
//		if(num>0) {
//			num = 3; //초기화
//			System.out.println("참");
//			System.out.println("참2");
//			System.out.println(num);
//		} else {
//			System.out.println("거짓");
//			System.out.println("거짓2");
//		}
//		System.out.println(num);
//		System.out.println("Line_2");
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("첫 번째 정수 입력: ");
//		int x = scan.nextInt();
//		System.out.println("두 번째 정수 입력: ");
//		int y = scan.nextInt();
//		int answer = x*y;
//		System.out.println(x + "X" + y +"? : ");
//		int result = scan.nextInt();
//		if(result == answer) {
//			System.out.println("정답");
//		} else {
//			System.out.println("오답");
//		}
//		System.err.println("프로그램 종료");

//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수 입력: ");
//		int num = scan.nextInt();
//		String result;
//		if(num>=90) {
//			result = "A등급";
//		} else if(num>=80) {
//			result = "B등급";
//		} else if(num>=70) {
//			result = "C등급";
//		} else if(num>=60) {
//			result = "D등급";
//		} else {
//			result = "E등급";
//		}
//		scan.close();
//		System.out.println(result + "입니다.");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("알파벳 한 글자 입력 : ");
		char x = scan.next().charAt(0);
		if(x >= 'a' && x <= 'z') {
			System.out.println(x + " : 소문자");
		} else if(x >= 'A' && x <= 'Z') {
			System.out.println(x + " : 대문자");
		} else {
			System.err.println("알파벳이 아닙니다.");
		}

	}

}
