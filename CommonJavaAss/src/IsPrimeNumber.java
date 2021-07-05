//Write a program to check the given number is a prime number or not?

import java.util.Scanner;  
public class IsPrimeNumber {
	
	public static boolean isPrime(int n) 
	{  
	       if (n <= 1) 
	       {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++)
	       {  
	           if (n % i == 0)
	           {  
	               return false;  
	           }  
	       }  
	       return true;  
   }  
	
   public static void main(String[] args) 
   {
	  System.out.print("*************Check if a number is prime or not***********\n"); 
      Scanner sc = new Scanner(System.in);  
      int ch;
      do
      {
       System.out.print("Enter the number : ");  
       int n = sc.nextInt(); 
           if (isPrime(n)) 
           {  
               System.out.println(+n +" " +"Is a Prime Number");  
           }  
           else
           {
        	   System.out.println(+n +" " +"Is not a Prime Number");  
           } 
        System.out.println("Do you want to continue: Press 1");
        ch=sc.nextInt();
      }while(ch==1);
   }  
   
} 

/*
*************Check if a number is prime or not***********
Enter the number : 10
10 Is not a Prime Number
Do you want to continue: Press 1
1
Enter the number : 19
19 Is a Prime Number
Do you want to continue: Press 1
*/
 

