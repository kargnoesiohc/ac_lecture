
public class TestPet {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				// 다형성 - 여러가지 형태를 가짐. 다형성이 적용 되었을 때 참조 변수는 컴파일 시점과 런타임 시점에서 참조하는 함수가 다르다.(동적
				// 바인딩)
				// 부모 클래스의 배열로 자식클래스 들을 관리
				Pet pets[] = { 
								new Cat("치치", 9, "암컷", 5), 
								new Cat("야옹이", 3, "수컷", 5), 
								new Dog("멍멍이", 7, "수컷", "갈색"),
								new Fish("금붕어", 3, "암컷", 140.2),
								};

				/*// 자식클래스(Cat,Dog,Fish) 전부 출력
				for (Pet pet : pets) {
						System.out.println(pet.printInfo()); // 자식 객체 안에 있는 함수 호출 - 동적 바인딩
				//					System.out.println(pet.getWeight()); // 자식 객체의 유일한 함수, 접근 불가능 
				}*/

				// 부모클래스(Pet)의 자식 클래스 중 Cat만 출력 //instanceof - 참조변수가 참조하고 있는 인스턴스의 실제 타입을 확인
				for (Pet pet : pets) {
						if (pet instanceof Cat) {
								Cat c = (Cat) pet; // 참조변수의 형 변환 : Pet pet -> Cat pet
								System.out.println(c.printInfo());
						}
				}
				/*
				Pet pet = new Cat("치치",9,"암컷",5); System.out.println(pet.printInfo()); // 자식 객체 안에 있는 함수 호출 - 동적 바인딩 // 
				//System.out.println(pet.getWeight()); // 자식 객체의 유일한 함수, 접근 불가능 
				Cat c = (Cat)pet; //형 변환 
				System.out.println(c.getWeight());
				*/

											
				/*	Cat cat1 = new Cat("치치",9,"암컷");
				Cat cat2 = new Cat("야옹이",3,"수컷"); 
				Cat cat[]= { cat1, cat2, };
				
				Dog dog1 = new Dog("멍멍이",7,"수컷","갈색"); Dog dog[] = { dog1, };
				
				Fish fish1 = new Fish("금붕어",3,"암컷",140.2); Fish fish[] = { fish1, };*/
				
				/*for(Cat i:cat) { System.out.println(i.printInfo()); } 
				for(Dog i:dog) { System.out.println(i.printInfo()); } 
				for(Fish i:fish) { System.out.println(i.printInfo()); }*/
						
		}

}
