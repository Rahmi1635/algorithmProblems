import java.util.*;

public class Main {
    public static char findTheDifference(String s, String t) {

        int[] count=new int[26];


        for(char ch:t.toCharArray())
        {
            count[ch-'a']++;
        }

        for(char ch:s.toCharArray())
        {
            count[ch-'a']--;
        }

        for(int i=0;i<26;i++)
        {
            if(count[i]!=0)
            {
               return (char) (i+'a');

            }
        }
        return '?';
 }


    public static void main(String[] args) {


        System.out.println(findTheDifference("abcdy","abcd"));

    }
}