package strings;
import java.util.Scanner;
/* 
creating compare to method which will compare two strings and return an integer value
if the first string is greater than the second string then it will return a positive value
if the first string is less than the second string then it will return a negative value
if the strings are equal then it will return zero
*/
public class compareTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        
        int result = str1.compareTo(str2);
        if(result > 0){
            System.out.println("The first string is greater than the second string");
        }else if(result < 0){
            System.out.println("The first string is less than the second string");
        }else{
            System.out.println("The strings are equal");
        }
        sc.close();
    }

    static int compareTo(String str1, String str2){
        int n1 = str1.length();
        int n2 = str2.length();
        int minLength = Math.min(n1, n2);
        for(int i=0; i<minLength;i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if(ch1 != ch2){
                return ch1 - ch2;
            }
        }
        return n1 - n2;
    }
    
}
