package Patterns;

import java.util.Scanner;

/*
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4

*/

class pt3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
