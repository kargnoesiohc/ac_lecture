package mapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapToArrayList {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				HashMap<String, Person> map1 = new HashMap<>();
				map1.put("1",new Person("홍길동1",10,"서울1"));
				map1.put("2",new Person("유관순1",10,"서울1"));
				map1.put("3",new Person("이순신1",10,"서울1"));
				
				HashMap<String, Person> map2 = new HashMap<>();
				map2.put("4",new Person("홍길동2",20,"서울2"));
				map2.put("5",new Person("유관순2",20,"서울2"));
				map2.put("6",new Person("이순신2",20,"서울2"));
				
				ArrayList<HashMap<String, Person>> list = new ArrayList<>();
				list.add(map1);
				list.add(map2);
				
				System.out.println("map1");
				for(HashMap<String, Person> x:list) {
						Set<String> keys1 = x.keySet();
						for(String key:keys1) {
								Person p = x.get(key);
								System.out.println(p);
						}
				}
				
//				Set<String> keys1 = map1.keySet();
//				Set<String> keys2 = map2.keySet();
				
//				for(String key:keys1) {
//							Person p = map1.get(key);
//							System.out.println(p);
//				}
//				System.out.println("map2");
//				for(String key:keys2) {
//						Person p = map2.get(key);
//						System.out.println(p);
//			}
		}

}
