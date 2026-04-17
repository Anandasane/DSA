/*
merge two sorted array into a single big array
*/

import java.util.Scanner;

public class Merge2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st array: ");
        int n = sc.nextInt();
        int [] arr1 = new int[n];
        System.out.print("Enter the elements of the 1st array: ");

        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of 2nd array: ");
        int m = sc.nextInt();
        int [] arr2 = new int[m];
        System.out.print("Enter the elements of the 2nd array: ");

        for(int i = 0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        // Merge the two sorted arrays
        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < n) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < m) {
            merged[k++] = arr2[j++];
        }

        // Print the merged array
        System.out.print("Merged array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
