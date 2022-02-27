import java.util.Scanner;

public class practice2
{
    public static void main(String[] args)
    {
        //int i=0;
        int b;
        int sum=0;
        Scanner addition=new Scanner(System.in);
        int a=addition.nextInt();                  // taking value from user   {into variable a}
        for (int i=0;i<a;i++)                      // using for loop
        {
            System.out.println("enter the input" + i);
            b = addition.nextInt();                // taking input from userfor adding theas numbers    {into variable b}
            sum= sum + b;                          //  condition of sum
        }
        System.out.println(sum);





    }
}