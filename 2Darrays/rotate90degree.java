import java.util.Scanner;
/* 
Rotate a 2D array by 90 degrees in the clockwise and anticlock wise direction.

    clockwise direction: first transpose the matrix and then reverse each row
    anticlockwise direction: first transpose the matrix and then reverse each column
    class Solution {
        public void rotateMatrix(int[][] a) {
            // transpose
            for(int i = 1;i<a.length;i++){
                for(int j= 0;j<i;j++){
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
            // reverse each row
            for(int i = 0;i<a.length;i++){
            int stcol = 0, encol = a[0].length -1;
                while(stcol<encol){
                    int temp = a[i][stcol];
                    a[i][stcol]= a[i][encol];
                    a[i][encol]= temp;
                    stcol++;
                    encol--;
                    
                }   
            }
        }
    }
    
    anticlockwise 


*/


public class rotate90degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        rotateMatrix(arr);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    static void rotateMatrixclockwise(int[][] a) {// clockwise direction
        // transpose
        for(int i = 1;i<a.length;i++){
            for(int j= 0;j<i;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        // reverse each row
        for(int i = 0;i<a.length;i++){
        int stcol = 0, encol = a[0].length -1;
            while(stcol<encol){
                int temp = a[i][stcol];
                a[i][stcol]= a[i][encol];
                a[i][encol]= temp;
                stcol++;
                encol--;
                
            }   
        }
    }
    static void rotateMatrixAntiClockwise(int[][] a) {
        // transpose
        for(int i = 1;i<a.length;i++){
            for(int j= 0;j<i;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        // reverse each column
        for(int j = 0; j<a[0].length; j++){
            int strow = 0, enrow = a.length -1;
            while(strow<enrow){
                int temp = a[strow][j];
                a[strow][j]= a[enrow][j];
                a[enrow][j]= temp;
                strow++;
                enrow--;
                
            }   
        }
    }
    
}
