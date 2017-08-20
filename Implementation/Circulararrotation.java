/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulararrotation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Circulararrotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            if(m-(k % n) < 0) 
                System.out.println(a[n+m-(k % n)]);
            else if(m-(k % n) >= 0) 
                System.out.println(a[m-(k % n)]);
        }
    }
}

