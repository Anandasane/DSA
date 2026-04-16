import java.util.Scanner;
/*
finding the minimum and max element in 1D array

*/
public class min_Max_1DArray {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        //taking input in the array
        for(int i = 0; i<n;i++){
            
            arr[i] = sc.nextInt();
        }
        // finding the minimum and maximum element in the array
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The minimum element in the array is "+min);
        System.out.println("The maximum element in the array is "+max);
        sc.close();

    }
}
