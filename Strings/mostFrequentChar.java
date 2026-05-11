import java.util.Scanner;
/* finding the most frequent character in a string and if the string has multiple characters with the same frequency,
 it will return the character with lowest value in the string.
 

brute force approach with time complexity of O(n^2)
 class Solution {
    public char getMaxOccuringChar(String s) {
        int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);
        for(int i = 0; i<n;i++){
            int freq  = 1;
            char ch = s.charAt(i);
            for(int j = i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)) freq++;
                
            }
            if(freq>maxFreq){
                maxFreq = freq;
                ans = ch;
            }
            else if(freq==maxFreq && ch<ans){
                ans = ch;
            }
        }
        return ans;
    }
}

sliding window approach with time complexity of O(n)
class Solution {
    public char getMaxOccuringChar(String s) {
        int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0, j= 0;
        while(j<n){
            if(arr[i]==arr[j])j++;
            else{
                int freq = j-i;
                if(freq>maxFreq){
                    maxFreq = freq;
                    ans = arr[i];
                    
                }
                i=j;
            }
        }
        int freq = j-i;
        if(freq>maxFreq){
        maxFreq = freq;
        ans = arr[i];
                    
        }
        return ans;
    
                        
    }
}

frequency array approach with time complexity of O(n)
class Solution {
    public char getMaxOccuringChar(String s) {
        int n = s.length();
        char ans = s.charAt(0);
        int[] freq = new int[26];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            idx = ch - 97;
            freq[idx]++;
        }
        int maxFreq = 0;
        char ans = s.charAt(0);
        for(int i = 0;i<26;i++){
            if(freq[i]>maxFreq){
                maxFreq = freq[i];
                ans =(char)(i+97);
            }
        }
        return ans;

    }
}

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
    // naive approach with time complexity of O(n^2)
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
    // sliding window approach with time complexity of O(n)
    static char findMostFrequentCharSlidingWindow(String str){
        int[] freq = new int[256]; // assuming ASCII characters
        int maxFreq = 0;
        char mostFrequentChar = ' ';
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)]++;
            if(freq[str.charAt(i)] > maxFreq){
                maxFreq = freq[str.charAt(i)];
                mostFrequentChar = str.charAt(i);
            }
        }
        return mostFrequentChar;
    }
    // frequency array approach with time complexity of O(n)
    static char findMostFrequentCharFrequencyArray(String str){
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