import java.util.Comparator;

public class Comp {
		String name;
		int age;
		public Comp(String name, int age) {
				super();
				this.name = name;
				this.age = age;
		}
		@Override
		public String toString() {
				// TODO Auto-generated method stub
				return name + " " + age;
		}
} //end Comp
class PersonComp implements Comparator<Comp>{ //Comparator 인터페이스 활용
																							//배열에 저장된 클래스의 특정 변수 값으로 정렬
		@Override
		public int compare(Comp c, Comp c1) {
				// TODO Auto-generated method stub
				int result = -1;
				//if(정렬 기준(age비교)
				if(c.age >= c1.age) result = -1; //음수값 리턴하면 내림차순
				return result;
				/*int result = -1;
				if(c.age >= c1.age) result = 1; //양수값 리턴하면 내림차순
				return result;*/
		}
		
}
