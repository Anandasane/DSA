package strings;
import java.util.Scanner;
/*
given a character array  you need to make a palindrome out of it by
better approach like splitting the string into two halves and 
then reversing the first half and appending it to the second half
*/

public class makePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int n = str.length();
        String firstHalf = str.substring(0,n/2);
        String secondHalf = str.substring(n/2);
        
        for(int i=0; i<firstHalf.length();i++){
            char ch = firstHalf.charAt(i);
            System.out.println(ch);
        }
        String reverseFirstHalf = "";
        for(int i=firstHalf.length()-1;i>=0;i--){
            char ch = firstHalf.charAt(i);
            reverseFirstHalf = reverseFirstHalf + ch;
        }
        
        String palindrome = secondHalf + reverseFirstHalf;
        System.out.println("The palindrome is: "+palindrome);
        sc.close();
    }

}
