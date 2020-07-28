import java.util.Scanner; //Scanner 클래스 import

public class Scanner_Test { //입력받아 오는 클래스 Scanner 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  //System.in - 입력된 것을 받아옴
		System.out.println("(한 줄 전체) 이름을 입력하세요 : ");
		String name = scan.nextLine(); //한 줄 전체
		System.out.println(name);
		System.out.println("(공백 전 까지) 이름을 입력하세요 : ");
		String name1 = scan.next(); //입력 값을 String 타입으로 전달(공백 전까지)
		System.out.println(name1);
		
		scan.close();
	}
}
