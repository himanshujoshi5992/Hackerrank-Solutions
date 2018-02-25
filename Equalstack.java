import java.util.Scanner;
import java.util.Stack;

public class Equalstack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack();
        Stack<Integer> st2 = new Stack();
        Stack<Integer> st3 = new Stack();
        int count1  = 0,count2 = 0,count3 = 0;
        for (int i = 0;i < n1;i++) {
            st.push(sc.nextInt());
            count1 += st.peek();
        }
        while (st.size() != 0)
            st1.push(st.pop());
        for (int i = 0;i < n2;i++) {

            st.push(sc.nextInt());
            count2 += st.peek();
        }
        while (st.size() != 0)
            st2.push(st.pop());
        for (int i = 0;i < n3;i++) {
            st.push(sc.nextInt());
            count3 += st.peek();
        }
        while (st.size() != 0)
            st3.push(st.pop());
//        System.out.println(st1);
//        System.out.println(st2);
//        System.out.println(st3);
        while (true) {
            int min = Math.min(count1,Math.min(count2,count3));
            System.out.println("Min: "+min);
            while (count1 > min) {
                count1 -= st1.pop();
            }
            while (count2 > min) {
                count2 -= st2.pop();
            }
            while (count3 > min) {
                count3 -= st3.pop();
            }
//            System.out.println(st1);
//            System.out.println(st2);
//            System.out.println(st3);
            if (count1 == count2 && count2 == count3)
                break;
        }
        System.out.println(count1);
    }

}
