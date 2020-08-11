import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
// HashSet - 순서가 없는 데이터 처리, 중복 저장이 불가능하고 저장된 위치를 알 수 없음. 따라서 모든 데이터 출력이 최선
//hanNext(), next()
public class HashSet_Test {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Set<String> s = new HashSet<String>();
				s.add("홍길동"); //데이터 추가
				s.add("이순신");
				s.add("유관순");
				s.add("홍길동"); //중복 데이터 추가 x
				s.add("강감찬");
				
				System.out.println("toString() 전체 출력: " + s); 
				 
				for(String data:s) {
						System.out.println("foreach 전체 출력: "+ data);
				}
				
				System.out.println("Set 데이터 갯수: " + s.size());
				System.out.println("Set 비어있음 여부: "+ s.isEmpty());
				System.out.println("Set의 이순신 포함 여부: "+ s.contains("이순신"));
				System.out.println("이순신 삭제 실행");
				s.remove("이순신"); //지정 데이터 삭제
				
				for(String data:s) {
						System.out.println("foreach 전체 출력(이순신 삭제 후): "+ data); 
				}
				
				System.out.println("객체 타입 배열에 저장");
				Object [] xxx = s.toArray();
				for(Object obj:xxx) {
						System.out.println("Object: "+obj);
				}
				
				
				Iterator<String> ite = s.iterator();
				while(ite.hasNext()) {//다음 데이터 남아있으면 true
						String data = ite.next(); //data에 다음 데이터 저장
						System.out.println("Iterator: "+data);
				}
				System.out.println("전체 삭제 실행");
				s.clear();
				System.out.println("toString() 전체 출력: "+ s);
		}

}
