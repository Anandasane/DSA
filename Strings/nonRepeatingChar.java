package strings;
import java.util.Scanner;
/*

finding the non repeating character in a string and if the string has multiple non repeating characters, 
it will return all the non repeating characters in the string. 


*/
public class nonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String nonRepeatingChars = findNonRepeatingChars(str);
        if(nonRepeatingChars.isEmpty()){
            System.out.println("No non repeating characters found in the string.");
        } else {
            System.out.println("The non repeating characters in the string are: " + nonRepeatingChars);
        }
        sc.close();
    }
    // using frequency array with time complexity of O(n) and space complexity of O(1) since the size of the frequency array is constant (256 for ASCII characters)
    static String findNonRepeatingChars(String str){
        int[] freq = new int[256]; // assuming ASCII characters
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)]++;
        }
        String nonRepeatingChars = "";
        for(int i=0; i<str.length(); i++){
            if(freq[str.charAt(i)] == 1){
                nonRepeatingChars += str.charAt(i);
            }
        }
        return nonRepeatingChars;
    }
    // using two pointers with time complexity of O(n^2) and space complexity of O(1)
    static String findNonRepeatingCharsTwoPointers(String str){
        String nonRepeatingChars = "";
        for(int i=0; i<str.length(); i++){
            boolean isNonRepeating = true;
            for(int j=0; j<str.length(); j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    isNonRepeating = false;
                    break;
                }
            }
            if(isNonRepeating){
                nonRepeatingChars += str.charAt(i);
            }
        }
        return nonRepeatingChars;
    }
    // using binary search with time complexity of O(n log n) and space complexity of O(n)
    static String findNonRepeatingCharsBinarySearch(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String nonRepeatingChars = "";
        for(int i=0; i<chars.length; i++){
            if((i == 0 || chars[i] != chars[i-1]) && (i == chars.length-1 || chars[i] != chars[i+1])){
                nonRepeatingChars += chars[i];
            }
        }
        return nonRepeatingChars;
    }
    // return the first non repeating character from the string using binary search
    static char findFirstNonRepeatingCharBinarySearch(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for(int i=0; i<chars.length; i++){
            if((i == 0 || chars[i] != chars[i-1]) && (i == chars.length-1 || chars[i] != chars[i+1])){
                return chars[i];
            }
        }
        return '$'; // return null character if no non repeating character is found
    }

}
