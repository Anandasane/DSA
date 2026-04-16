import java.util.Scanner;
/*
finding the largest and second largest element in an array
*/


public class largest_element_Array {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        //taking input in the array
        for(int i = 0; i<n;i++){
            
            arr[i] = sc.nextInt();
        }
        // finding the largest and second largest element in the array
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("The largest element in the array is "+largest);
        System.out.println("The second largest element in the array is "+secondLargest);
        sc.close();

    }
}
