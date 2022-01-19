package MiscellanousPractice;

class Prob4 {
    public static void main(String[] args) {

        int a = 1;
        int b = a++; // b=1 , a=2
        int c = ++a; // c=3 , a=3

        System.out.println(a); // 3
        System.out.println(b); // 1
        System.out.println(c); // 3
    }
}
