package mapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayList_Map {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<Person> list1 = new ArrayList<>();
				list1.add(new Person("홍길동1",20,"서울1"));
				list1.add(new Person("홍길동2",20,"서울2"));
				list1.add(new Person("홍길동3",20,"서울3"));
				
				ArrayList<Person> list2 = new ArrayList<>();
				list2.add(new Person("이순신1",20,"경기1"));
				list2.add(new Person("이순신2",20,"경기2"));
				list2.add(new Person("이순신3",20,"경기3"));
				
				HashMap<String, ArrayList<Person>> map 
					= new HashMap<String, ArrayList<Person>>();
				
				map.put("1", list1);
				map.put("2", list2);
				
				Set<String> keys = map.keySet();
				for(String key:keys) {
						ArrayList<Person> x = map.get(key);
						for(Person p:x) {
								System.out.println(p.getName()+ "  "+p.getAge());
						}
				}
				
		}

}
