package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_Test {
		public static void main(String[] args) {
				HashMap<String, String> map = new HashMap<String, String>();
				map.put("name","홍길동");
				map.put("age","20");
				map.put("address","서울");
				map.put("email",null); //HashMap은 null허용 / HashTable은 null불가
				
				System.out.println("이름 : "+ map.get("name"));
				System.out.println("나이 : "+ map.get("age"));
				System.out.println("주소 : "+ map.get("address"));
				System.out.println("email : "+ map.get("email"));
				
				System.out.println("Map.size() : "+ map.size());
				System.out.println("Map이 비어있는지 여부 : "+ map.isEmpty());
				System.out.println("age키 존재 여부 : "+ map.containsKey("age"));
				System.out.println("홍길동이라는 값 존재 여부 : "+ map.containsValue("홍길동"));
				System.out.println("키가 age인 데이터 삭제 : "+ map.remove("age"));
				
				System.out.println("전체 데이터 출력"+map);
				
				//key값만 얻기
				Set<String> keys = map.keySet();
				System.out.println(keys);
				for(String key:keys) {
						System.out.println("foreach : "+key+"  "+map.get(key));
				}
				Iterator<String>ite = keys.iterator();
				while(ite.hasNext()) {
						String key = ite.next();
						System.out.println("Iterator :"+key+"  "+map.get(key));
				}
		}
}
