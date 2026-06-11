import java.util.Scanner;

public class powerlinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int a = sc.nextInt();
        System.out.print("Enter power number: ");
        int b = sc.nextInt();
        System.out.print(a+"to the power of "+b+" is: "+pow(a,b));
    }

//     public static int pow(int a, int b){
//         if(b==0) return 1;
//         return a*pow(a,b-1);
//     }
        public static int pow(int a, int b){
            if(b==0) return 1;
            call = pow(a,b/2);
            if(b%2==0){
                return call*call;
            }
            else{
                return a*call*call;
            }
        }
}
