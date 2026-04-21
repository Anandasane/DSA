/* 
deutch national flag algorithm using three pointers low , mid , high
*/

import java.util.Scanner;

public class Sort0s1s2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sieze of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the os , 1s and 2s for the array: ");

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int low = 0 , mid = 0 , high = n-1;

        while(mid<=high){ // while loop to sort the array

            if(arr[mid] == 0){ // if the element is 0 then swap it with the element at the low index and increment the low and mid index
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){ // if the element is 1 then increment the mid index
                mid++;
            }
            else if(arr[mid] == 2){ // if the element is 2 then swap it with the element at the high index and decrement the high index
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }

        for(int i = 0 ; i<n ; i++){ // printing the sorted array
            System.out.print(arr[i]+" ");
        }

        sc.close();

        
    }
}
