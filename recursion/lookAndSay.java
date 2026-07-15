import java.util.*;
/* 
Look and Say Pattern
Difficulty: MediumAccuracy: 62.54%Submissions: 50K+Points: 4
Given an integer n. Return the nth row of the following look-and-say pattern.
1
11
21
1211
111221
Look-and-Say Pattern:

To generate a member of the sequence from the previous member, read off the digits of the previous member, counting the number of digits in groups of the same digit. For example:

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
1211 is read off as "one 1, one 2, then two 1s" or 111221.
111221 is read off as "three 1s, two 2s, then one 1" or 312211.
Examples:

Input: n = 5
Output: 111221
Explanation: The 5th row of the given pattern will be 111221.
Input: n = 3
Output: 21
Explanation: The 3rd row of the given pattern will be 21.

*/


public class lookAndSay{

    public String countAndSay(int n) {
            // Base case: The first row is always "1"
            if (n == 1) return "1";

            // Recursively get the previous row (n-1)
            String prev = countAndSay(n - 1);
            
            StringBuilder ans = new StringBuilder();
            int count = 1;
            
            // Iterate through the previous string to count consecutive digits
            for (int i = 1; i < prev.length(); i++) {
                if (prev.charAt(i) == prev.charAt(i - 1)) {
                    // If current digit is same as previous, increment count
                    count++;
                } else {
                    // If different, append "count" + "digit" to result
                    ans.append(count).append(prev.charAt(i - 1));
                    // Reset count for the new digit
                    count = 1;
                }
            }
            
            // Append the last group (loop ends before processing the final group)
            ans.append(count).append(prev.charAt(prev.length() - 1));
            
            return ans.toString();
        }

    //     Another Method
    //     public String countAndSay(int n) {
    //     if(n==1)return "1";
    //     String s = countAndSay(n-1);
        
    //     String ans ="";
    //     int i=0,j=0;
    //     while(j<s.length()){
    //         if(s.charAt(i)==s.charAt(j))j++;
    //         else{
    //             int freq = j-i;
    //             ans+= freq;
    //             ans+= s.charAt(i);
    //             i=j;
    //         }
    //     }
    //     int freq = j-i;
    //             ans+= freq;
    //             ans+= s.charAt(i);
    //             return ans;
    // }

        public static void main(String[] args) {
            
        }
}