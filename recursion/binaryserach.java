import java.util.Scanner;


class binarysearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
       
            
    }
    public int helper(int[] nums, int target,int lo , int hi ) {
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if(nums[mid]==target)return mid;
        else if(nums[mid]>target) return helper(nums,target,lo,mid-1);
        else return helper(nums,target,mid+1,hi);
        
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        return helper(nums,target,0,n-1);
    }
}