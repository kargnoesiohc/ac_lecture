package Workshop_07_05;

import java.util.ArrayList;

public class ArrayList_div {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<Integer> list1 = new ArrayList<Integer>();
				ArrayList<Integer> list2 = new ArrayList<Integer>();
				
				Method_div aa = new Method_div();
				list1 = aa.addArrayList(list1);
				list2 = aa.addArrayList(list2);
				
				aa.printDiv(list1, list2);
				
				System.out.println("종료");
			
		}

}
