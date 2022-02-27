import java.util.*;

public class Sort_an_array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        int[] array=new int[range];
        for (int x=0;x<range;x++)
        {
            array[x]=sc.nextInt();
        }

        Arrays.sort(array);      //sort the array by very simplest way
        System.out.println("sorted array");
        for(int element:array)
        {
            System.out.println(element);
        }

    }
}
