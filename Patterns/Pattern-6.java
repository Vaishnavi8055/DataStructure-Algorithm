 
import java.util.Scanner;

/*
1 2 3
4 5 6
7 8 9
*/

 class pt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(); // 3
        
        int count = 1;
        for(int i=1 ; i<=row ; i++){
            for(int j=1 ; j<=row ; j++){
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
    }
}
