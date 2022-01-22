package Array;/*
 * Created by Vaishnavi Chaurasia
 * 19-Jan-22
 * 8:59 PM
 * DataStructures---Algorithm
 */

public class P_2 {
    public static void main(String[] args) {

        // Actual array is also updated when updation is in any function

        int arr[] = {12, 1, 4};
        update(arr);
        System.out.println("Main Function Start");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Main Function End");
    }

    public static void update(int arr[]) {

        System.out.println("update Function Start");
        // updating
        arr[0] = 8;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("update Function End");

    }
}
