import java.util.Scanner;

public class Switch_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 1부터 4사이 하나 입력");
		int num = scan.nextInt();
		String result;

//		switch (num) {
//		case (1):
//			result = "1 입력";
//			break;
//		case (2):
//			result = "2 입력";
//			break;
//		case (3):
//			result = "3 입력";
//			break;
//		case (4):
//			result = "4 입력";
//			break;
//		default:
//			result = "범위 밖 숫자 입력";
//			break;
//		}
//		System.out.println(result);
		
		//if문 치환
		if(num == 1) {
			result = "1 입력";
		} else if(num == 2) {
			result = "2 입력";
		} else if(num == 3) {
			result = "3 입력";
		} else if(num == 4) {
			result = "4 입력";
		} else {
			result = "범위 밖 숫자 입력";
		}
		System.out.println(result);
	}
}
