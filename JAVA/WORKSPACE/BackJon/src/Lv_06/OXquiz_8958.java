package Lv_06;

import java.util.Scanner;

public class OXquiz_8958 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				// OOXXOXXOOO -> 1+2+0+0+1+0+0+1+2+3 = 10점
				//ox퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램
				//첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 
				//길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				String [] arr = new String[n];
				String [] ox = null;
				int score;
				int count;
				for(int i=0;i<arr.length;i++) {
						arr[i] = scan.next();
						score = 0;
						count = 0;
						ox = null;
						ox = arr[i].split("");
						for(int j=0;j<ox.length;j++) {
								if(ox[j].equals("O")) {
										count++;
										score += count;
								} else
										count = 0;
						}
						System.out.println(score);
				}
		}

}
