package Lv_06;

import java.util.Scanner;

public class NumCount_2577 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int a = scan.nextInt();
				int b = scan.nextInt();
				int c = scan.nextInt();
				int result = a*b*c;
				int [] arr = {0,1,2,3,4,5,6,7,8,9};
				for(int i=0;i<arr.length;i++) { //배열 크기만큼 반복
						int count = 0; //일치하는 숫자 갯수 저장
						int temp = result; // 입력 숫자 복사
						
						while(temp!= 0) {
								if(temp%10 == arr[i]) { //맨 끝자리 수 부터 비교
										count++;
								}
								temp /= 10; //뒤 부터 하나씩 빠짐
						}
						System.out.println(count);
				}
				
		}

}
