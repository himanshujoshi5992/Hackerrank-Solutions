import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a,int sum){
        int cur_sum  = 0;
        for(int i = 0;i < a.length;i++) {
            //System.out.println("cur_sum = " + cur_sum+" "+"sum-a[i] = "+(sum-a[i]-cur_sum));

            if(cur_sum == sum-(a[i]+cur_sum)) 
                return "YES";
            else 
                cur_sum += a[i];
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                sum += a[a_i];
            }
            String result = solve(a,sum);
            System.out.println(result);
        }
    }
}
