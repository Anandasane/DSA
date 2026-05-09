import java.util.Scanner;
/*
Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.
Example 1:

Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.

*/

public class maxPosiAndNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        // return the maximum count along with side whether it is a max count of positive side or negative side
        int maxCount = new maxPosiAndNeg().maximumCount(nums);
        System.out.println("The maximum count is: " + maxCount+" and it is the count of " + (maxCount == new maxPosiAndNeg().findFirstNonNegative(nums) ? "negative" : "positive") + " integers.");
        
        sc.close(); 



    }
    
   
    public int maximumCount(int[] nums) {
        int n = nums.length;
        
        // Find the index of the first non-negative number (0 or positive)
        // All elements before this index are negative
        int negCount = findFirstNonNegative(nums);
        
        // Find the index of the first positive number
        // All elements from this index to the end are positive
        int firstPositiveIndex = findFirstPositive(nums);
        int posCount = n - firstPositiveIndex;
        
        return Math.max(negCount, posCount);
    }
    
    // Returns the index of the first element >= 0
    // If all are negative, returns n
    private int findFirstNonNegative(int[] nums) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    
    // Returns the index of the first element > 0
    // If all are <= 0, returns n
    private int findFirstPositive(int[] nums) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

