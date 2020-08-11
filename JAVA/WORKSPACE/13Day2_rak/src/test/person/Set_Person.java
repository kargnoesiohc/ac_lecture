package test.person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Person {
//		public Set<Person> getPersonSet(Set<Person> set) {
////			Set<Person> set = new HashSet<Person>();
//			Person kkk = new Person("유관순",17,"서울");
//			set.add(new Person("홍길동",20,"서울"));
//			set.add(new Person("이순신",16,"경기"));
//			set.add(new Person("강감찬",18,"강원"));
//			set.add(new Person("홍길동",20,"서울")); //데이터는 같지만 다른 객체이기 때문에 중복이 아님
//			set.add(kkk);
////		set.add(kkk); 중복저장 x
//
//			return set;
//	}
//	
		public static void main(String[] args) {
				//SetService클래스에 Set과 print메소드 따로 분리
				SetService setser = new SetService(); //SetService기본생성자 호출
				Person kkk = new Person("유관순",17,"서울");
				Set<Person> set = setser.getPersonSet();
				setser.addPersonSet(kkk); //인자로 객체 넘겨줌
				setser.printPerson(set);
				
				
				//메인에서 Set생성s
				//빈 Set를 SetService클래스의  getPersonSet()에 넘김
				//메소드에서 객체를 담아서 return 
//				Set_Person setper = new Set_Person();
//				Set<Person>set = new HashSet<Person>();
//				Set<Person>set2 = setser.getPersonSet(set);
				
//				System.out.println(set2); //toString() 전체 출력
				
//				for(Person p:set2) {
//						System.out.println("foreach 이름만 출력: "+ p.getName());
//				}
//				Iterator<Person> ite = set2.iterator();
//				while(ite.hasNext()) {
//						Person p = ite.next();
//						System.out.println("Iterator 출력: "+ p);
//				}
		}
}
