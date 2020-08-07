package Work04_07_Student;

public class StudentTest {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Student stu1 = new Student("홍길동", 15, 170, 80);
				Student stu2 = new Student("한사람", 13, 180, 70);
				Student stu3 = new Student("임걱정", 16, 175, 65);
				Student stu [] = {
								stu1,stu2,stu3,
				};
				int maxIdxA = 0;
				int minIdxA = 0;
				int maxIdxH = 0;
				int minIdxH = 0;
				int maxIdxW = 0;
				int minIdxW = 0;
				double totalAge = 0;
				double totalHeight = 0;
				double totalWeight = 0;
				System.out.println("이름    나이   신장   몸무게");
				
				
				for(int i=0;i<stu.length;i++) {
						System.out.println(stu[i].studentInfo());
						totalAge += (double)stu[i].getAge()/stu.length;
						totalHeight += (double)stu[i].getHeight()/stu.length;
						totalWeight += (double)stu[i].getWeight()/stu.length;
						if(stu[maxIdxA].getAge() < stu[i].getAge()) {
								maxIdxA = i;
						}
						if(stu[minIdxA].getAge() > stu[i].getAge()) {
								minIdxA = i;
						}
						if(stu[maxIdxH].getHeight() < stu[i].getHeight()) {
								maxIdxH = i;
						}
						if(stu[minIdxH].getHeight() > stu[i].getHeight()) {
								minIdxH = i;
						}
						if(stu[maxIdxW].getWeight() < stu[i].getWeight()) {
								maxIdxW = i;
						}
						if(stu[minIdxW].getWeight() > stu[i].getWeight()) {
								minIdxW = i;
						}
						
				}
				System.out.println();
				System.out.printf("나이 평균: %.3f \n", totalAge);
				System.out.printf("신장 평균: %.3f \n", totalHeight);
				System.out.printf("몸무게 평균: %.3f \n", totalWeight);
				System.out.println();
				System.out.println("나이가 가장 많은 학생: "+stu[maxIdxA].getName());
				System.out.println("나이가 가장 적은 학생: "+stu[minIdxA].getName());
				System.out.println("신장이 가장 큰 학생: "+stu[maxIdxH].getName());

				System.out.println("신장이 가장 작은 학생: "+stu[minIdxH].getName());
				System.out.println("몸무게가 가장 많이 나가는 학생: "+stu[maxIdxW].getName());
				System.out.println("몸무게가 가장 적게 나가는 학생: "+stu[minIdxW].getName());
				
				
		}

		

}
