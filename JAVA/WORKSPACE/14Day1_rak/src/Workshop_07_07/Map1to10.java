package Workshop_07_07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map1to10 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				HashMap<String, Integer> map = new HashMap<>();
				map.put("1", 1);
				map.put("2", 2);
				map.put("3", 3);
				map.put("4", 4);
				map.put("5", 5);
				map.put("6", 6);
				map.put("7", 7);
				map.put("8", 8);
				map.put("9", 9);
				map.put("10", 10);
				
				int sum = 0;
				Set<String> keys = map.keySet();
				for(String key:keys) {
					Integer	k = map.get(key);
					sum += k;
				}
				System.out.println("foreach : "+sum);
				sum = 0;
				Iterator<String> ite = keys.iterator();
				while(ite.hasNext()) {
						String m = ite.next();
						Integer k = map.get(m);
						sum += k;
				}
				System.out.println("Iterator : "+sum);
		}	

}
