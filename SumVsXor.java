/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumvsxor;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumVsXor {

    
    static long solve(long n) {
        long count = 0;
        while(n!=0) {
            long bin = n % 2;
            if(bin == 0)
                count++;
            n = n / 2;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = solve(n);
        System.out.println((long)Math.pow(2,result));
    }
}
