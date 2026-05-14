import java.util.Scanner;

/* 
 findin the minimum of element from the maximum element in each row of a 2D array
*/

public class minINMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements in the array");
        for(int i = 0; i<m;i++){
            for(int j = 0; j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int min = Integer.MAX_VALUE;
        int rowindex = -1;
        for(int i = 0; i<m;i++){
            int max = Integer.MIN_VALUE;

            for(int j = 0; j<n;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];

                }
            }
            if(max<min){
                min = max;
                rowindex = i;
            }
        }
        System.out.println("The minimum of the maximum elements in each row is "+min+" and it is in row "+rowindex);    
        sc.close();
    }    
}
