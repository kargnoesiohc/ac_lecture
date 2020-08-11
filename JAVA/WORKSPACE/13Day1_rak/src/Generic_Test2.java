class Group<T>{
		T obj;

		public T getObj() {
				return obj;
		}

		public void setObj(T obj) {
				this.obj = obj;
		}
		
}
class Person{}
class Man extends Person{}
class Woman extends Person{}

public class Generic_Test2 {
		public static void method1(Group<?> group) {}
		public static void method2(Group<? extends Person> group) {}
		public static void method3(Group<? super Person> group) {}
		
		public static void main(String[] args) {
				//method1: 어떤 타입도 설정 가능
				method1(new Group<Object>());
				method1(new Group<Person>());
				method1(new Group<Man>());
				method1(new Group<Woman>());
				
				//method2: Person 또는 Person의 자식만 가능 (Person extends)
				method2(new Group<Person>());
				method2(new Group<Man>());
				method2(new Group<Woman>());
				
				//method3: Pesron 또는 Person의 부모만 가능 (Person super)
				method3(new Group<Object>());
				method3(new Group<Person>());
		}
}
