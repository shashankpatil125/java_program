import java.util.*;
public class kadanes_Algorithm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        int sum=0;
        int max=0;
        for (int j=0;j<len;j++)
        {
            arr[j]=sc.nextInt();
        }
        for (int i=0;i<len;i++)
        {
            sum += arr[i];
            if(sum<0)
            {
                sum=0;
            }
            if (max<sum)
            {
                max=sum;
            }
        }
        System.out.println("maximest addition is: "+max);
    }
}
