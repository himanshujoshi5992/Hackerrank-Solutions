import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int alhappy(String b) {
        for(int i = 0;i < b.length();i++) {
            if(i == 0 && b.charAt(i) != b.charAt(i+1)) {
                return 0;
            } else if(i == b.length()-1 && b.charAt(b.length()-1) != b.charAt(b.length()-2)) {
                return 0;
            }
            else if(i != 0 && b.charAt(i) != b.charAt(i-1) && b.charAt(i) != b.charAt(i+1)) {
                return 0;
            } 
        }
        return 1;
    }
    static void isLadybugHappy(String b) {
        int[] a = new int[26];
        

        for(int i = 0;i < b.length();i++) {
            int ascii = (int)b.charAt(i);
            ascii -= 65;
            //System.out.print(ascii+" ");
            if(ascii <= 25) {
                
                a[ascii]++;                
            }

        }
        for(int i = 0;i < 26;i++) {
            //System.out.println(" "+a[i]+" ");
            if(a[i] == 1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        return;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
            if(b.length() == 1) {
                if(b.indexOf('_') == -1) {
                    System.out.println("NO");
                    
                } else {
                    System.out.println("YES");
                    
                }

            }     
            
            else if(b.indexOf('_') == -1) {
                int alreadyHappy = alhappy(b);
                if(alreadyHappy == 1) {
                    System.out.println("YES");

                }else {
                    System.out.println("NO");
                }
            }

            else
                isLadybugHappy(b);
            //System.out.println("");
        }
    }
}
