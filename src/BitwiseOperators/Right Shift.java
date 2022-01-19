package BitwiseOperators;

class rightShift {
    public static void main(String[] args) {

        int res1 = 17 >> 1;  // -----> 17/2 ==> 8
        int res2 = 17 >> 2;  // -----> 17/2 ==> 8 --> 8/2 ==> 4 (2 times/2 shifts)
        int res3 = 19 >> 1;  // -----> 19/2 ==> 9
        int res4 = 21 >> 2;  // -----> 21/2 ==> 10 --> 10/2 ==> 5 (2 times/2 shifts)
        int res5 = 41 >> 1;  // -----> 41/2 ==> 20

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);

    }
}
