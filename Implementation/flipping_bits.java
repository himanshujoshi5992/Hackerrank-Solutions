import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0;i < t;i++) {
            long num = s.nextLong();
            long flipped_num = (long) Math.pow(2, 32) - 1;
            flipped_num = flipped_num - num;
            System.out.println(flipped_num);
        }
        
    }
}
