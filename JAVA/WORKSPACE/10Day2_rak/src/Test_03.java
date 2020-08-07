import java.util.Scanner;

public class Test_03 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				
				System.out.println("키의 최댓값을 구합니다.");
				
				System.out.print("사람 수: ");
				int n = scan.nextInt();
				int [] a = new int[n];
				int max = 0;
				for(int i=0;i<a.length;i++) {
						int height = scan.nextInt();
						a[i] = height;
						System.out.println("사람 "+(i+1) +": "+ a[i]);
						if(max < a[i]) {
								max = a[i];
						}
				}
				System.out.println(max);
		}

}

