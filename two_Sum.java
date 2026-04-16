import java.util.Arrays;
import java.util.Scanner;


/*
finding the two numbers in an array that add up to a given target using two pointers
*/

    

public class two_Sum {
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
        System.out.println("Enter the target sum");
        int target = sc.nextInt();
        // finding the two numbers in the array that add up to the target using two pointers
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                System.out.println("The two numbers that add up to the target are "+arr[left]+" and "+arr[right]);
                return;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("No two numbers in the array add up to the target");
        sc.close();
    }
    
}
