import java.util.Scanner;
import java.util.Arrays;

// Bubble Sort implementation
//
// Idea: Repeatedly compare adjacent elements and swap them if they are in the wrong order.
// After one full pass, the largest element bubbles to the end.
//
// Complexity:
// - Time: O(n^2) (best/avg/worst)
// - Space: O(1) (in-place)
//
// Example:
// Input:  [5, 1, 4, 2, 8]
// Passes:
// - After pass 1: [1, 4, 2, 5, 8]
// - After pass 2: [1, 2, 4, 5, 8]
// Output: [1, 2, 4, 5, 8]
public class bubbleSort {
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

        // Bubble sort core logic
        // Outer loop: number of passes. After each pass, one more largest element is placed at the end.
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: compare adjacent elements up to the last unsorted position.
            for (int j = 0; j < n - i - 1; j++) {
                // If the left element is bigger, swap them so the bigger element moves right.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print final sorted array
        System.out.println("Sorted Array is: " + Arrays.toString(arr));
    }
}

