/*
reversing the array by keeping particular elements as it is 
 */

import java.util.Scanner;

public class reverse_array2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sieze of Arrays: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter the elements of the Array: ");
        for(int k = 0 ; k<n; k++){
            arr[k] = sc.nextInt();
        }
        
        System.out.print("Enter the index range form where you want to reverse: ");
        int i = sc.nextInt();
        int j = sc.nextInt();
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        for(int k = 0; k<n ; k++){
            System.out.print(arr[k]+" ");
        }

        sc.close();
    }
    
}
