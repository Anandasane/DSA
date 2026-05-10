import java.util.Scanner;
/* finding all the substrings of a string

class Solution {
    public static int sumSubstrings(String s) {
        int sum = 0;
        int n = s.length();
        for(int i = 0 ; i<n; i++){
            for(int j =i;j<n;j++){
                String sub= s.substring(i,j+1);
                sum += Integer.parseInt(sub);
            }
            
            
        }
        return sum;
    }
}
*/

public class allSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("All the substrings of the string are: ");

        for(int i=0; i<str.length(); i++){// i is the starting index of the substring
            for(int j=i+1; j<=str.length(); j++){// j is the ending index of the substring
                System.out.println(str.substring(i, j));
            }
        }
        sc.close();
    }
    
}