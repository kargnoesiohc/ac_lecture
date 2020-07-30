
public class Array_Test {
		public void printArr(int get, int[] num) {
				System.out.println("printArr 호출");
				System.out.println("int get 출력: "+get);
				for(int i=0;i<num.length;i++) {
						System.out.println("int num["+i+"] 출력: "+num[i]);
				}
		}
		public void printForEach(int[] arr) {
				System.out.println("printForEach 호출");
				int sum = 0;
				for(int i:arr) {   //for each
					sum += i;
					System.out.println("int num["+i+"] 출력: "+i);
			}
				System.out.println("arr 합계: "+sum);
		}

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Array_Test test = new Array_Test();
				int [] num; //배열 선언 -> dataType [] 변수명;
//				String [] str;
				num = new int[3];//배열 생성 -> new dataType[크기]; index는 0부터 시작, 자동 초기화
				
//				System.out.println(num[1]); // 결과: 0 -> int 배열 초기 값: 0
//				System.out.println(str[1]); // 결과: null -> String 배열 초기 값: 0

				num[0] = 10; //배열안에 데이터 대입 
				num[1] = 20; //배열안에 데이터 대입
				num[2] = 30; //배열안에 데이터 대입
				test.printArr(1000,num); //printArr() 호출
				System.out.println("printArr() 수행 후 메인 수행");
				
				int [] arr; 
				arr = new int[3];

				arr[0] = 10; 
				arr[1] = 20; 
				arr[2] = 30;
				test.printForEach(arr);
				System.out.println("printForEach() 수행 후 메인 수행");
				
				
//				System.out.println(num[0]);
//				System.out.println(num[1]);
//				System.out.println(num[2]);
//				System.out.println("배열 길이: "+ num.length);
				
//				for(int i=0; i<num.length;i++) {
//						System.out.println("(for 반복)>>" + num[i]);
//				}
//
//				for(int i:num) {	//for each문
//						System.out.println("(for each 반복)>>"+i); // for(type var: iterate(배열명) {
//																										  //  반복으로 실행할 구문 } 
//				}
//				int [] num = new int[]{30,70,90,100,50}; //동적 할당 - 배열의 크기가 정해져있지 않음(값의 개수에 의해서 정해짐)
//				int sum = 0;
////				for(int i=0; i<num.length;i++) {
////						sum += num[i];
////				}
//				for(int i:num) {   //for each
//						sum += i;
//				}
//				System.out.println("총합: "+sum+ " 평균: " + sum/num.length);
				
//				int [] kor = {100,80,80};
//				int [] eng = {90,75,60};
//				int ksum = 0;
//				int esum = 0;
//				
//				for(int i=0; i<kor.length;i++) {
//						ksum += kor[i];
//				}
//				for(int j:eng) {  //for each
//						esum += j;
//				}
//				System.out.println("kor 평균: " +ksum/kor.length+ "\neng 평균: " +esum/eng.length );
		}	

}
