import java.util.Scanner;
import java.util.Arrays;

// Merge Sort implementation
//
// Idea: Divide the array into halves, sort each half recursively, then merge the two
// sorted halves into a single sorted array.
//
// Complexity:
// - Time: O(n log n) (guaranteed)
// - Space: O(n) (merge step needs extra space)
//
// Example:
// Input:  [38, 27, 43, 3, 9, 82, 10]
// Split:  [38, 27, 43] and [3, 9, 82, 10]
// Sort halves recursively and then merge.
// Output: [3, 9, 10, 27, 38, 43, 82]
public class mergeSort {
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

        // Sort using merge sort (in-place effect via merge into the original array)
        mergeSort(arr, 0, n - 1);
        System.out.println("Sorted Array is: " + Arrays.toString(arr));
        sc.close();
    }

    // Recursively sorts arr[left..right] using divide-and-conquer.
    //
    // @param arr   input array
    // @param left  starting index (inclusive)
    // @param right ending index (inclusive)
    public static void mergeSort(int[] arr, int left, int right) {
        // Base case: a segment with 0 or 1 element is already sorted.
        if (left < right) {
            // Midpoint to split the array into two halves.
            int mid = left + (right - left) / 2;

            // Recursively sort left half and right half.
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge two sorted halves.
            // (The merge() method is expected to combine arr[left..mid] and arr[mid+1..right].)
            merge(arr, left, mid, right);
        }
    }

}

