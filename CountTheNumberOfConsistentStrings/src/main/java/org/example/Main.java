package org.example;


import java.util.HashSet;
import java.util.Set;


public class Main {

    public static boolean isConsistent(String word,Set<Character> allowedSet)
    {
        for(char ch:word.toCharArray())
        {
            if(!allowedSet.contains(ch))
            {
                return false;
            }
        }
        return true;
    }

    public static void countConsistentStrings(String allowed,String[] words)
    {
        Set<Character> allowedSet=new HashSet<>();
        for(char ch:allowed.toCharArray())
        {
            allowedSet.add(ch);
        }
        int count=0;

        for(String word:words)
        {
            if((isConsistent(word,allowedSet)))
            {
               count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {

        countConsistentStrings("cad",new String[]{"cc","acd","b","ba","bac","acd"});
    }
}