package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class TestMain {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				HashMap<String, Person> map = new HashMap<>();
				map.put("1", new Person("홍길동",20,"서울"));
				map.put("2", new Person("이순신",30,"경기"));
				map.put("3", new Person("유관순",20,"부산"));
				
				//get(key)
				System.out.println(map.get("1").getName());
				Person one = map.get("1");
				System.out.println(one.getName()+"\n");
				
				Set<String> keys = map.keySet(); 
				for(String key:keys) {
						Person p = map.get(key);
						System.out.println("foreach : "+p.getName());
				}
				Iterator<String> ite = keys.iterator();
				while(ite.hasNext()) {
						String key = ite.next();
						Person p = map.get(key);
						System.out.println("Iterator : "+p.getName());
				}
				
		}

}
