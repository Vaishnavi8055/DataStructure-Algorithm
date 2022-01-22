package Array;/*
 * Created by Vaishnavi Chaurasia
 * 19-Jan-22
 * 9:11 PM
 * DataStructures---Algorithm
 */

public class P_3 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, -2};

        System.out.println(arraySum(arr, 0));
    }

    public static int arraySum(int arr[], int sum) {

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
