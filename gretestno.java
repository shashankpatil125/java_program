package com.practice;

import java.util.Scanner;

public class gretestno
{
    public static void main(String[] args)
    {
        long num1,num2,num3;
        Scanner greatno= new Scanner(System.in);
        System.out.println("enter the number 1");
        num1 = greatno.nextInt();
        System.out.println("enter the number 2");
        num2 = greatno.nextInt();
        System.out.println("enter the number 3");
        num3 = greatno.nextInt();
        if (num1 >= num2 && num1 >= num3 )
        {
            System.out.println(num1+ " is greater than "+ num2 +" and "+num3);
        }
        else if (num2 >= num1 && num2 >= num3 )
        {
            System.out.println(num2+ " is greater than "+ num1 +" and "+num3);
        }
        else if (num3 >= num1 && num3 >= num2 )
        {
            System.out.println(num3+ " is greater than "+ num1 +" and "+num2);
        }
        else
        {
            System.out.println("invalid");
        }


    }
}
