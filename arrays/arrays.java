import java.util.*;
/*
taking a 1D array input and showing output

*/
public class arrays{
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");   
        int n = sc.nextInt();
        int [] arr = new int[n];

        // for taking the input 
        for(int i = 0 ; i<arr.length; i++){
           arr[i]= sc.nextInt();

        }
        // for showing the output
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        sc.close();

    }
}

