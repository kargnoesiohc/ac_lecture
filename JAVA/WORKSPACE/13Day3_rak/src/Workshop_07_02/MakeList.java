package Workshop_07_02;

import java.util.ArrayList;
import java.util.List;

public class MakeList {
		List<Integer> list = new ArrayList<>();
		public MakeList() {
				// TODO Auto-generated constructor stub
		}
		public void makeArrayList(int size) {
				for(int i=0;i<size;i++) {
						list.add((int)(Math.random()*10+10));
				}
		}
		
		public List<Integer> getList(){
				return list;
		}
		
		public double getAverage() {
				double avg = 0;
				for(Integer l:list) {
						avg += l;
				}
				return avg/list.size();
				
		}
}
