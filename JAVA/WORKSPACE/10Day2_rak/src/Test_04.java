
public class Test_04 {
		String name;
		int korean;
		int english;
		int math;
		int science;
		public Test_04() {}
		public Test_04(String name, int korean, int english, int math, int science) {
				super();
				this.name = name;
				this.korean = korean;
				this.english = english;
				this.math = math;
				this.science = science;
		}
		public double getAvg() {
				double result = (double)(korean+english+math+science)/4;
				return result;
		}
		public String getGrade() {
				String grade = null;
				if(getAvg()>=90) {
						grade = "A학점";
				} else if(getAvg()>=70) {
						grade = "B학점";
				} else if(getAvg()>=50) {
						grade = "C학점";
				} else if(getAvg()>=30) {
						grade = "D학점";
				} else
						grade = "F학점";
				return grade;
		}
		
		
		
}
