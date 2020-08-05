
public class Dog extends Pet{
		private String color;
		
		

		public Dog() {
				// TODO Auto-generated constructor stub
		}

		public Dog(String name, int age, String color) {
				super(name, age);
				this.color = color;
		}

		@Override
		public String toString() {
				return "Dog [color=" + color + ", name=" + name + ", age=" + age + "]";
		}

		public String getColor() {
				return color;
		}

		public void setColor(String color) {
				this.color = color;
		}
		
}
