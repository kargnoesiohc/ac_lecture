
public class Arr02 {
		public int[] arr_method() {
				int [] num = {10,20,30,40,50};
				return num;
		}
		public String arr_search(int[] arr, int num) {
				int i;
				String result = "값이 없습니다.";
				for(i=0;i<arr.length-1;i++) {
						if(arr[i] == num) {
								System.out.println(num+ "번 방 번호: "+ i);
						}
				}
				return result;
		}
}
