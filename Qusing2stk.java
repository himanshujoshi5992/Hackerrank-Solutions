import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0;i < q;i++) {
            int k = sc.nextInt();
            if(k == 1) {
                int x = sc.nextInt();
                st1.push(x);
                
            } else if (k == 2) {
                if (st2.size() != 0)
                    st2.pop();
                else {
                    while (st1.size() != 0) {
                        st2.push(st1.pop());
                    }
                    st2.pop();
                }
            } else
                if (st2.size() != 0)
                    System.out.println(st2.peek());
                else {
                        while (st1.size() != 0)
                            st2.push(st1.pop());
                        System.out.println(st2.peek());
                    }
        }

    }
}
