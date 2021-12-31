class output2 {

    public static void main(String[] args) {

        int a = 2;
        // b = 2+1 = 3
        int b = a + 1;

        // a = 3
        if ((a = 3) == b) {                       /*  OUTPUT - 3  */
            // a == b --> true
            System.out.println(a);
        } else {
            System.out.println(a + 1);
        }
    }
}
