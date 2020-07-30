import java.util.*;
public class TestStudent {

		
		public static void main(String[] args) {
				// TODO Auto-generated method stub
//				Scanner scan = new Scanner(System.in);
//				System.out.println("이름/나이/사는 곳 순으로 입력: ");
//				Student stud1 = new Student();
//				stud1.setName(scan.next());
//				stud1.setAge(scan.nextInt());
//				stud1.setAddress(scan.next());
//
//				String name1 = stud1.getName();
//				int age1 = stud1.getAge();
//				String address1 = stud1.getAddress();
//				
//				Student stud2 = new Student();
//				stud2.setName(scan.next());
//				stud2.setAge(scan.nextInt());
//				stud2.setAddress(scan.next());
//				String name2 = stud2.getName();
//				int age2 = stud2.getAge();
//				String address2 = stud2.getAddress();
//				
//				Student stud3 = new Student();
//				stud3.setName(scan.next());
//				stud3.setAge(scan.nextInt());
//				stud3.setAddress(scan.next());
//				String name3 = stud3.getName();
//				int age3 = stud3.getAge();
//				String address3 = stud3.getAddress();
				Student stud1 = new Student();
				stud1.setName("홍길동");
				stud1.setAge(20);
				stud1.setAddress("경기도");

				String name1 = stud1.getName();
				int age1 = stud1.getAge();
				String address1 = stud1.getAddress();
				
				System.out.println(stud1.stuInfo());
//				System.out.println(stud2.stuInfo());
//				System.out.println(stud3.stuInfo());
				
		}
}
