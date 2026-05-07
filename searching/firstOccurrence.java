package searching;
import java.util.Scanner;
import java.util.Arrays;
/* 
finding the First Occurrence of an element in a sorted array using Binary Search
if there are multiple Occurrences of the element then return the one with  the samallest index
*/
public class firstOccurrence {
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
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) { // Found an occurrence, but we want the first one.
                firstOcc = mid;
                high = mid - 1;
            } else if (arr[mid] < key) {// Search in the right half
                low = mid + 1;
            } else {// Search in the left half
                high = mid - 1;
            }
        }

        if (firstOcc == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("First Occurrence of " + key + " is at index " + firstOcc);
        }
        sc.close();
       
    }
    
}
