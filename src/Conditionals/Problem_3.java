package Conditionals;/*
 * Created by Vaishnavi Chaurasia
 * 19-Jan-22
 * 4:00 PM
 * DataStructures---Algorithm
 */

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Character");
        char input = scanner.next().charAt(0);

        if(input >= 'A' && input<='Z'){
            System.out.println("Its a uppercase");
        }
        else if(input >= 'a' && input<='z'){
            System.out.println("Its a lowercase");
        }
        else{
            System.out.println("Its a Numeric");
        }
    }
}
