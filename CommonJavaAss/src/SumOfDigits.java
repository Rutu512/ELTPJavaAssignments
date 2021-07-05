
//Write a program to find sum of each digit in the given number using recursion.

import java.util.Scanner;
public class SumOfDigits 
{
    public static int sumDigit(int n)
    {
    	int sum = 0;
    	sum = n % 10;
        	if(n == 0)
        	{
        		return 0;
        	}	
        	else
        	{
        		return sum + sumDigit(n / 10);
        	}
    }
        
    public static void main(String[] args) 
    {
        int n;
        System.out.print("***********Sum Of Digits using Recursion Program***********\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:\n");
        n = sc.nextInt();
        System.out.print("The Number is:\n" +n);
        int result = sumDigit(n);
        System.out.println("\nSum Of digits of number is : " +result);
    }
}

/*
***********Sum Of Digits using Recursion Program***********
Enter the number:
4855
The Number is:
4855
Sum Of digits of number is : 22*/