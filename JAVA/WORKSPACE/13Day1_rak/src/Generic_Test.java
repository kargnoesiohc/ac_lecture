import java.util.ArrayList;
import java.util.Date;

//제네릭 타입 클래스(형 변환 필요 없음)
class Box2<T>{ //<T> - 타입 파라미터 선언/참조타입 지정
		T obj;

		public T getObj() {
				return obj;
		}

		public void setObj(T obj) {
				this.obj = obj;
		}
		
} //end Box2

public class Generic_Test {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Box2<String> b1 = new Box2<String>();
				b1.setObj("hello");
//				b1.setObj(123); //타입 에러.
//				String str = (String)b1.getObj(); //형 변환 필요
				String str = b1.getObj(); //형변환 필요 없음
				System.out.println(str);
				
				
				Box2<Date> b2 = new Box2<>(); //<>생략가능
				b2.setObj(new Date());
//				System.out.println((Date)b2.getObj()); //형변환 필요
				System.out.println(b2.getObj()); //형변환 필요 없음
				
				Box2<Integer> b3 = new Box2<>();
				b3.setObj(11234);
				System.out.println(b3.getObj());
		}//end main

}


