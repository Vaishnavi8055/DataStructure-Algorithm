package Array;
/*
 * Created by Vaishnavi Chaurasia
 * 19-Jan-22
 * 8:20 PM
 * DataStructures---Algorithm
 */

// Find max and min from array
public class P_1 {
    public static void main(String[] args) {
        int arr[] = {34, 56, 111, 12, 34, 98, 000};

        findMaxMin(arr);
    }

    public static void findMaxMin(int arr[]) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            // maximum
           /* if (arr[i] > max){
                max = arr[i];
            }*/

            /**** BUILT-IN ****/
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
            /**** BUILT-IN ****/

            // minimum
           /* if (arr[i] < min){
                min = arr[i];
            }*/
        }

        System.out.println("Maximum is " + max + " and Minimum is " + min);
    }
}
