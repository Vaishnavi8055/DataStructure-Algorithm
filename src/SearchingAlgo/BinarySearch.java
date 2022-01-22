package SearchingAlgo;/*
 * Created by Vaishnavi Chaurasia
 * 22-Jan-22
 * 1:14 AM
 * DataStructures---Algorithm
 */

// Array should be sorted
public class BinarySearch {

    public static void main(String[] args) {

        int array[] = {3, 22, 34, 72, 111};
        int key = 22;

        System.out.println(binarySearch(array, 5, 72)); // 3
        System.out.println(binarySearch(array, 5, 22)); // 1
        System.out.println(binarySearch(array, 5, 00)); // -1
        System.out.println(binarySearch(array, 5, 11)); // -1


    }

    public static int binarySearch(int[] arr, int n, int key) {

        int left = 0;
        int right = n - 1;

        while (left <= right) {

            // int mid = (left + right) / 2;

            /***
             // Integer max range is  - 2^31-1
             // let start = 2^31-1  , end = 2^31-1
             // mid = s+e ======================>  Here Integer range exceeds
             ****/

            int mid = left + (right - left) / 2;


            if (arr[mid] == key) {
                return mid;
            }

            // right
            if (key > arr[mid]) {
                left = mid + 1;
            }
            // left
            else {
                right = mid - 1;
            }
        }

        return -1;
    }


}
