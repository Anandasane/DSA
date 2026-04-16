import java.util.Scanner;
import java.util.Arrays;


/*
finding the prime numbers in a given range and storing them in an array and then printing the array
*/

public class question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = sc.nextInt();
        int[] primes = new int[n];
        int count = 0;
        for(int i=2; i<=n; i++){
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primes[count] = i;
                count++;
            }
        }
        System.out.println("The prime numbers in the given range are: ");
        for(int i=0; i<count; i++){
            System.out.print(primes[i] + " ");
        }
    } 
    
}
