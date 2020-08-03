import java.util.*;
import java.time.*;
public class Main_If_Clock{

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        
        LocalTime startTime = LocalTime.of(h, m).minusMinutes(45);
        System.out.print(startTime.getHour());
        System.out.println(" "+startTime.getMinute());
     }
}