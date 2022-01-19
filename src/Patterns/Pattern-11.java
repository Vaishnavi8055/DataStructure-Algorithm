package Patterns;

import java.util.Scanner;

/*

1
2 1
3 2 1
4 3 2 1

*/
class pt11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println();
        int val = 0;
        for (int i = 1; i <= row; i++) {
            val = i;
            for (int j = 1; j <= i; j++) {
                /* logic-1 */
                // System.out.print(val + " ");
                //  val--;

                /* logic-2 */
                System.out.print(i - j + 1 + " ");
            }
            System.out.println();
        }

    }
}
