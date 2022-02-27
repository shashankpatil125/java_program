public class insersation_sort {

    public static void insersationsort(int[] arr)
    {
        int n= arr.length;
        for(int i=1;i<n;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>-1 && arr[j]>current)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

        for(int x=0;x<arr.length;x++)
        {
            System.out.println(arr[x]);
        }
    }

    public static void main(String[] args) {
        int[] arr={25,4,3,2,1};
        insersationsort(arr);
    }

}

