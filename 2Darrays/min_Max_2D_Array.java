import java.util.Scanner;
/*
finding the min and max element in 2D array
*/


public class min_Max_2D_Array {
    static void main(){
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
        // finding the minimum and maximum element in the array
        int min = arr[0][0];
        int max = arr[0][0];
        for(int i = 0; i<m;i++){
            for(int j = 0; j<n;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The minimum element in the array is "+min);
        System.out.println("The maximum element in the array is "+max);
        sc.close();

    }
    
}
