// Write a program to find perfect number or not.
// sum of factors is equal to the number itself.

import java.util.Scanner;  
public class PerfectNumber 
{  
	static long isPerfect(long num)  
	{       
		long sum=0;  
	
		for(int i=1; i <= num/2; i++)  
		{  
			if(num % i == 0)  
			{  
				//calculates the sum of factors  
				sum=sum + i;  
			}   
		}  
		return sum;   
	}

	public static void main(String args[])    
	{  
		System.out.print("***********Check Perfect Number or not*******"); 
		long number, ch,s;  
		Scanner sc=new Scanner(System.in);  
		do
		{
		System.out.print("\n Enter the number: ");  
		number=sc.nextLong();  
	  
		s = isPerfect(number);  
			if(s==number)  
				System.out.println(number+" is a perfect number");  
			else  
				System.out.println(number+" is not a perfect number");
		System.out.println("Do you want to continue:Press 1");
		ch =sc.nextInt();
		}while(ch ==1);
	}   
}  

/*
***********Check Perfect Number or not*******
Enter the number: 28
28 is a perfect number
Do you want to continue:Press 1
1

Enter the number: 1234
1234 is not a perfect number
Do you want to continue:Press 1
*/