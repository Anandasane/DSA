import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class matrixMultiplication {

    // The multiply method must be outside main
    public static ArrayList<ArrayList<Integer>> multiply(int[] [] a, int[] [] b) {
        int n = a.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += (a[i] [k] * b[k] [j]);
                }
                ans.get(i).add(sum);
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Fixed typo: Systme -> System

        System.out.println("Enter the size of the matrix (n x n): ");
        int n = sc.nextInt(); // Read size once for square matrices

        // Initialize 2D arrays (matrices)
        int[] [] arr1 = new int[n] [n];
        int[] [] arr2 = new int[n] [n];

        // Input for first matrix
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i] [j] = sc.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i] [j] = sc.nextInt();
            }
        }

        // Call the multiply method
        ArrayList<ArrayList<Integer>> result = multiply(arr1, arr2);

        // Display the result
        System.out.println("Result of Matrix Multiplication:");
        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
        
        sc.close();
    }
}