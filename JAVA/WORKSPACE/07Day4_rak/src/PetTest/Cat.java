package PetTest;

public class Cat {
		private String name;
		private int age;
		private String gender;
		
		
		public String getName() {
				return name;
		}
		public void setName(String name) {
				this.name = name;
		}
		public int getAge() {
				return age;
		}
		public void setAge(int age) {
				this.age = age;
		}
		public String getGender() {
				return gender;
		}
		public void setGender(String gender) {
				this.gender = gender;
		}
		
		
		public void cryCat() {
				System.out.println("cryDog() 호출");
		}
		public void eatCat() {
				System.out.println("eatDog() 호출");

		}
		public void sleepCat() {
				System.out.println("sleepDog() 호출");

		}

		
		
		public Cat(String name, int age, String gender ) {
				super();
				this.name = name;
				this.age = age;
				this.gender = gender;
		}
		
		
}
