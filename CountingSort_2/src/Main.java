public class Main {

    public static class RepeatValue{

        public static int[] valueFind( int inputArray[])
        {
            int n=inputArray.length;
            int maxi=0;

            for(int i=0;i<n;i++)
            {
                maxi=Math.max(maxi,inputArray[i]);
            }

            int countArray[]=new int[maxi+1];

            for(int i=0;i<n;i++)
            {
                countArray[inputArray[i]]++;
            }

            for(int i=1;i<=maxi;i++)
            {
                countArray[i]+=countArray[i-1];
            }

            int[] outputArray=new int[n];

            for(int i=n-1;i>=0;i--)
            {
                outputArray[countArray[inputArray[i]]-1]=inputArray[i];
                countArray[inputArray[i]]--;
            }

            return outputArray;
        }
    }

    public static void main(String[] args) {

        int[] inputArray = {2,0,2,3,5,2,3,5};

        int[] outputArray = RepeatValue.valueFind(inputArray);

        for (int i = 0; i < outputArray.length; i++) {
            System.out.print(outputArray[i] + " ");
        }



    }
}