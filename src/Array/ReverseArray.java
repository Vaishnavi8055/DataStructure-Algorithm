package Array;/*
 * Created by Vaishnavi Chaurasia
 * 19-Jan-22
 * 9:38 PM
 * DataStructures---Algorithm
 */

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];

        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);
        display(arr);
    }

    public static void reverseArray(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            swap(start, end, arr);
            start++;
            end--;

        }

    }

    public static void swap(int start, int end, int arr[]) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }

    public static void display(int arr[]) {

        System.out.println("Reversed Array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
