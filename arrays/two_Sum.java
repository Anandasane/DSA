
/*
finding the two numbers in an array that add up to a given target and returning their indices
*/

import java.util.Scanner;

public class two_Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();



        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("The indices of the two numbers are: " + i + " and " + j);
                    return;
                }
            }
        }
        System.out.println("No two numbers add up to the target.");
        sc.colse();
    }
}
