class leftShift {
    public static void main(String[] args) {
        int res1 = 17 << 1; // -----> 17*2 ==> 34
        int res2 = 17 << 2; // -----> 17*2 ==> 34 --> 34*2 ==> 68 (2 times/2 shifts)
        int res3 = 19 << 1; // -----> 19*2 ==> 38
        int res4 = 21 << 2; // -----> 21*2 ==> 42 --> 42*2 ==> 84 (2 times/2 shifts)
        int res5 = 41 << 1; // -----> 41*2 ==> 82

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
    }
}
