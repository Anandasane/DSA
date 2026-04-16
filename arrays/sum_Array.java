import java.util.Scanner;
/*
finding the sum of all the elements in an array
*/



public class sum_Array {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array");
        //taking input in the array
        for(int i = 0; i<n;i++){
            
            arr[i] = sc.nextInt();
        }
        // finding the sum of all the elements in the array
        int sum = 0;
        for(int i = 0; i<n;i++){
            sum += arr[i];
        }
        System.out.println("The sum of all the elements in the array is "+sum);
        sc.close();

    }
}
