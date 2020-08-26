package jdbc_Method_divide_test;

import java.util.ArrayList;

public class TestMain {
		

		public static void main(String[] args) {
				Test test = new Test();
				
				System.out.println(test.searchDeptByDeptno(13));
				DeptDTO dept = new DeptDTO(55,"경비","인천");
				System.out.println(test.insertDept(dept) + "행 삽입");
				
				ArrayList<DeptDTO> list = test.getAllDept();
				for(DeptDTO x: list) {
						System.out.println(x);
				}
		}
}
