public class kadensalgo {


    public static int maxsum(int[] arr)
    {
        int maxsum=0;
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum<0)
            {
                sum=0;
            }
            else if(sum>maxsum)
            {
                maxsum=sum;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr= {-5,4,6,-3,4,-1};

        System.out.println(maxsum(arr));
    }

}
