import java.util.Stack;

public class basics_of_stack {

    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        
        // System.out.println(st.peek());
        // st.pop(); // underflow;
        // st.push("Anand");
        // st.push("chetan");
        // st.push("prasad");
        // st.push("tushar");
        // st.push("Shubham");
        // st.push("Suraj");
        // System.out.println(st.size());
        // System.out.println(st);
        // st.pop();
        // System.out.println(st+ " "+ st.size());
        // System.out.println(st.peek());
        // System.out.println(st.pop());
        // String s = st.pop();
        
        int ele=50;
        pushAtBottom(st,ele);
        System.out.println(st);
        reverse(st);
        System.out.println(st);

    }

    private static void reverse(Stack<Integer> st){
        if(st.size()<=1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }

    private static void pushAtBottom(Stack<Integer> st, int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, ele);
        st.push(top);

    }
}

