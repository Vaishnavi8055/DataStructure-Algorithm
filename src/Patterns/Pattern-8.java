package Patterns;

import java.util.Scanner;

/*

1
2 2
3 3 3 
4 4 4 4

*/

class pt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
