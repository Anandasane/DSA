import java.util.Scanner;




public class reverseInRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int r=0;
        // while(n!=0){
        //     r = r*10 + n%10;
        //     n = n/10;
        // }
        reverse(n,0);

    }
    public static void reverse(int n, int r){
        
        
        if(n==0){
            System.out.print(r);
            return;
        }
        reverse(n/10,r*10+n%10);

    }
}
