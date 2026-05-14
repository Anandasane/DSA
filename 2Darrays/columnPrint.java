import java.util.Scanner;

/*
Printing elements column wise in a 2D array
*/

public class columnPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        // input elements in the 2D array    
        System.out.println("Enter the elements of the 2D array:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // output the 2D array
        System.out.println("The 2D array is:");
        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
