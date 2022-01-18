// Find nCr = n! / r! * (n-r)!

 class Problem_2 {
    public static void main(String[] args) {
        //factorial(8);
        //cal_nCr(8, 5);
        System.out.println(cal_nCr(8, 2));
    }

    public static int cal_nCr(int n, int r) {

        int fact_of_n = factorial(n);
        int fact_of_r = factorial(r);
        int fact_of_nr = factorial(n-r);

        int nCr = fact_of_n / (fact_of_r * (fact_of_nr));

        return nCr;

    }

    public static int factorial(int n){

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
