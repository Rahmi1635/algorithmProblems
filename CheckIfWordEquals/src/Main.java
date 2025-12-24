public class Main {

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getValue(firstWord)+getValue(secondWord)==getValue(targetWord);
    }


    public static int getValue(String word)
    {
        StringBuilder strToInt=new StringBuilder();

        for(char ch:word.toCharArray())
        {
            strToInt.append(ch-'a');

        }
        return Integer.parseInt(strToInt.toString());
    }

    public static void main(String[] args) {

        System.out.println(isSumEqual("aaa","a","aab"));

    }
}