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
    // using frequency array
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
}
