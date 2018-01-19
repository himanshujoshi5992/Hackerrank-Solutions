import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void encryption(String s) {
        int rows = (int) Math.floor(Math.sqrt(s.length()));
        int cols = (int) Math.ceil(Math.sqrt(s.length()));
        if(rows * cols < s.length()) {
            rows++;
        }
        //System.out.println("Rows = "+rows+" Cols = "+cols);
        for(int i = 0;i < cols;i++) {
            //int k = 1;
            for(int j = i;j < s.length();j+=cols) {
                //System.out.println("i+k = "+sum);
                System.out.print(s.charAt(j));

            }
            System.out.print(" ");
                
        }
        return;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        encryption(s);
        //System.out.println(result);
        in.close();
    }
}
