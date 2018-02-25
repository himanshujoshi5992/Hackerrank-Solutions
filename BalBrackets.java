import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalBrackets {

    static String isBalanced(String s) {

        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < s.length()) {
            char c = s.charAt(i++);
            if(st.size() != 0) {
                char ch = st.peek();
                if(ch == '[' && c == ']')
                    st.pop();
                else if(ch == '{' && c == '}')
                    st.pop();
                else if(ch == '(' && c == ')')
                    st.pop();
                else
                    st.push(c);
            }
            else
                st.push(c);
            System.out.println("Stack content: "+st);
        }
        if(st.size() == 0)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
