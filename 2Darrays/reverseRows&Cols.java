import java.util.Scanner;
/* 
Reverse the rows and columns of a 2D array. 
with normal array and snake array.

*/


public class reverseRows&Cols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Reverse the rows
        for (int i = 0; i < rows / 2; i++) {
            int[] temp = arr[i];
            arr[i] = arr[rows - 1 - i];
            arr[rows - 1 - i] = temp;
        }

        // Reverse the columns
        for (int j = 0; j < cols / 2; j++) {
            for (int i = 0; i < rows; i++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][cols - 1 - j];
                arr[i][cols - 1 - j] = temp;
            }
        }

        // Print the reversed array
        System.out.println("Reversed array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Print the snake pattern array
        System.out.println("Snake pattern array: ");
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        // print reverse snake pattern array
        System.out.println("Reverse snake pattern array: ");
        for (int i = rows - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
