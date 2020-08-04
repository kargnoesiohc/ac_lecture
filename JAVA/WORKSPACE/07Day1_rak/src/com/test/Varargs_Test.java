package com.test;

class VarTest {
		public VarTest(int ...x) {
				System.out.println("생성된 인자 갯수" + x.length);
		}
		public void sayEcho(String ...names) {
				for(String x: names) {
						System.out.print(x+"\t");
				}
				System.out.println();
		}
}

public class Varargs_Test {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				VarTest var1 = new VarTest(10);
				VarTest var2 = new VarTest(10,20);
				VarTest var3 = new VarTest(9,8,7,6,5);
				
				var1.sayEcho("홍길동");
				var1.sayEcho("서울","부산");
				var1.sayEcho("봄","여름","가을","겨울");
				
		}

}
