import java.util.Scanner;
/* 
serach in 2d matrix array using binary search
Given an m x n matrix, where each of the rows is sorted in non-decreasing order, 
and the first integer of each row is greater than the last integer of the previous row.
Given a target value, return true along with the index if target is in the matrix or false otherwise.   
*/

    // best approach to use binary search by treating the 2D matrix as a 1D array.
    // public boolean searchMatrix(int[][] arr, int x) {
    //     int rows = arr.length, cols = arr[0].length;
    //     int lo = 0, hi = rows*cols -1;
    //     while(lo<=hi){
    //         int mid = (lo+hi)/2;
    //         int midRows= mid/cols , midCols = mid%cols;
    //         if(arr[midRows][midCols]==x)return true;
    //         else if (arr[midRows][midCols]>x) hi = mid-1;
    //         else lo = mid+1;
    //     }
    //     return false;
    // }


public class searchIn2dMatrixArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();
        
        int[][] matrix = new int[m][n];
        
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        
        boolean found = searchMatrix(matrix, target);
        System.out.println("Target " + target + (found ? " found in the matrix." : " not found in the matrix.") );
        
        sc.close();
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int left = 0, right = m * n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / n][mid % n];
            
            if (midValue == target) {
                System.out.println("Target found at index: (" + (mid / n) + ", " + (mid % n) + ")");
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
    

}
