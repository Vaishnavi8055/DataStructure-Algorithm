/**
 * Prob6
 */
public class Prob6 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j <=5 ; j++) {
                System.out.println(i + " " + j); // 0 0 , 0 1 , 0 2 , 0 3 , 0 4 , 0 5
            }                                    // 1 1 , 1 2 , 1 3 , 1 4 , 1 5 
                                                 // 2 2 , 2 3 , 2 4 , 2 5 
                                                 // 3 3 , 3 4 , 3 5 
        }                                        // 4 4 , 4 5 
    }                                            
}