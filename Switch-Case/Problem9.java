public class Problem9 {
    
    //if Switch case is within infinite loop
    // how to come out from that infinite loop
    
    public static void main(String[] args) {
       
        int n=2;
        while (true) {
            // No break statement allowed here
           switch (2) {
               case 2:
                   System.out.print("First Case");
                   break;
           
               default:
                   break;
           }
           // No break statement allowed here
           System.exit(0);
       } 
    }
}
