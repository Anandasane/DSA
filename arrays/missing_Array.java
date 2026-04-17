/*
 Finding the missing number in an array of integers from 1 to n
*/


public class missing_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        int arrsum = 0;
        int totalsum = n*(n+1)/2; // formula to calculate the sum of first n natural numbers

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n-1; i++){
            arr[i] = sc.nextInt();
            arrsum += arr[i];
        }
        int missing = totalsum - arrsum;

        System.out.println("The missing number is: " + missing);
        sc.close();
        
    }
    
}
