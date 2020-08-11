import java.util.Date;

class Box{
		Object obj;

		public Object getObj() {
				return obj;
		}

		public void setObj(Object obj) {
				this.obj = obj;
		}
		
		
}

public class Primitive_Type_Test {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Box b1 = new Box();
				b1.setObj("hello");
				String str = (String)b1.getObj();
				System.out.println(str);
				
				
				Box b2 = new Box();
				b2.setObj(new Date());
				System.out.println((Date)b2.getObj());
		}

}


