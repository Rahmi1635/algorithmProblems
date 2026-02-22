public class Main {

    public static class Fibonacci{

        public static  long fibonacci(int number)
        {
            if(number<=1)
            {
                return number;
            }

            long[] fib=new long[number+1];
            fib[0]=0;
            fib[1]=1;

            for(int i=2;i<=number;i++)
            {
                fib[i]=fib[i-1]+fib[i-2];
            }
            return fib[number-1];

        }
    }

    public static void main(String[] args) {

        System.out.println(Fibonacci.fibonacci(10));
    }
}