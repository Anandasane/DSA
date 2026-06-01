import java.util.Scanner;

public class oneToN {
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        printNumbers(1);
    }
    public static void printNumbers(int x){
        if (x > n) return;
        System.out.print(x + " ");
        printNumbers(x  + 1);
    }
}
