import java.util.*;

/*
basic maths concepts and questions
*/

public class BasicMaths {

    static void printDigits(int num){
    
        while(num!=0){
        int digit = num%10;
        System.out.print(digit);
         num = num/10;
         
        }
        
    }
      

     static int countDigits(int num){
        int count= 0;
        while(num!=0){
        int digit = num % 10;
        count++;
         num = num/10;
        }
        System.out.println("count of the digits: " + count);
        return count;
    }

     static int sumOfDigits(int num){
        int sum= 0;
        while(num!=0){
        int digit = num % 10;
        sum = sum + digit;
         num = num/10;
        }
        System.out.println("Sum of the digits: " + sum);
        return sum;
    }

    static int reverseNum(int num){
        int revnum = 0;
        // ans = ans *10 + digit
        while (num!=0) {
            int digit = num%10;
            revnum = revnum*10 + digit;
            num = num/10; 
            
        }
        System.out.println("Reverse of the number: "+revnum);
        return revnum;
    }

    static boolean isPallindrome(int num){
        int origina = num;
        int revnum = reverseNum(num);
        if (num == revnum) {
           // System.out.println("The given number is pallindrome: ");
            return true;
        }else{
           // System.out.println("The given number is not a pallindrome: ");
            return false;
        }
    }
    

    static boolean isPrimeNumber(int num){
        for(int i = 2 ; i*i <= num;i++){
            if(num%i == 0){
                return  false;
            }
        }
        return  true;
    }

    static int getGCD(int a , int b){
        //gcd(a,b) = gcd(b, a%b)
        while (b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
            
        }
        int ans = a;
        return ans;
    }
    
    static int getLcm(int a , int b){
        int gcd = getGCD(a, b);
        //gcd(18,12) ->6
        int prod = a*b;
        // prod(a,b) ->216
        int lcm = prod/gcd;
        // 216/6 ->36
        return lcm; 
    }

    static boolean isAmstrong(int num){
        int sum = 0; 
        int originalNum = num;
        while (num!=0) {
            int digit = num % 10;
            int cube = digit*digit*digit;
            sum = sum + digit;
            num = num/10;

        }
        if (sum == originalNum) {
            return true;
        }
        else{
            return false;
        }
    }

    static boolean checkPrefectNumber(int num){
        int sum = 1;
        for(int i = 2 ; i*i<=num ; i++){
            if(num % i == 0){
                // i ne num ko perfectly divide krdia h
                // toh ab factor pair kya banega
                // 1st factor -> 1
                // 2nd factor -> num/i
                int firstFactor = i;
                int secondFactor = num/i;
                sum = sum + firstFactor + secondFactor;

            }
        }
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }

    static int printPrimeNumber(int num){
        for(int i = 2 ; i<=num ; i++){
            if(isPrimeNumber(i)){
                System.out.print(i+" ");
            }
        }
        return 0;
    }

    

    public static void main(String[] args) {
        int n = 5335;
        printDigits(n);
        System.out.println();
        countDigits(n);
        sumOfDigits(n);
        // reverseNum(n);
        // int digitcount = countDigits(n);
        // System.out.println(countDigits(n));
        // isPallindrome(n);
        // boolean ans = isPallindrome(n);
        boolean s = isPallindrome(n);
        System.out.println("The given number is pallindrome: "+s);
        // isPallindrome(n);
        // isPrimeNumber(n);
        boolean ans = isPrimeNumber(n);
        System.out.println("The given number is Prime: "+ ans);
        System.out.println("the GCD of the given number is: "+ getGCD(18,12));
        System.out.println("the LCM of the given number is: "+ getLcm(18,12));
        System.out.println("the given number is Armstrong: "+ isAmstrong(n));
        System.out.println("the given number is Perfect: "+ checkPrefectNumber(6));
        System.out.print("the prime numbers are: ");
        printPrimeNumber(100);

    }
}
