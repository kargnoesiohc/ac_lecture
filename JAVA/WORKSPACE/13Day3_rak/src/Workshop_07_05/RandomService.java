package Workshop_07_05;

import java.util.ArrayList;
import java.util.HashMap;

public class RandomService {
		
		ArrayList<Integer> list1;
		ArrayList<Integer> list2;
		
		public RandomService() {
				// TODO Auto-generated constructor stub
				super();
				
		}
		
		public void addArrayList() {
				
				for(int i=0;i<10;i++) {
						list1.add((int)(Math.random()*10));
						list2.add((int)(Math.random()*10));
				}
		}
		
		public void printDiv() {
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
