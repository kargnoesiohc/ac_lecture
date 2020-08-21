package Lv_08;

import java.util.Scanner;

public class ASCII_11654 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 아스키 코드 값 출력
				Scanner scan = new Scanner(System.in);
				String ascii = scan.next();
				int result = ascii.charAt(0); //문자열에서 인덱스에 해당하는 문자 추출
				System.out.println(result);
		}

}
