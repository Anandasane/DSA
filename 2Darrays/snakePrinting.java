import java.util.Scanner;
/*
Printing elements of 2D array in snake pattern
*/

public class snakePrinting {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns in the array: ");
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int[][] arr = new int[rows][cols];
    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.println("The 2D array is: ");
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    sc.close();
    System.out.println("The elements of the array in snake pattern are: ");
    for(int i=0; i<rows; i++){
        if(i%2 == 0){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
        } else {
            for(int j=cols-1; j>=0; j--){
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
    
    }
    
}
