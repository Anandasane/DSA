package searching;
import java.util.Arrays;
import java.util.Scanner;
/*
implementing binary search in a descending order 
*/

public class binarySearchDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[];
        System.out.print("Enter the elements of the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int k = sc.nextInt();

        // implementing binary search in descending order
        int low = 0, high = n-1;
        while(low<= high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                System.out.println("Element found at index: " + mid);
                return;
            }
            else if(arr[mid] < k){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println("Element not found in the array.");
        sc.close();
        
    }
    
}
