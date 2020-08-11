package Workshop_07_05;

import java.util.ArrayList;

public class Method_div {
		
		public ArrayList<Integer> addArrayList(ArrayList<Integer> list) {
				for(int i=0;i<10;i++) {
						list.add((int)(Math.random()*10));
				}
				return list;
		}
		
		public void printDiv(ArrayList<Integer> list1, ArrayList<Integer> list2) {
				// TODO Auto-generated constructor stub
				int div = 0;
				for(int i=0;i<10;i++) {
						try {
								div = list1.get(i)/list2.get(i);
								System.out.println(list1.get(i) + "/" + list2.get(i) + " = "+div);
								
						} catch (Exception e) {
								System.out.println("분모가 0입니다.");
								// TODO: handle exception
						}
				}
		}
		

}
