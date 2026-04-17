/*
segregate 0s and 1s in an array
*/
import java.util.Scanner;

public class segregate_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter the elements of the array (0s and 1s only): ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n-1;

        while(left<right){
           if(arr[left] == 0)left++;
           else if(arr[right] == 1)right--;
           //if(left>right) break;
           else if(arr[left] == 1 && arr[right] == 0){
               arr[left] = 0;
               arr[right] = 1;
               left++;
               right--;
           }
           
          
        }

        System.out.println("The segregated array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}
