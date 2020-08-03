
public class array222 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				int [] arr = new int[5];
				int [] arr2 = new int[5];
				int num = 10;
        for(int i=0;i<arr.length;i++) {
        		arr[i] = num++;
        		System.out.print(System.identityHashCode(arr[i]));
        		System.out.println("   "+arr[i]);
        }
        System.out.println(System.identityHashCode(arr[0]));

        System.out.println();
        System.out.println();
        System.out.println();
        
				for(int i: arr2) {
						arr2[i] = num++;
						System.out.print(arr2[i]+ "  ");
						System.out.println(System.identityHashCode(arr2[i]));
				}
				System.out.println("    "+System.identityHashCode(arr2[0]));
//        for(int i=0;i<arr2.length;i++) {
//        		System.out.println(System.identityHashCode(arr2[i]));
//        }
//    		System.out.println(System.identityHashCode(arr2));


		}

}

