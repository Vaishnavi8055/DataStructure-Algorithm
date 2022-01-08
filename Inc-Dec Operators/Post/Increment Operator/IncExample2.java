public class IncExample2 {
    public static void main(String[] args) {
        int i = 3, a=2;
        int sum = a+ (i++); //--> sum = 2 + 3 = 5 && i=4
        System.out.println(i);
        System.out.println(a);
    }
}
