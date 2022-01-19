package Functions;/*
 * Created by Vaishnavi Chaurasia
 * 19-Jan-22
 * 4:21 PM
 * DataStructures---Algorithm
 */

public class Problem_1 {

        public static void main(String[] args) {

            // false -> Odd
            // True -> Even

            System.out.println(isEvenOrOdd(2));
        }

        public static boolean isEvenOrOdd(int n) {

            // & is a bitwise operator
            // 5 => 101 => 101 & 1 => 1 => odd
            // 4 => 100 => 100 & 1 => 0 => even

            // odd
            int ans = n & 1;

            if (ans == 1) {
                return false;
            }

            // even
            return true;
        }

}
