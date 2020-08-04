package PetTest;

public class Dog {
		private String name;
		private int age;
		private String gender;
		private String color; //Dog에만 있는 속성
		
		
		
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
		public String getColor() {
				return color;
		}
		public void setColor(String color) {
				this.color = color;
		}
		
		
		public void cryDog() {
				System.out.println("cryDog() 호출");
		}
		public void eatDog() {
				System.out.println("eatDog() 호출");

		}
		public void sleepDog() {
				System.out.println("sleepDog() 호출");

		}

		
		
		public Dog(String name, int age, String gender, String color) {
				super();
				this.name = name;
				this.age = age;
				this.gender = gender;
				this.color = color;
		}
		
		
}
