package SwitchCase;

public class Problem7 {
    public static void main(String[] args) {

        // Nested Switch
        int n = 2;
        char m = 'a';

        switch (n) {
            case 1:
                System.out.println("First Case");
                break;

            case 3:
                System.out.println("Second Case");
                break;

            case 2:
                System.out.println("Third Case");
                switch (m) {
                    case 'v':
                        System.out.println("Switch 2 First Case");
                        break;

                    case 'a':
                        System.out.println("Switch 2 Second Case");
                        break;

                    default:
                        System.out.println("Switch 2 Default Case");
                        break;
                }
                break;

            default:
                System.out.println("Default Case");
                break;
        }
    }
}
