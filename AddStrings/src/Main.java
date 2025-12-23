public class Main {

    public static String addStrings(String num1, String num2) {

        StringBuilder add=new StringBuilder();
        int carry=0;
        int num1L=num1.length()-1;
        int num2L=num2.length()-1;

        while(num1L>=0 ||num2L>=0 ||carry>0)
        {
            int digit1=(num1L>=0)?num1.charAt(num1L)-'0':0;
            int digit2=(num2L>=0)?num2.charAt(num2L)-'0':0;

            int sum=digit1+digit2+carry;
            add.append(sum%10);
            carry=sum/10;

            num1L--;
            num2L--;
        }
        return add.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(addStrings("123","678"));
    }
}