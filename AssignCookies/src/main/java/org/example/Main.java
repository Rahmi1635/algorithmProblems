package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public  static int findContentChildren(int[] g, int[] s) {
        int gLen=g.length;
        int sLen=s.length;

        Arrays.sort(g);
        Arrays.sort(s);

        int l=0;
        int m=0;

        while(l<sLen && m<gLen)
        {
            if(g[m]<=s[l])
            {
                m++;
            }
            l++;
        }

        return m;
    }

    public static void main(String[] args) {

        System.out.println(findContentChildren(new int[]{1,2},new int[]{1,2,3}));   

    }
}