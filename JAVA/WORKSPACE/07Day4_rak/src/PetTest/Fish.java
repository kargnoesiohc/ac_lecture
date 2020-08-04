package PetTest;

public class Fish {
		private String name;
		private int age;
		private String gender;
		private double tailSize; //Fish에만 존재하는 속성(가정)
		
		
		
		
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

		public double getTailSize() {
				return tailSize;
		}

		public void setTailSize(double tailSize) {
				this.tailSize = tailSize;
		}
		
		
		public void swimFish() {
				System.out.println("swimFish() 호출");
		}

		public Fish(String name, int age, String gender, double tailSize) {
				super();
				this.name = name;
				this.age = age;
				this.gender = gender;
				this.tailSize = tailSize;
		}
		
}
