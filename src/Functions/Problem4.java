package Functions;
// count set bits (1)

import java.util.Scanner;

class Problem_4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.print(numberOfSetBits(n, m));
        }
    }

    public static int numberOfSetBits(int n, int m) {

        // 5 => 101 & 1 => 1 (last bit)
        // 4 => 100 & 1 => 0 (last bit)

        // last bit

        int nlastBit = n & 1;
        int mlastBit = n & 1;
        int count = 0;

        if (nlastBit == 1 || mlastBit == 1) {
            count++;
        }

        return count;
    }
}
