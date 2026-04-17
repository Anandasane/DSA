/* 
convert a array into a wafe form like a[0] >= a[1] <= a[2] >= a[3] <= a[4] and so on 
by comparing the even index element with the odd index element and swapping them if they are not in the correct order.
*/

import java.util.Scanner;

public class convert_to_wave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // for(int i=0; i<n-1; i++){// n-1 because we are comparing the current element with the next element
        //     if(i%2 == 0){// checking the even index element is greater than the odd index element
        //         if(arr[i] < arr[i+1]){
        //             int temp = arr[i];
        //             arr[i] = arr[i+1];
        //             arr[i+1] = temp;
        //         }
        //     }
        //     else{// checking the odd index element is less than the even index element
        //         if(arr[i] > arr[i+1]){
        //             int temp = arr[i];
        //             arr[i] = arr[i+1];
        //             arr[i+1] = temp;
        //         }
        //     }
        // }
        // second approach 
        
        for(int i = 0; i<n-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

                                                                      

        System.out.println("The wave form of the array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();


    } 
    
}
