package SearchingAlgo;/*
 * Created by Vaishnavi Chaurasia
 * 19-Jan-22
 * 9:22 PM
 * DataStructures---Algorithm
 */

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the key");
        int key = sc.nextInt();

        int arr[] = new int[6];

        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = linearSearch(key, arr);

        if (found) {
            System.out.println(key + " Found");
        } else {
            System.out.println(key + " Not Found");
        }

    }

    public static boolean linearSearch(int key, int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

}
