package Work04_01_Student;

public class TestStudent {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Student stu1 = new Student("kim",100,90,95,89);
				Student stu2 = new Student("Lee",60,70,99,98);
				Student stu3 = new Student("kim",68,86,60,40);
				
				Student stu[] = {
								stu1,
								stu2,
								stu3,
				};
				
				for(Student i: stu) {
						System.out.println(i.getName()+" 평균: "+i.getAvg()+" 학점: "+i.getGrade());
				}
		}

}
