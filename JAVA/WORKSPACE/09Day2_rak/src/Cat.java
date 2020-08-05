
public class Cat extends Pet{
		private String gender;
		
		
		


		public Cat(String name, int age, String gender) {
				super(name, age);
				this.gender = gender;
		}


		@Override
		public String toString() {
				return "Cat [gender=" + gender + ", name=" + name + ", age=" + age + "]";
		}


		public String getGender() {
				return gender;
		}


		public void setGender(String gender) {
				this.gender = gender;
		}


}
