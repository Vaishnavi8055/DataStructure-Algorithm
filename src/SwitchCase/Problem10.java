package SwitchCase;

public class Problem10 {
    public static void main(String[] args) {

        int n = 5;

        switch (n) {
            case 1:
                System.out.println("First Case");
                break;
            //continue;  //--> Unreachable Error
            case 2:
                System.out.println("Second Case");
                //continue;  //--> cannot be used outside of loop it needs a loop[while,for]
                break;

            case 3:
                System.out.println("Third Case");
                break;

            default:
                System.out.println("Default Case");
                break;


        }
    }
}
