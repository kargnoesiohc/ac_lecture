package com.test;

class Cat {
		String name;
		public Cat(String name) {
				this.name = name;
		}
		public String getName() {
				return this.name;
		}
}

public class Class_Array {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				//new 연산자 배열
				Cat[] cats = new Cat[3];
				cats[0] = new Cat("나비");
				cats[1] = new Cat("야옹이");
				cats[2] = new Cat("점박이");
				
				//리터럴 연산자 배열
				Cat [] cats2 = { new Cat("나비"),
												 new Cat("야옹이"),
												 new Cat("점박이"),
												 new Cat("하늘"),
											 };
				
				// new + 리터럴
				Cat [] cats3 = new Cat[] { new Cat("나비"),
								                   new Cat("야옹이"),	
								                   new Cat("점박이"),
								                   new Cat("구름"),
								                 };
				System.out.println("---cats2---");
				for(int c=0;c<cats2.length;c++) {
						System.out.println("이름: "+ cats2[c].getName());
				}
				System.out.println("\n ---cats3---");
				
				for(Cat c:cats3) {
						System.out.println("이름 : "+ c.getName());
				 }
		}

}
