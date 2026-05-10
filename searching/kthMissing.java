import java.util.Scanner;
/*
Given a sorted array of distinct positive integers arr[], You need to find the kth positive number that is missing from the arr[].

Examples:

Input: arr[] = [2, 3, 4, 7, 11], k = 5
Output: 9
Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.
*/

//  best approach to use binary search. 
//  public int kthMissing(int[] arr, int k) {
//         int lo = 0, hi = arr.length - 1;
//         while(lo<= hi){
//             int mid = lo + (hi-lo)/2;
//             int correctno = mid +1;
//             int missing = arr[mid]-correctno;
//             if(missing>=k) hi = mid-1;
//             else lo = mid+1;
            
//         }
//         return hi+1+k;
//     }


public class kthMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        
        int result = findKthPositive(arr, k);
        System.out.println("The " + k + "th missing positive number is: " + result+"the missing number is "+findKthPositive());
        
        sc.close();
    }

    public static int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int currentNumber = 1;
        int index = 0;
        
        while (missingCount < k) {
            if (index < arr.length && arr[index] == currentNumber) {
                index++;
            } else {
                missingCount++;
            }
            currentNumber++;
        }
        
        return currentNumber - 1;
    }
    

}
