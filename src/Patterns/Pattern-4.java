package Patterns;

import java.util.Scanner;

/*
3 2 1
3 2 1
3 2 1
*/

class pt4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
