/**
 * continue
 */
class continueKeyword {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
          System.out.println("Hello");
          System.out.println("This will execute");
                continue;
                // unreachable error
           //System.out.print("This will not execute");
        }
    }
    
}