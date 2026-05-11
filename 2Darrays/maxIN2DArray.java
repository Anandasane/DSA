import java.util.Scanner;   
/* finding the maximum element in a 2D array */


public class maxIN2DArray {
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
        // finding the maximum element in the array
        int max = arr[0][0];
        for(int i = 0; i<m;i++){
            for(int j = 0; j<n;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The maximum element in the array is "+max);
        sc.close();
    }
}
