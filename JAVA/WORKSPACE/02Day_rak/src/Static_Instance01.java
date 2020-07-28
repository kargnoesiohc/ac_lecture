public class Static_Instance01 {

    //int count;
    static int count;

    public Static_Instance01() {
        this.count ++;
        System.out.println("좋아요 갯수 : " + this.count);
        
    }

    

    public static void main(String[] args) {
        Static_Instance01 hc1 = new Static_Instance01(); 
        Static_Instance01 hc2 = new Static_Instance01(); 
        
    	  System.out.println("총 count " + Static_Instance01.count);

    }
}

