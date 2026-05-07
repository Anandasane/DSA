import java.util.Scanner;
import java.util.Arrays;

// Insertion Sort implementation
//
// Idea: Treat the array prefix arr[0..i-1] as sorted.
// Insert arr[i] into its correct position by shifting larger elements to the right.
//
// Complexity:
// - Time: O(n^2) worst-case, but efficient for nearly sorted arrays
// - Space: O(1) (in-place)
//
// Example:
// Input:  [5, 2, 4, 6, 1, 3]
// i=1, key=2 -> shift 5 -> [2, 5, 4, 6, 1, 3]
// i=2, key=4 -> shift 5 -> [2, 4, 5, 6, 1, 3]
// ...
// Output: [1, 2, 3, 4, 5, 6]
public class insertionSort {
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

        // Insertion sort core logic
        // Start from index 1 because index 0 is trivially "sorted".
        for (int i = 1; i < n; i++) {
            // The element we want to insert into the sorted prefix.
            int key = arr[i];
            int j = i - 1;

            // Shift elements of the sorted prefix that are greater than key.
            // After shifting, the correct position for key is j+1.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key in its correct position.
            arr[j + 1] = key;
        }

        // Print final sorted array
        System.out.println("Sorted Array is: " + Arrays.toString(arr));
        sc.close();
    }
}

