package test.person;

import java.util.HashSet;
import java.util.Set;

public class SetService {
		Set<Person> set = new HashSet<Person>();
		
		public Set<Person> getSet() {
				return set;
		}
		//인자로 person을 받아와서 set에 add해주는 함수
		public void addPersonSet(Person p){
				set.add(p);
		}
	
		public Set<Person> getPersonSet() {
//					
				set.add(new Person("홍길동",20,"서울"));
				set.add(new Person("이순신",16,"경기"));
				set.add(new Person("강감찬",18,"강원"));
				set.add(new Person("홍길동",20,"서울")); //데이터는 같지만 다른 객체이기 때문에 중복이 아님
////				set.add(kkk);
////			set.add(kkk); 중복저장 x
			return set;
	}
		public void printPerson(Set<Person> set) {
				for(Person p:set) {
						System.out.println(p);
				}
		}

}
