import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Test {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<String> list = new ArrayList<String>();
				list.add("홍길동");
				list.add("이순신");
				list.add("유관순");
				list.add("홍길동");
				list.add("홍길동");
				
				System.out.println("0 위치값 출력: "+ list.get(0));
				System.out.println("toString() 전체 줄력:"+ list);
				
				for(String data:list) {
						System.out.println("foreach 전체 출력: "+ list);
				}
				Iterator<String> ite = list.iterator();
				while(ite.hasNext()) {
						System.out.println(ite.next());
				}
				
				System.out.println("list 원소 개수: "+ list.size());
				System.out.println("list 비어있는지 여부: "+ list.isEmpty());
				System.out.println("list 이순신 포함여부: "+ list.contains("이순신"));
				System.out.println("홍길동 위치: "+list.indexOf("홍길동"));
				
				List<String> sublist = list.subList(0, 3);//리스트의 일부분만 추출하여 서브 리스트 생성
				System.out.println("SubList: "+sublist);
				
				
				Object[] arr = list.toArray();
				System.out.println("배열로 변환 후 출력: "+ Arrays.toString(arr));
				
				System.out.println("전체 삭제 실행");
				list.clear();
				System.out.println("삭제 후 toString() 전체 출력: "+ list);
				
				
				List<String> list2 = Arrays.asList("홍길동","유관순","이순신");
				System.out.println(list2);
				
				
		}

}
