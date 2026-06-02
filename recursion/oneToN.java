import java.util.Scanner;

public class oneToN {
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
        if(n!=1) System.out.print(n + " ");

    }
    
    // public static void print(int n){
    //     if(n==0) return;
    //     print(n-1);
    //     System.out.print(n + " ");
    // }

    // public static void printNumbers(int x){
    //     if (x > n) return;
    //     System.out.print(x + " ");
    //     printNumbers(x  + 1);
    // }
    //
    // public static void print(int x , int n){
    //     if(x > n )return;
    //     System.out.print(x + " ");
    //     print(x + 1, n);
    // }

}
