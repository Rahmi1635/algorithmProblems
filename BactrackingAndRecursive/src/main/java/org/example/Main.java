package org.example;

public class Main {
    public static void completeTheSentence(int idx,String sentence)
    {
        if(idx>sentence.length())
        {
            return;
        }
        String val;
        val=sentence.substring(0,idx);
        System.out.println(val);
        completeTheSentence(idx+1,sentence);

        if(idx-1>0)
        {
            val=sentence.substring(0,idx-1);
            System.out.println(val);
        }

    }

   

    public static void main(String[] args) {

        completeTheSentence(1,"TürkiyeCumhuriyetinin100.YılıKutluOlsun");


    }
}