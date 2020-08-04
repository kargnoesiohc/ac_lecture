package Work04_01_Student;

public class Student {
		
				private String name;
				private int korean;
				private int english;
				private int math;
				private int science;
				
				
				public Student() {}
				public Student(String name, int korean, int english, int math, int science) {
						this.setName(name);
						this.korean = korean;
						this.english = english;
						this.math = math;
						this.science = science;
				}
				public double getAvg() {
						double avg = (double)(korean+english+math+science)/4;
						return avg;
				}
				
				public String getGrade() {
						String grade = "F 학점";
						int avg = (int) getAvg();
						if(avg >= 90) {
								grade = "A학점";
						} else if (avg >= 70){
								grade = "B학점";
						} else if (avg >= 50) {
								grade = "C학점";
						} else if (avg >= 30){
								grade = "D학점";
						}
						return grade;
				}
				public String getName() {
						return name;
				}
				public void setName(String name) {
						this.name = name;
				}
				
		
		
}
