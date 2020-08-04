package com.test;
// Counter 클래스를 몇번 객체 생성했는지 횟수를 구해서 출력
//class Counter{
//		static int count; //횟수를 누적시키기 위해서 단 한번 생성되어야 하고 프로그램 종료 전까지 존재햐아 하므로  static 변수 사용
//		int num;
//		public Counter() {
//				count++;
//				num = count;
//		}
//		public int getNum() {return num;}
//}

//Static 메서드 사용
class Counter2 {
		static int count;
		int num;
		public Counter2() {
				count++;
				num = count;
		}
		public int getNum() {return num; }
		public static int getCount() { return count; }
}
public class StaticTest {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
// 				System.out.println("객체 생성 횟수: " + Counter.count);
//				Counter c1 = new Counter();
//				System.out.println("객체 생성 횟수: " + c1.getNum());
//				Counter c2 = new Counter();
//				System.out.println("객체 생성 횟수: " + c2.getNum());
//				System.out.println("객체 생성 횟수: " + Counter.count);
 				System.out.println("객체 생성 횟수: " + Counter2.getCount()); //객체 생성 없이 static 메서드인 getCount() 호출
				Counter2 c1 = new Counter2();
				System.out.println("객체 생성 횟수: " + c1.getNum());
				Counter2 c2 = new Counter2();
				System.out.println("객체 생성 횟수: " + c2.getCount());
				
		}

}
