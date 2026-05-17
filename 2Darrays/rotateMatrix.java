/*
Given two integers M, N, and a 2D matrix Mat of dimensions MxN, clockwise rotate the elements in it.

Example 1:

Input:
M=3,N=3
Mat=[[1,2,3],[4,5,6],[7,8,9]]
Output:
4 1 2
7 5 3
8 9 6
Explanation:
Rotating the matrix clockwise gives this result.
*/

import java.util.Scanner;

public class rotateMatrix {
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

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                System.out.print(Mat[M-1-j][i] + " ");
            }
            System.out.println();
        }
        
    }
    

}
