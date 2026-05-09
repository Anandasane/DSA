import java.util.Scanner;
/*
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

*/
public class arrangeCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coins: ");
        int n = sc.nextInt();
        System.out.println("The number of complete rows of the staircase you will build is: "+new arrangeCoins().arrangeCoins(n));
        sc.close(); 
        
        }
    public int arrangeCoins(int n) {
       long lo = 0, hi = n, ans=0;
        while(lo<=hi){
            long k = lo +(hi-lo)/2;
            long m = k*(k+1)/2;
            if(m==n)return (int) k;
            else if(m>n) hi = k-1;
            else {
                ans = k;
                lo = k+1;
            }
        }
        return (int)(ans);
    }
    
}
