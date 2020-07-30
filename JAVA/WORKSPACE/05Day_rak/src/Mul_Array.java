
public class Mul_Array {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
//				int [][] num; //1. 2차원 배열 선언
//				num = new int[2][3]; //2행 3열
//				num[0][0] = 10;
//				num[0][1] = 20;
//				num[0][2] = 30;
//				num[1][0] = 40;
//				num[1][1] = 50;
//				num[1][2] = 60;
				
//				System.out.println(num[0][0]); //10
//				System.out.println(num[0][1]); //20
//				System.out.println(num[0][2]); //30
//				System.out.println(num[1][0]); //40
//				System.out.println(num[1][1]); //50
//				System.out.println(num[1][2]); //60
				
//				for(int i=0;i<num.length;i++) {   //num.length == 2 /*num[i][j]*/
//						for(int j=0;j<num[i].length;j++) {   //num[i].length == 3
//								System.out.println(num[i][j]);
//						}
//				}
				
//				for(int[] i:num) {  //for each
//						for(int j:i) {
//								System.out.println(j);
//						}
//				}
				
				int [][] arr = {
								{5,5,5},
								{10,10,10,10},
								{15,15},
								{20}
				};
				int [] num;
				num = new int[] {1,2,3};
				System.out.println(num[0]);
				System.out.println(num[1]);
				System.out.println(num[2]);
				
//				for(int i=0;i<arr.length;i++) {
//						for(int j=0;j<arr[i].length;j++) {
//								System.out.print(arr[i][j]);
//						}
//						System.out.println(" /열 크기: " + arr[i].length);
//				}
				
//				for(int[] i:arr) {
//						for(int j:i) {
//								System.out.print(j);
//						}
//						System.out.println(" /열 크기: " +i.length);
//				}
				
		}
		

}
