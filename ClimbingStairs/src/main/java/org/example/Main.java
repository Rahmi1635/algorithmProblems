package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static int climbStairs(int n) {
       Map<Integer,Integer> memo=new HashMap<>();
       return backtrack(0,n,memo);
    }

    public static int  backtrack(int start, int target, Map<Integer,Integer> memo)
    {
        if(start==target)
        {
            return 1;
        }

        if(start>target)
        {
            return 0 ;
        }

        if(memo.containsKey(start))
        {
            return memo.get(start);
        }

        int count=backtrack(start+1,target,memo)+backtrack(start+2,target,memo);
        memo.put(start,count);

        return count;

    }

    public static void main(String[] args) {

        System.out.println(climbStairs(5));

    }
}