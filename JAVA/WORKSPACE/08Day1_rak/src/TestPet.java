
public class TestPet {
		public static void main(String[] args) {

				// TODO Auto-generated method stub
				// 다형성 - 여러가지 형태를 가짐. 다형성이 적용 되었을 때 참조 변수는 컴파일 시점과 런타임 시점에서 참조하는 함수가 다르다.
				//동적바인딩
				TestPet testpet = new TestPet();
				Pet[] pets = testpet.createPetArr();
				testpet.arrPetPrint(pets);
		}
		
		public Pet[] createPetArr() {
				Pet[] pets = new Pet[] {
								new Cat("치치", 9, "암컷", 5),
								new Cat("야옹이", 3, "수컷", 5), 
								new Dog("멍멍이", 7, "수컷", "갈색"),
								new Fish("금붕어", 3, "암컷", 140.2),
				};
				return pets;
		}

		public void arrPetPrint(Pet pets[]) {
				for(Pet pet: pets) {
					if(pet instanceof Cat) {
							Cat c = (Cat)pet;
							System.out.println(c.printInfo());
					} else if(pet instanceof Dog) {
							Dog d = (Dog)pet; //참조변수 형 변환
							System.out.println(d.printInfo());
					} else if(pet instanceof Fish) {
							Fish f = (Fish)pet;
							System.out.println(f.printInfo());
					}
			}
		}

	

}
