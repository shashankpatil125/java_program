public class bubblesort {

    public static void bubblesort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int x=0;x<arr.length;x++)
        {
            System.out.println(arr[x]);
        }
    }

    public static void main(String[] args) {

        int[] input={23,12,42,3,23,4,52,4,12464,24,12412,5,34,424};
        bubblesort(input);
    }

}
