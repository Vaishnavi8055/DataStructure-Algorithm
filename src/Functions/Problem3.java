package Functions;

import java.util.Scanner;

class Problem_3 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            System.out.print(findAP(n));
        }
    }

    public static int findAP(int n) {

        int AP = 3 * n + 7;

        return AP;
    }
}
