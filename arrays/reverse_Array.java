/*
reversing a Array in place 
 */

import java.util.Scanner;

public class reverse_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];


        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }   

        reverse(arr, 0, n-1);

        System.out.println("The reversed array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
     
    public static void reverse(int [] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
