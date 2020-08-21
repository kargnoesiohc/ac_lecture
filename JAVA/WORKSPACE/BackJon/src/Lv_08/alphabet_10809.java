package Lv_08;

import java.util.Scanner;

public class alphabet_10809 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				//알파벳 소문자로만 이루어진 단어 s
				//각각의 알파벳에 대해서 포함되어 있는 경우 처음 등장하는 위치를,
				//포함되어 있지 않은 경우에는 -1을 출력 a~z
				Scanner scan = new Scanner(System.in);
			  String str = scan.next();
        
        for (char c = 'a' ; c <= 'z' ; c++) {
               System.out.print(str.indexOf(c) + " ");
        }
		}

}
