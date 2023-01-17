

import java.util.Scanner;

public class greater2
{
    public static void main(String[] args)
    {
        int a, max=0,min=0;
        System.out.println("find the largest no");
        Scanner gretest = new Scanner(System.in);
        System.out.println("how much numbers you want to compair");
        a=gretest.nextInt();

        for (int i=1;i<=a;i++)
        {
            System.out.print("enter the number "+ i+":");
            int b=gretest.nextInt();

            if (b>=max)
            {
                max=b;
            }
        }
        System.out.println("the largest number is "+max);
    }


}
