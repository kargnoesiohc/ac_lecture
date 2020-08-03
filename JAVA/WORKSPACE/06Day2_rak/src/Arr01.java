
public class Arr01 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Arr02 arr02 = new Arr02();
				int [] arr = new Arr02().arr_method();
				for(int i:arr) {
						System.out.println(i);
				}
				
				arr02.arr_search(arr, 40);
				
				
				
				
				//최대값, 최소값
//				int [] score = {32,34,67,22,11,9};
//				int max = score[0];
//				int min = score[0];
//				for(int i=0;i<score.length;i++) {
//						if(max<=score[i]) {
//								max = score[i];
//						}
//						if(min>=score[i]) {
//								min = score[i];
//						}
//				}
//				System.out.println("최대값 : "+ max );
//				System.out.println("최소값 : "+ min );
				
				
		}

}
