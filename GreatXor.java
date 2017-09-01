/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatxor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GreatXor {

    static long theGreatXor(long x){
        int[] a = new int[40];
        
        int i = 0;
        long temp = x;
        while(x != 0) {
            
            if(x % 2 == 0) 
                a[i++] = 0;
            else
                a[i++] = 1;
            x /= 2;
        }
        long count = temp - (long)Math.pow(2, i - 1);
        long value = (long)Math.pow(2,i-1)-1-count;
        
        return value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();
            long result = theGreatXor(x);
            System.out.println(result);
        }
    }
}

