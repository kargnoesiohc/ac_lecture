import java.util.Arrays;

public class Comp_Test {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Comp [] c = new Comp[] {
								new Comp("홍길동",20),
								new Comp("이순신", 44),
								new Comp("유관순", 18),
								new Comp("강감찬",66),
				};
				Arrays.sort(c,new PersonComp()); //Arrays.sort(배열명, 객체 생성)
				for(Comp comp:c) {
						System.out.println(comp);
				}
		}

}
