import java.util.*;
public class TestStudent {

		
		public static void main(String[] args) {
				Student stu1 = new Student();
				stu1.setName("홍길동");
				stu1.setAge(20);
				stu1.setAddress("서울시");
				
				String name1 = stu1.getName();
				int age1 = stu1.getAge();
				String address1 = stu1.getAddress();
				
				System.out.println(stu1.stuInfo());
//				System.out.println(stu2.stuInfo());
//				System.out.println(stu3.stuInfo());
				// TODO Auto-generated method stub
//				Scanner scan = new Scanner(System.in);
//				System.out.println("이름/나이/사는 곳 순으로 입력: ");
//				Student stu1 = new Student();
//				stu1.setName(scan.next());
//				stu1.setAge(scan.nextInt());
//				stu1.setAddress(scan.next());
//
//				String name1 = stu1.getName();
//				int age1 = stu1.getAge();
//				String address1 = stu1.getAddress();
//				
//				Student stu2 = new Student();
//				stu2.setName(scan.next());
//				stu2.setAge(scan.nextInt());
//				stu2.setAddress(scan.next());
//				String name2 = stu2.getName();
//				int age2 = stu2.getAge();
//				String address2 = stu2.getAddress();
//				
//				Student stu3 = new Student();
//				stu3.setName(scan.next());
//				stu3.setAge(scan.nextInt());
//				stu3.setAddress(scan.next());
//				String name3 = stu3.getName();
//				int age3 = stu3.getAge();
//				String address3 = stu3.getAddress();
				
		}
}
