import java.util.Scanner;
/*
Given a sorted array arr[]. Find the element that appears only once in the array. All other elements appear exactly twice. 

Examples:

Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65]
Output: 4
Explanation: 4 is the only element that appears exactly once
*/





public class singleAmongDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The element that appears only once in the array is: "+singleAmongDouble(arr));
        sc.close();
        if(arr.length == 1){// if the length of the array is 1 then return the first element
            System.out.println("The element that appears only once in the array is: "+arr[0]);
            return;
        }
        if(arr[0] != arr[1]){// if the first element is not equal to the second element then return the first element
            System.out.println("The element that appears only once in the array is: "+arr[0]);
            return;
        }
     

    }
    static int singleAmongDouble(int[] arr){
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
           int mid = lo +(hi-lo)/2;
            if(arr[mid]!=arr[mid-1]&& arr[mid]!=arr[mid+1])return arr[mid];// if mid is not equal to the previous element and mid is not equal to the next element then return mid
            int f = mid , s = mid;// if mid is equal to the previous element then f is mid-1 else s is mid+1
            if(arr[mid-1]==arr[mid]) f= mid-1;// if mid is equal to the previous element then f is mid-1
            else s= mid+1;// if mid is equal to the next element then s is mid+1
            int leftcount = f-lo;// if mid is equal to the previous element then leftcount is f-lo else leftcount is s-lo
            int rightcount = hi-s;// if mid is equal to the previous element then rightcount is hi-s else rightcount is hi-f
            if(leftcount%2==0) lo = s+1;// if leftcount is even then search in the right half else search in the left half
            else hi = f-1;// if leftcount is odd then search in the left half else search in the right half
            
        }
        return arr[lo];
    }
    
}
