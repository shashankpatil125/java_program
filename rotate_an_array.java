//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1#
import java.util.Scanner;

public class rotate_an_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        int[] arr=new int[range];
        for (int i=0;i<range;i++)
        {
            arr[i]=sc.nextInt();
        }

        //logic
        int temp=arr[range-1];
        for(int j=range-1;j>0;j--)
        {
            arr[j]=arr[j-1];
            if (j==1)
            {
                arr[0]=temp;
            }
        }

        System.out.println("rotateded array");
        for (int x=0;x<range;x++)
        {
            System.out.println(arr[x]);
        }

    }
}

