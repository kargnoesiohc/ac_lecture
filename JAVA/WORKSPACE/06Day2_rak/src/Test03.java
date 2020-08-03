
public class Test03 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				//1. 배열의 합과 평균
				int[] arr = {10,20,30,40,50};
			
				int sum = 0;
				double avg = 0;
//				for(int i=0;i<arr.length;i++) {  
//						sum += arr[i];
//						avg += arr[i]/arr.length;
//				} 
				Test03_01 test = new Test03_01();
				sum=test.printSum(arr);
				avg=test.printAvg(arr);
//				System.out.println(sum);
				System.out.println("sum: "+sum+"\n"+"avg: "+avg);
		}

}

