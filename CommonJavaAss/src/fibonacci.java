
//Write a program to print fibonacci series.

import java.util.*;
public class fibonacci {
	public static int fib(int n)
    {
		if (n <= 1)
        return n;
		return fib(n - 1)+ fib(n - 2);
    }


	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("*******Fibonacci series Program********");
		System.out.println("Enter the range till you want fib series");
		n=sc.nextInt();
			for (int i = 0; i < n; i++) 
			{
				System.out.print(fib(i) + " ");
			}
	}
}

/*
*******Fibonacci series Program********
Enter the range till you want fib series
12
0 1 1 2 3 5 8 13 21 34 55 89 
*/