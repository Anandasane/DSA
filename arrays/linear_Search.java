import java.util.Scanner;
import java.util.Arrays;

public class linear_Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            int element = sc.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
        sc.close();
        
    }
    
}
