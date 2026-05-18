import java.util.Scanner;
import java.util.ArrayList;
/* Sprially Traversing a 2D array 

class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        int m = arr.length , n = arr[0].length;
        int firstRow = 0 , lastRow = m-1, firstcol = 0 , lastcol = n-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(firstRow<= lastRow && firstcol<= lastcol){
            for(int j =firstcol;j<=lastcol;j++) //right 
                ans.add(arr[firstRow][j]);
                firstRow++;
                
            if(firstRow>lastRow || firstcol>lastcol)break;
            
            for(int i = firstRow;i<=lastRow;i++)//down
                ans.add(arr[i][lastcol]);
                lastcol--;
                
            if(firstRow>lastRow || firstcol>lastcol)break;
            
            for(int j =lastcol;j>=firstcol;j--) //left
                ans.add(arr[lastRow][j]);
                lastRow--;
                
            if(firstRow>lastRow || firstcol>lastcol)break;
            
             for(int i = lastRow;i>=firstRow;i--)//up
                ans.add(arr[i][firstcol]);
                firstcol++;
            
            
            
        }
        return ans;
    }
}

*/


public class spriallyTraversing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] Mat = new int[M][N];    

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                Mat[i][j] = sc.nextInt();
            }
        }

        spiralOrder(Mat, M, N);
        sc.close();
    }

    // Function to print the elements of the matrix in spiral order with explanation comments
    static void spiralOrder(int[][] Mat, int M, int N){//time complexity: O(M*N) and space complexity: O(M*N) for the spiral list
        int top = 0, bottom = M-1, left = 0, right = N-1;
        ArrayList<Integer> spiral = new ArrayList<>(); // Create an ArrayList to store the spiral order elements

        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int j = left; j <= right; j++) {
                spiral.add(Mat[top][j]); // Add the current element to the spiral list
            }
            top++; // Move down to the next row

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                spiral.add(Mat[i][right]); // Add the current element to the spiral list
            }
            right--; // Move left to the next column

            // Check if there are still rows and columns to traverse
            if (top <= bottom) {
                // Traverse from right to left along the bottom row
                for (int j = right; j >= left; j--) {
                    spiral.add(Mat[bottom][j]); // Add the current element to the spiral list
                }
                bottom--; // Move up to the next row
            }

            if (left <= right) {
                // Traverse from bottom to top along the left column
                for (int i = bottom; i >= top; i--) {
                    spiral.add(Mat[i][left]); // Add the current element to the spiral list
                }
                left++; // Move right to the next column
            }
        }
        System.out.println("The spiral order of the 2D array is: " + spiral);
        }
    
}