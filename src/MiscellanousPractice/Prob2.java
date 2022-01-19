package MiscellanousPractice;

class Prob2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // 1>0 || 3>2 --> true || true
        if (a-- > 0 || ++b > 2) {
            System.out.println("Stage1 - Inside if"); // <-- Answer //
        } else {
            System.out.println("Stage1 - Inside else");
        }
    }
}
