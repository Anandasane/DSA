package strings;
import java.util.Scanner;
import java.util.Arrays;
/* 
finding anagrams of a string
An anagram is a word or phrase formed by rearranging the letters of a different word or

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!= s2.length())return false;
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i=0;i<a1.length;i++){
            if(a1[i]!=a2[i])return false;
            
        }
        return true;
    }
}
*/

public class anaGrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        
        if(areAnagrams(str1, str2)){
            System.out.println("The strings are anagrams");
        }else{
            System.out.println("The strings are not anagrams");
        }
        sc.close();
    }
    
            static boolean areAnagrams(String s1, String s2){
        if(s1.length() != s2.length())return false;
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i=0; i<a1.length; i++){
            if(a1[i] != a2[i])return false;
        }
        return true;
    }
}
