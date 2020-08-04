
public class Pet {
		String name;
		int age;
		String gender;
		
		public Pet() {} //부모는 기본 생성자 필수
		public Pet(String name, int age, String gender) {
				this.name = name;
				this.age = age;		
				this.gender = gender;
		}
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
		
		public String printInfo() {
				System.out.println("---Pet.printInfo() 호출 ---");
				return name +"\\"+ age +"\\"+ gender;
		}
}

class Cat extends Pet {
		private int weight;
		public Cat() {} //부모는 기본 생성자 필수
		public Cat(String name,int age,String gender,int weight) {
				super(name, age, gender);
				this.weight = weight;
		}
		
		
		public int getWeight() {
				return weight;
		}
		public void setWeight(int weight) {
				this.weight = weight;
		}
		@Override  
		public String printInfo() {		//메소드 오버라이딩 Pet -> Cat
				// TODO Auto-generated method stub
				System.out.println("---Cat.printInfo() 호출 ---");
				return super.printInfo() + "\\"+ weight;
		}
		
		
		
}
class Dog extends Pet {
		private String color;
		
//		public Dog() {}
		
		public Dog(String name,int age,String gender,String color) {
				super(name,age,gender);
				this.color = color;
		}
		
		public String getColor() {
				return color;
		}

		public void setColor(String color) {
				this.color = color;
		}

		@Override
		public String printInfo() {  //메소드 오버라이딩 Cat -> Dog
				// TODO Auto-generated method stub
				System.out.println("---Dog.printInfo() 호출 ---");
				return super.printInfo()+"\\"+color;
		}
}

class Fish extends Pet {
		private double tailsize;
		
//		public Fish() {}
		public Fish(String name,int age,String gender, double tailsize) {
				super(name,age,gender);
				this.tailsize = tailsize;
		}
		public double getTailsize() {
				return tailsize;
		}
		public void setTailsize(double tailsize) {
				this.tailsize = tailsize;
		}
		@Override
		public String printInfo() { //메소드 오버라이딩 Pet ->Fish
				// TODO Auto-generated method stub
				System.out.println("---Fish.printInfo() 호출 ---");
				return super.printInfo()+"\\"+tailsize;
		}
		
		
		
}
