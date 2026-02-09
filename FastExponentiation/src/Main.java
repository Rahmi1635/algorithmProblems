public class Main {

    // Method - 1

    public static double myPow(double x, int n) {
        double carpim = 1;

        if (n >= 0) {
            for (int i = 1; i <= n; i++)
            {
                carpim *= x;

            }

        }
        for(int i=n;i<0;i++)
        {
            carpim =carpim* (1/x);

        }
        return carpim;
    }

    // Method - 2

    public static double myPow2(double x, int n) {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            x=1/x;
            n=-n;
        }
        if(n%2==0)
        {
            return myPow2(x*x,n/2);
        }
        else{
            return x * myPow2(x*x,n/2);
        }

    }

    // Method - 3

    public static double myPow3(double x, int n) {
        long us=n;
        if(us<0)
        {
            x=1/x;
            us=-us;
        }

        double result=1;

        while (us>0)
        {
            if(us%2==1)
            {
                result*=x;
            }
            x*=x;
            us/=2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2,-5));

        System.out.println(myPow3(2.1,10));
    }
}