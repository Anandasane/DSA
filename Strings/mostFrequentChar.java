import java.util.Scanner;
/* finding the most frequent character in a string

*/
public class mostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char mostFrequent = findMostFrequentChar(str);
        System.out.println("The most frequent character in the string is: " + mostFrequent);
        sc.close();
    }
    
    static char findMostFrequentChar(String str){
        int[] freq = new int[256]; // assuming ASCII characters
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)]++;
        }
        int maxFreq = 0;
        char mostFrequentChar = ' ';
        for(int i=0; i<freq.length; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                mostFrequentChar = (char)i;
            }
        }
        return mostFrequentChar;
    }
}