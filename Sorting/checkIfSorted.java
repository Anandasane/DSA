package Sorting;
/*
you are given an array you have to check if it is Sorted
*/

import java.util.Scanner;

public class checkIfSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sieze of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the elements of the Array: ");

        for(int i =0 ; i<n ;i++){
            arr [i] = sc.nextInt();

        }

        for (int i = 0; i<n ; i++){
            if (arr[i] > arr[i+1]){
                System.out.println("Array is not Sorted");
                return;
            }
            else{
                System.out.println("Array is Sorted");
                return;
            }
        }
    }
    
}
