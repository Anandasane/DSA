import java.util.Scanner;

/*
finding the square root of a number using binary search
if the number is not a perfect square then return the floor value of the square root
*/

public class squareRoot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The square root of "+n+" is: "+squareRoot(n));
        sc.close();
    }

    static int squareRoot(int n){
        int low = 0, high = n, ans = 0;// if n is less than 2 then return n
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == n) {// if mid*mid is equal to n then return mid
                return mid;// if mid*mid is equal to n then mid is the square root of n
            }
            if (mid * mid > n) {// if mid*mid is greater than n then search in the left half
                high = mid - 1;
            } else {// if mid*mid is less than n then search in the right half
                low = mid + 1;
                ans = mid;// update ans to mid because mid is the floor value of the square root of n
            }
        }
        return ans;
    }
}