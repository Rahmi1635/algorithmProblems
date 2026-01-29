package org.example;

public class Main {
    public static int countPrefixSuffixPairs(String[] words)
    {
      int counter=0;
      int step=0;

      while(step<words.length-1)
      {
          String word1=words[step];
          for(int i=step+1;i<words.length;i++)
          {
              String word2=words[i];
              if(compare(word1,word2))
              {
                  counter++;
              }
          }
          step++;
      }
      return counter;
    }

    public static boolean compare(String word1,String word2)
    {
        if((word2.startsWith(word1) && word2.endsWith(word1)))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] data={"pa","papa","ma","mama"};
        System.out.println(countPrefixSuffixPairs(data));
    }
}