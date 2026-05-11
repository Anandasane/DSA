import java.util.Scanner;
import java.util.Arrays;


public class swapAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sieze of the array: ");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i = 0 ; i< n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Before swapping: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        
        System.out.println();

        SwappingElements(arr);
        System.out.print("After swapping: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void SwappingElements(int x[]){
        int n = x.length;
        // swapping the alternate elements in an  array
        // for(int i = 0;i<n;i++){
        //     int j = [i+1];  
        //     while(j<n){
        //         int temp = arr[i];
        //         arr[j]= temp;
        //         arr[i]= arr[j+2];
        //     }
        // }
        for (int i = 0; i < n - 1; i += 2) {
            // Swap x[i] and x[i+1]
            int temp = x[i];
            x[i] = x[i + 1];
            x[i + 1] = temp;
        }
        
    }

}
