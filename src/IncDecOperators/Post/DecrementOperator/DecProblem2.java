package IncDecOperators.Post.DecrementOperator;// i--

class DecProblem2 {

    public static void main(String[] args) {
        int i = 3, a = 2;
        int sum = a + (i--); // --> sum = 2 + 3 = 5 && i=2
        System.out.println(i); // 2
        System.out.println(a); // 5
        System.out.println(sum);
    }
}
