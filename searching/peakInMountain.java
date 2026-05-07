package searching;
import java util.Scanner;
import java util.Arrays;
/*
finding the peak element in a mountain array using binary search
*/

public class peakInMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Implementing binary search to find the peak element
        int low = 1, high = n - 2; // Start from 1 and end at n-2 to avoid out of bounds
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1; // Peak is in the right half
            } else {
                high = mid; // Peak is in the left half or at mid
            }
        }
        System.out.println("Peak element is: " + arr[low]);
        sc.close();
        // alternative way to find the peak element using binary search
        // int low = 1, high = n - 2; // Start from 1 and end at n-2 to avoid out of bounds
        // while (low<=high) {
        //     int mid = low + (high - low) / 2;
        //     if(arr[mid]>arr[mid+1])hi= mid;// Peak is in the left half or at mid going left
        //     else low = mid+1;// Peak is in the right half going right
            
        // }
        // return low;
        // System.out.println("Peak element is: " + arr[low]);
        // sc.close();

    }

    
}
