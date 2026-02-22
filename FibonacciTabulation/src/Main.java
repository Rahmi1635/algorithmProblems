

public class Main {


    public static  class Fibonacci{


        static int[] memo;

        // Tabulation(Bottom-Up) tekniği

        public  static int fib(int n)
        {
            if(n<=1)
            {
                return n;
            }

            int dp[]=new int[n+1];

            dp[0]=0;
            dp[1]=1;

            for(int i=2;i<=n;i++)
            {
                dp[i]=dp[i-1]+dp[i-2];
            }

            return dp[n];
        }

        // Hafızalama Tekniği

        public static int fibon2(int n)
        {
            if(n<=1)
            {
                return n;
            }

            if(memo[n]!=-1){
                return memo[n];
            }

            memo[n]=fibon2(n-1)+fibon2(n-2);

            return memo[n];

        }

    }

    public static void main(String[] args) {


        System.out.println(Fibonacci.fib(8));

        int n = 4;

        // 3. memo dizisini başlat (her eleman -1 olsun = henüz hesaplanmadı)
        Fibonacci.memo= new int[n + 1];
        for (int i = 0; i <= n; i++) {
            Fibonacci.memo[i] = -1;
        }

        System.out.println("Fibonacci(" + n + ") = " + Fibonacci.fibon2(n));

    }
}