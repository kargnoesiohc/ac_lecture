package Work04_07_Student;
class NotFoundException extends Exception{
		public NotFoundException(String mesg) {
				super(mesg);
		}
}

public class StudentService {
		public Student2 getAStuentInfo(Student2[] stus, String name) 
						throws NotFoundException{
				Student2 student = null;
				for(Student2 stu:stus) {
						if(name.equals(stu.getName())) {
								student = stu;
						} 
				}
						if(student == null){
								throw new NotFoundException("찾는 이름이 없습니다.");
						}
				return student;
		}
		
		
		public double getAgeAvg(Student2[] stus) {
				double avg = 0.0;
				int total = 0;
				for(Student2 stu: stus) {
						total += stu.getAge();
				}
				return total/stus.length;
		}
		public double getHeightAvg(Student2[] stus) {
				double avg = 0.0;
				int total = 0;
				for(Student2 stu: stus) {
						total += stu.getHeight();
				}
				return total/stus.length;
		}
		public double getWeightAvg(Student2[] stus) {
				double avg = 0.0;
				int total = 0;
				for(Student2 stu: stus) {
						total += stu.getWeight();
				}
				return total/stus.length;
		}
		
		public void printAll(Student2[] stus) {
				for(Student2 stu:stus) {
						System.out.println(stu);
				}
				
		}
		
}
