package Work04_07_Student;

public class StudentTest2 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Student2 [] stus = new Student2[] {
								new Student2("홍길동", 15, 170, 80),
								new Student2("한사람",13,180,70),
								new Student2("임걱정",16,175,65),
				};
				StudentService ser = new StudentService();
				Student2 stu = null;
				try {
						stu = ser.getAStuentInfo(stus, "홍길동");
						System.out.println("검색 결과: "+stu);
				} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
				}
				ser.printAll(stus);
				System.out.println(ser.getAgeAvg(stus));
				System.out.println(ser.getHeightAvg(stus));
				System.out.println(ser.getWeightAvg(stus));
				


		}

}
