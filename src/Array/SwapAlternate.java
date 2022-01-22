package Array;/*
 * Created by Vaishnavi Chaurasia
 * 20-Jan-22
 * 2:33 PM
 * DataStructures---Algorithm
 */

import java.util.Arrays;

public class SwapAlternate {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(swapAlternate(new int[]{100, 2, 3, 4, 5, 9})) + " ");
    }

    public static int[] swapAlternate(int arr[]) {

        int start = 0;
        int end = start + 1;

        while (start < end && end < arr.length) {

            swap(start, end, arr);
            start += 2;
            end = start + 1;
        }

        return arr;
    }

    public static void swap(int start, int end, int arr[]) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }

}
