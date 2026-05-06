import java.util.Scanner;
import java.util.Arrays;

// Selection Sort implementation
//
// Idea: For each position i, find the minimum element in the unsorted portion (i..n-1)
// and swap it into position i.
//
// Complexity:
// - Time: O(n^2) (best/avg/worst)
// - Space: O(1) (in-place)
//
// Example:
// Input:  [64, 25, 12, 22, 11]
// i=0 -> min=11 at index 4 -> swap => [11, 25, 12, 22, 64]
// i=1 -> min=12 at index 2 -> swap => [11, 12, 25, 22, 64]
// ...
// Output: [11, 12, 22, 25, 64]
public class selectionSort {
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

        // Selection sort core logic
        // Outer loop: builds the sorted prefix from left to right.
        for (int i = 0; i < n - 1; i++) {
            // Assume current position holds the minimum.
            int minIndex = i;

            // Find the actual minimum element in the remaining unsorted part.
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the element at position i.
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print final sorted array
        System.out.println("Sorted Array is: " + Arrays.toString(arr));
    }
}

