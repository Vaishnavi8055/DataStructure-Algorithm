package Loops;

// 0 1 1 2 3 5 .....
class FibonacciSeries {
    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int next = 0;


        int n = 7; // --> print 5 terms (0-5) ............

        System.out.print(first + " ");
        System.out.print(second + " ");
        for (int index = 1; index <= n; index++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
