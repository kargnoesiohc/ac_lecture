import java.util.ArrayList;


public class TestMain {

	public static void main(String[] args) {
			
		 TestDAO dao = new TestDAO();	
		
		 //dao.delete(5);		 
		 ArrayList<TestDTO> list = dao.select();
		 for (TestDTO dto : list) {
			System.out.println(dto);
		}//end for
	}//end main

}//end class






