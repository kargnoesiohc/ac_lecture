import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
		String name;
		int age;
		public Person() {
				// TODO Auto-generated constructor stub
		}
		public Person(String name, int age) {
				super();
				this.name = name;
				this.age = age;
		}
		@Override
		public String toString() {
				return "Person [name=" + name + ", age=" + age + "]";
		}
		
}//end Person
class PersonComp implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				int result = 1;
				if(o1.age >= o2.age) result=-1;
				return result;
		}
}


public class List_ComparatorTest {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				List<Person> list = new ArrayList<Person>();
				list.add(new Person("홍길동",20));
				list.add(new Person("이순신",40));
				list.add(new Person("유관순",30));
				list.add(new Person("강감찬",10));
				
				//age정렬
				Collections.sort(list,new PersonComp());
				for(Person p:list) {
						System.out.println(p);
				}
		}

}
