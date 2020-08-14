import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassForNameTest {

		public static void main(String[] args) throws Exception {
				// TODO Auto-generated method stub
				Class cl = Class.forName("java.lang.Math");
				Field[] fields = cl.getDeclaredFields();
				for(Field f:fields) {
						System.out.println("field: "+f.getName());
				}
				Method[] methods = cl.getDeclaredMethods();
				for(Method m:methods) {
						System.out.println("Method: "+ m.getName());
				}
		}

}
