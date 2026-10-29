import java.util.Stack;

public class Balance_Bracket {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<st.length();i++){
            char ch=st.charAt(i);
            if(ch=='c'||ch=='['||ch=='{') st.push(ch);
            else{ // choosing bracket 
                if(st.isEmpty()){
                    System.out.println("Not Balanced");
                    return;
                }
                char top=st.peek();
                if((ch==')' && top=='(') || (ch==']' && top=='[') || (ch=='}' && top=='{')){
                    st.pop();
                }
                // if(sameStyle(ch,top)){
                //     st.pop();
                // }
                else{
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
    }
    
        // static boolean sameStyle(char a, char b){
        //     if(a=='('&& b==')') return true;
        //     if(a=='['&& b==']') return true;
        //     if(a=='{'&& b=='}') return true;
        //     return false;
        // }
}
