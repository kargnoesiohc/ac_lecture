package Workshop_07_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int size = scan.nextInt();
				MakeList make = new MakeList();
				make.makeArrayList(size);
				double avg = make.getAverage();
				System.out.println("평균 값: "+ avg);
				List<Integer> list = null;
				list = make.getList();
				System.out.println("list: "+ list);

		}

}
