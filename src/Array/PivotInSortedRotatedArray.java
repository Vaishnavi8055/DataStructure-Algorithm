package Array;/*
 * Created by Vaishnavi Chaurasia
 * 23-Jan-22
 * 5:20 PM
 * DataStructures---Algorithm
 */

// Find pivot (minimum) in an array which is sorted and rotated
// O(logn) time
// Binary Search

public class PivotInSortedRotatedArray {

    public static void main(String[] args) {

        int arr[] = {3, 8, 10, 17, 1};
        int arr2[] = {7, 9, 1, 2, 3};

        int index1 = pivotElementIndex(arr, 5);

        int index2 = pivotElementIndex(arr2, 5);

        System.out.println(index1); // 4
        System.out.println(index2); // 2

    }

    public static int pivotElementIndex(int arr[], int n) {

        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // found in Line 1
            if (arr[mid] >= arr[0]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

}
