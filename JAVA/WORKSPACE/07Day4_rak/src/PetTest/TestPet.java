package PetTest;

public class TestPet {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Cat c = new Cat("치치", 9, "암컷");
				Cat c2 = new Cat("야옹이", 3, "수컷");
				
				Dog d = new Dog("누렁이",8,"암컷","검정");
				
				Fish f = new Fish("골드",1,"수컷",140.3);
				
				System.out.println(c.getName()+"  "+c.getAge()+"  "+c.getGender());
				c.eatCat();
				c.cryCat();
				c.sleepCat();
				System.out.println(c2.getName()+"  "+c2.getAge()+"  "+c2.getGender());
				c2.eatCat();
				c2.cryCat();
				c2.sleepCat();
				System.out.println(d.getName()+"  "+d.getAge()+"  "+d.getGender()+"  "+d.getColor());
				d.eatDog();
				d.cryDog();
				d.sleepDog();
				System.out.println(f.getName()+"  "+f.getAge()+"  "+f.getGender()+ f.getTailSize());
				f.swimFish();
		}

}
