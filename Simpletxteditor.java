import java.io.*;
import java.util.*;

public class Simpletxteditor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Stack<String> st = new Stack<>();
        String str = "";
        st.push(str);
        for(int i = 0;i < q;i++) {
            int a = sc.nextInt();
            if(a == 1) {
                String s = sc.next();
//                System.out.println(s);
                str = str.concat(s);
//                System.out.println("a = 1 String str: "+str);
                st.push(str);
//                System.out.println(st);
            } else if(a == 2) {
                int k = sc.nextInt();
                if(k < str.length())
                    str = str.substring(0,str.length()-k);
                else
                    str = "";
                st.push(str);
//                System.out.println("a = 2 String str: "+str);
//                System.out.println(st);
            } else if(a == 3) {
                int k = sc.nextInt();
                System.out.println(str.charAt(k-1));
//                System.out.println("a = 3 String str: "+str);
//                System.out.println(st);
            } else {

                if (st.size() != 0){
                    st.pop();

                    if (st.size() != 0) {
                        str = st.peek();
//                        System.out.println("a = 4 String str: "+str);
                    }

                    else
                        System.out.println("");
                }
                else
                    System.out.println("");
//                System.out.println(st);
            }
        }
    }
}
