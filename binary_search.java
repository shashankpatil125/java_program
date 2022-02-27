import java.util.ArrayList;

public class binary_search {

    public static int binarysearch(int[] arr, int element)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid= (start+end)/2;
            if(arr[mid]==element)
            {
                return mid;
            }
            else if(arr[mid]<element)
            {
                start=mid+1;
            }
            else if(arr[mid]>element)
            {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input={1,3,4,6,7,34,65};
        int i=binarysearch(input,4);
        System.out.println(i);
    }
}
