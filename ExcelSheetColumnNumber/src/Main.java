import java.util.HashMap;

public class Main {

    // excel rows convert to  number
    public static int titleToNumber(String columnTitle)
    {
        int val=0;
        int result=0;
       for(int i=0;i<columnTitle.length();i++)
       {
           val=columnTitle.charAt(i)-'A'+1;  // şu kodu anlayamadım
           result=result*26+val;
       }

        return result;

    }

    // numbers convert to excel rows

    public static String numberToTitle(int value)
    {
        StringBuilder transaction=new StringBuilder();
        while(value>0)
        {
            value--;
            int kalan=value%26;
            char ch=(char)('A'+kalan);
            transaction.insert(0,ch);
            value/=26;
        }
        return transaction.toString();

    }

    // difference operation between excel rows

    public static int distanceNumber(String start,String end)
    {
        int startNum=titleToNumber(start);
        int endNum=titleToNumber(end);

        int result=endNum-startNum;

        return  result;

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.print("Cevap : \t");
        System.out.print(titleToNumber("ZY")+"\n");

        System.out.println(numberToTitle(683));

        System.out.println(distanceNumber("ZG","ZY"));
    }
}