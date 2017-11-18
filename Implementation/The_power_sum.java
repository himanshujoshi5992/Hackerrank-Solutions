import java.io.*;
import java.util.*;

public class Solution {

    public static int pow_sum(int X,int n,int N) {
        if(Math.pow(n,N) == X)
            return 1;
        else if(Math.pow(n,N) < X) {
            return pow_sum(X-(int)Math.pow(n,N),n+1,N) + pow_sum(X,n+1,N);
        }
        else 
            return 0;
    }
    public static void main(String[] args) {
        int X,N;
        Scanner s = new Scanner(System.in);
        X = s.nextInt();
        N = s.nextInt();
        int result = pow_sum(X,1,N);
        System.out.println(result);
    }
}
