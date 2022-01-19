package Patterns;

import java.util.Scanner;

/*

A A A
B B B
C C C 

*/
class pt12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println();

        char ch = 'A';

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                /* logic-1 */
                System.out.print(ch + " ");

            }
            ch++;
            System.out.println();
        }
    }
}
