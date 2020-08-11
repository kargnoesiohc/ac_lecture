
class Pet{}
class Cat extends Pet{}
class Dog extends Pet{}

class Box3<T extends Pet>{
		T obj;

		public T getObj() {
				return obj;
		}

		public void setObj(T obj) {
				this.obj = obj;
		}
		
}

public class Generic_extends_Test {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Box3<Pet> p = new Box3<>();
				Box3<Cat> c = new Box3<>();
				Box3<Dog> d = new Box3<>();
		}

}
