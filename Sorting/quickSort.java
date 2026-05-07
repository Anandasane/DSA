import java.util.Scanner;
import java.util.Arrays;
// Quick Sort implementation
// Idea: Select a "pivot" element and partition the array into two halves:
//         elements less than the pivot go to the left, and elements greater than the pivot go to the right.
// Then recursively apply the same logic to the left and right halves.
// Complexity:
// - Time: O(n log n) (best-case), O(n^2) (worst-case)
// - Space: O(log n) (worst-case)
// O(1) (in-place, ignoring recursion stack)
// Example:
// Input:  [10, 7, 8, 9, 1, 5]
// Pivot: 5 -> Partitioned: [1, 5, 8, 9, 10, 7]
// Recursively sort left [1] and right [8, 9, 10, 7]
// Output: [1, 5, 7, 8, 9, 10]
public class quickSort {
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

        // Sort using quick sort (in-place)
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted Array is: " + Arrays.toString(arr));
        sc.close();
    }

    // Recursively sorts arr[left..right] using quick sort.
    //
    // @param arr   input array
    // @param left  starting index (inclusive)
    // @param right ending index (inclusive)
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            // Partition the array and get the pivot index.
            int pivotIndex = partition(arr, left, right);

            // Recursively sort elements before and after partition.
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    // Partitions arr[left..right] around a pivot and returns the final pivot index.
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right]; // Choosing the last element as pivot
        int i = left - 1; // Pointer for the smaller element

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++; // Increment index of smaller element
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right); // Place pivot in its correct position
        return i + 1; // Return the index of the pivot
    }

    // Utility method to swap two elements in the array.
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
