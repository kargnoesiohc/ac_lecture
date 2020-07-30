
public class Method_Re_Arr {
		
		public static void main(String[] args) {
				int[] num = {1,2,3,4};
				int num1 = 10;
					System.out.println("change() 호출 전 : ");
				for(int i:num) {
						System.out.println(i);
				}
				change(num);
				
				System.out.println("change() 호출 후 : "); //참조형 변수는 같은 주소 참조 -> 값 변경 가능
				for(int i:num) {
						System.out.println(i);
				}
				System.out.println("change2() 호출 전 : "+ num1); 
				change2(num1);
				System.out.println("change2() 호출 후 : "+ num1); //기본형 변수는 값 수정 불가
		}
		public static void change(int[] num) {
				num[0] = 100; //참조형 변수는 값 수정 가능
		}
		public static void change2(int num) {
				num = 100; //기본형 변수는 값 수정 불가
		}
}
