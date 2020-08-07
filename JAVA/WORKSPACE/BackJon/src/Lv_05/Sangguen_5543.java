package Lv_05;

import java.util.Scanner;

public class Sangguen_5543 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				//버거3종류 음료 2종류 
				//세트는 50원 할인 
				//가장싼 세트메뉴 출력
				Scanner scan = new Scanner(System.in);
				int [] bug = new int[3];
				int [] juc = new int[2];
				int minbug = 2000;
				int minjuc = 2000;
				for(int i=0;i<bug.length;i++) {
						bug[i] = scan.nextInt();
						if(minbug > bug[i]) {
								minbug = bug[i];
						}
				}
				for(int i=0;i<juc.length;i++) {
						juc[i] = scan.nextInt();
						if(minjuc > juc[i]) {
								minjuc = juc[i];
						}
				}
				System.out.println(minbug+minjuc-50);
		}
}
