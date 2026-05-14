import java.util.Scanner;
/*
 finding the  maximum sum of row in a 2D array 
*/


public class rowWithMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] arr = new int[m][n];

        //taking input in the array
        for(int i = 0; i<m;i++){
            for(int j = 0; j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // finding the row with maximum sum
        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;
        for(int i = 0; i<m;i++){
            int sum = 0;
            for(int j = 0; j<n;j++){
                sum += arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                maxRow = i;
            }
        }
        System.out.println("The row with maximum sum is row " + maxRow + " with sum " + maxSum);
        sc.close();
    }
}
