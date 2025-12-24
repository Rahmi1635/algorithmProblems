public class Main {

    public static class ClimbStairs{

        public static int climbStair(int n)
        {
            int ways[]=new int[n+1];

            ways[0]=1;

            for(int i=1;i<=n;i++)
            {
                ways[i]+=ways[i-1];

                if(i>=2)
                {
                    ways[i]+=ways[i-2];
                }

            }
            return ways[n];
        }

        static int[]memo;
        public static int climbStair2(int n,int[] memo)
        {

            if(n<0)
            {
                return 0;
            }
            if(n==0)
            {
                return 1;
            }

            if(memo[n]!=-1)
            {
                return memo[n];
            }

            memo[n]=climbStair2(n-1,memo)+climbStair2(n-2,memo)+climbStair2(n-3,memo);

            return memo[n];

        }

    }

    public static void main(String[] args) {

        System.out.println(ClimbStairs.climbStair(4));
    }
}