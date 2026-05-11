package strings;
import java.util.Scanner;
/* 
given a String s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
*/

public class reverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String reversedStr = reverseEachWord(str);
        System.out.println("The string with each word reversed is: " + reversedStr);
        sc.close();
    }
    // using StringBuilder
    static String reverseEachWord(String str){
        String[] words = str.split(" ");
        StringBuilder reversedStr = new StringBuilder();
        for(String word : words){
            StringBuilder reversedWord = new StringBuilder(word);
            reversedStr.append(reversedWord.reverse().toString()).append(" ");
        }
        return reversedStr.toString().trim();
    }
    // using string concatenation
    static String reverseEachWordWithoutStringBuilder(String str){
        String[] words = str.split(" ");
        String reversedStr = "";
        for(String word : words){
            String reversedWord = "";
            for(int i=word.length()-1; i>=0; i--){
                reversedWord += word.charAt(i);
            }
            reversedStr += reversedWord + " ";
        }
        return reversedStr.trim();
    }
    // using char array
    static String reverseEachWordUsingCharArray(String str){
        String[] words = str.split(" ");
        String reversedStr = "";
        for(String word : words){
            char[] charArray = word.toCharArray();
            for(int i=charArray.length-1; i>=0; i--){
                reversedStr += charArray[i];
            }
            reversedStr += " ";
        }
        return reversedStr.trim();
    }
    // using two pointers
    static String reverseEachWordUsingTwoPointers(String str){
        String[] words = str.split(" ");
        String reversedStr = "";
        for(String word : words){
            char[] charArray = word.toCharArray();
            int left = 0;
            int right = charArray.length - 1;
            while(left < right){
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
            reversedStr += new String(charArray) + " ";
        }
        return reversedStr.trim();
    
    // using sliding window
    static String reverseEachWordUsingSlidingWindow(String str){
        String[] words = str.split(" ");
        String reversedStr = "";
        for(String word : words){
            char[] charArray = word.toCharArray();
            int left = 0;
            int right = charArray.length - 1;
            while(left < right){
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
            reversedStr += new String(charArray) + " ";
        }
        return reversedStr.trim();
    }
}
