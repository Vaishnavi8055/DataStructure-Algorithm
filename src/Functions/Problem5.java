package Functions;/*
 * Created by Vaishnavi Chaurasia
 * 19-Jan-22
 * 4:18 PM
 * DataStructures---Algorithm
 */

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
//        Scanner src = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = src.nextInt();
//        System.out.println("Enter m");
//        int m = src.nextInt();

        // 4 => 100 , count = 1 || 5 => 101 , count = 2 || totalSetBit = 1+2=3
        //System.out.print("Ans is"+ numberOfSetBits(4, 5)); // 3

        // 7 => 111 , count = 3 || 5 => 101 , count = 2 || totalSetBit = 3+2=5
        System.out.print("Count of Set bits is "+ numberOfSetBits(7, 5));

    }

    public static int numberOfSetBits(int n , int m) {

        int countOfSetBits = 0;
        int nLastBit =  0;
        while (n!=0) {
            nLastBit = n&1;

            if (nLastBit ==1) {
                countOfSetBits++;
            }
                n = n >> 1;

            //System.out.println("hello");
        }

        while (m!=0) {
            int mLastBit = m & 1;

            if (mLastBit == 1) {
                countOfSetBits++;
            }
                m = m >> 1;

        }

        return countOfSetBits;

    }
}
