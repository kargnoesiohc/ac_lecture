import java.util.Scanner;

public class For_Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i;
//		int sum = 0; //지역변수는 초기화 필요
//		for(i=0;i<=10;i++) {
//			if(i%2 == 0) {
//			sum += i; //sum=sum+i 
//			}
//		System.out.println(sum);
//		System.out.println("for문 종료 후 i 값: " + i);
//		}
		
//		int i; 
//		int odd = 0; 
//		int even = 0;
//		
//		 for(i=0;i<=10;i++)
//			 if(i%2 == 0) {
//				 even += i;
//			 } else {
//				 odd += i;
//			 }
//		System.out.println("홀수 합:" + odd +" / 짝수 합:" + even + " / 총합:  "+(even+odd));
//		System.out.println("for문 종료 후 i 값: " + i);
		
//		int i;
//		int mul_3 = 0;
//		
//		for(i=1;i<=100;i++) {
//			if(i%3 == 0 ) {
//				mul_3 += i;
//			}
//		}
//		System.out.println(mul_3);

		
		
//		int fact_10 = 1;
//		
//		for(int i=10;i > 0;i--) {
//			fact_10 *= i;
//
//		}
//		System.out.println(fact_10);
		
		//3행 5열 
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//구구단
//		for(int i=1;i<=9;i++) {
//			for(int j=2; j<=9;j++) {
//				if(j*i<10) {	
//					System.out.print(j+"x"+i +"="+ i*j + "  ");
//				} else
//					System.out.print(j+"x"+i +"="+ i*j + " ");
//			}
//			System.out.println();
//		}
		
		//직각 삼각형
//		for(int i=1;i<=5;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//직각 삼각형(우측 정렬)
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>0;j--) {
//				if(i<j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		//역삼각형
//		for(int i=5;i>0;i--) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println(); //줄 바꿈
//		}
		
		//역삼각형(우측 정렬)
//		for(int i=5;i>0;i--) {
//			for(int j=5;j>0;j--) {
//				if(i<j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//				
//			}
//			System.out.println();
//		}
		
		//피라미드
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<4-i;j++) {
//				System.out.print(" "); // 
//			}
//			for(int k=0;k<2*i+1;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//마름모
//		Scanner scan = new Scanner(System.in);
//		System.out.println("홀수 1개 입력");
//		int num = scan.nextInt();
//		for(int i=0;i<num;i++) {
//			for(int j=0;j<num;j++) {
//				if(i<=num/2) { //위쪽 마름모
//					if(i+j<=num/2-1) {
//						System.out.print(" "); //좌측 공백
//					}else if(j-i>=num/2+1) {
//						System.out.print(" "); //우측 공백
//					}else {
//						System.out.print("*"); 
//					}
//			} 
//				else if(i>num/2) { //아래쪽 마름모
//					if(i-j>=num/2+1) {
//						System.out.print(" "); //좌측 공백
//					}else if(i+j>=num/2*3+1){
//						System.out.print(" "); //우측 공백
//					}else {
//						System.out.print("*"); 
//					}
//				}
//			}
//			System.out.println(); //줄 바꿈
//		}
	}
	
}

