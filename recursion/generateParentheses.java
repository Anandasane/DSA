import java.util.*;

/*
Given a number n, return all the combinations of balanced parentheses of length n.
Note: A sequence of parentheses is balanced if every opening bracket has a corresponding closing bracket in the correct order.
For example, "(())", "()()", and "(()())" are balanced, whereas ")()(", "))((", and "()))" are not.

Examples:

Input: n = 6
Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]
Explanation: These are the only possible valid balanced parentheses.

Input: n = 4
Output: ["(())", "()()"]
Explanation: These are the only possible valid balanced parentheses.

Constraints:
1 ≤ n ≤ 16
n % 2 == 0

*/
class generateParenteses {
   
    public void generate(int n,int l,int r,String s,List<String> ans) {
        if(s.length()==n){
            ans.add(s);
            return;
        }
        if(l<n/2) generate(n,l+1,r,s+"(",ans);
        if(r<l) generate(n,l,r+1,s+")",ans);
    }
    
     public List<String> generateParentheses(int n) {
        List<String> ans = new ArrayList<>();
        generate(n,0,0,"",ans);
       // System.out.println(ans);
        return ans;
    }
}