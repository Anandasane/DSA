package searching;
import java.util.Scanner;
import java.util.ArrayList;
/* 
finding the first and the last Occurrence of an element in a sorted array using Binary Search
if there are multiple Occurrences of the element then return the one with  the samallest and the largest index respectively
*/



public class firstAndLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the Array: ");

        // Read input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();

        // Implementing binary search
        int low = 0;
        int high = n - 1;
        int firstOcc = -1;
        int lastOcc = -1;
        // Find first occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                firstOcc = mid;
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        //
    }
}
