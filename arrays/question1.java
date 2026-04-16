import java.util.Scanner;

/*
multiply odd indexed elements by 2 and add 10 to even indexed elements in an array
 */


public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array");
        //taking input in the array
        for(int i = 0; i<n;i++){
            
            arr[i] = sc.nextInt();
        }
        // multiplying odd indexed elements by 2 and adding 10 to even indexed elements in the array
        for(int i = 0; i<n;i++){
            if(i%2==0){
                arr[i] += 10;
            }
            else{
                arr[i] *= 2;
            }
        }
        System.out.println("The modified array is ");
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
