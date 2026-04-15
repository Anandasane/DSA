import java.util.*;
/*

taking a 2D array input and showing a output

*/
public class arrays2 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and colmns for the 2D array");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] arr = new int[rows][cols];

        // for taking input 
        for(int i = 0; i<rows; i++){
            for(int j=0; j<cols;j++){
                 arr[i][j] = sc.nextInt();
            }
        }
        // for showing output
        for(int i = 0; i<rows; i++){
            for(int j=0; j<cols;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();


    }
    
}
