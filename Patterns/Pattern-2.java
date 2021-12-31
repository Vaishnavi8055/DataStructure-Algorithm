import java.util.Scanner;
/*
1 1 1
2 2 2
3 3 3

*/

class pt2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i=1 ; i<=row ; i++){
           for(int j=1 ; j<=row ; j++){
               System.out.print(i+" ");
           }
           System.out.println();
        }   
    }
}
