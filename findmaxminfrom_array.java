//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

import java.util.Scanner;
public class findmaxminfrom_array
{
    static void minmax_method(int[] array)
    {
        int maximum=0;
        int minimum=100000000;
        for (int j=0;j<array.length;j++)
        {
            if (array[j]>maximum)
            {
                maximum=array[j];
            }
            if(array[j]<minimum)
            {
                minimum=array[j];
            }

        }
        System.out.println("maximum number is: "+maximum);
        System.out.println("minimum number is: "+minimum);
    }




    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of array");
        int lengthofarray=sc.nextInt();
        int[] arr= new int[lengthofarray];

        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        minmax_method(arr);
    }
}

