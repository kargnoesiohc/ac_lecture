
public class Test03_01 {
		private int sum = 0;
		public int printSum(int[] arr){
				
//				for(int i=0;i<arr.length;i++) {  
//					sum += arr[i];
//				}
				for(int i:arr) {
						sum += i;
				}
				return sum;
		}
		
		public double printAvg(int[] arr){
				int avg = 0;
				avg = sum/arr.length;
//				for(int i=0;i<arr.length;i++) {  
//				avg += arr[i]/arr.length;
//				}
				return avg;
		}
}
