    public class Main {

    public static class CountingSort{

        public static int[] countingSort(int[] inputArray)
        {

            int length=inputArray.length;

            int min=inputArray[0];
            int max=inputArray[0];

            for(int i=0;i<length;i++)
            {
                max=Math.max(max,inputArray[i]);
                min=Math.min(min,inputArray[i]);
            }

            int range=max-min+1;
            int countArray[]=new int[range];

            for (int i = 0; i < length; i++) {
                countArray[inputArray[i] - min]++;
            }

            for(int i=1;i<range;i++)
            {
                countArray[i]+=countArray[i-1];
            }

            int output[]=new int[length];

            for(int i=length-1;i>=0;i--)
            {
                output[countArray[inputArray[i]-min]-1]=inputArray[i];
                countArray[inputArray[i]-min]--;
            }

            return output;

        }
    }

    public static void main(String[] args) {

        int[] inputArray = {-3,-1,-2,0,2,-1};

        int [] outputArray = CountingSort.countingSort(inputArray);



        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(outputArray[i] + " ");
        }



    }
}