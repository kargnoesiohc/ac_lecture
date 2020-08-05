
public class TestPet {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				//다형성의 대표적인 예
				Pet [] c = new Pet[] {
					new Cat("야옹이", 3, "암컷"),
					new Dog("멍멍이",7,"갈색"),
					new Fish("금붕어",5,140.2),
				};
				
				for(Pet pet:c) {
						String name = pet.getName();
						int age = pet.getAge();
				}
		}

}
