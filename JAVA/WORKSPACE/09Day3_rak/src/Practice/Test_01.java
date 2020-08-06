package Practice;

public class Test_01 {
		public static void main(String[] args) {
				Test_01 test = new Test_01();
				Student [] stus = new Student[] {
							new Student("kim",100,90,95,89),
							new Student("Lee",60,70,99,98),
							new Student("Park",68,86,60,40),
				};
				for(Student stu:stus) {
						System.out.print(stu.name+" 평균: "+stu.getAvg());
						System.out.println(" 학점:"+stu.getGrade());
				}
		}
}
