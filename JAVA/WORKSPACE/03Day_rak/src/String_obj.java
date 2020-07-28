
public class String_obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.String 객체 비교
//		String str1 = new String("hello");
//		String str2 = new String("hello");
//		System.out.println(str1==str2); //false
		//String객체는 각각의 인스턴스가 생성되기 때문에 각각 다른 레퍼런스를 가진다. 주소를 비교
		// new 연산자를 통해 String객체를 생성하는 경우 메모리의 heap 영역에 각각 할당.	
//		boolean result = str1.equals(str2); //true, .equals(); 내용을 비교
//		System.out.println(result); 
		
		//2. String 리터럴 비교 
//		String str1 = "hello";
//		String str2 = "hello";
//		System.out.println(str1==str2); //true
		// String 리터럴은 String constant pool(상수풀)영역에 값이 저장되고 같은 레퍼런스를 가진다.
		// 새로운 객체를 계속 만들어내 비효율적인 메모리 관리때문에 Heap안에 String Constant Pool이 만들어짐.
	} 

}
