//Write a program to find the given number is Armstrong number or not?

import java.util.*;
public class ArmStrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******ArmStrong Number Program**************");
		 int n, a, b, c,ch;
		 int count = 0, sum = 0;
	     Scanner s = new Scanner(System.in);
	     do
	     {
	     System.out.print("Enter any number you want to check:");
	     n = s.nextInt();
	     a = n;
	     c = n;
	        
	     while(a > 0)
	        {
	            a = a / 10;
	            count++;
	        }
	        	while(n > 0)
	        	{
	        		b = n % 10;
	        		sum = (int) (sum+Math.pow(b, count));
	        		n = n / 10;
	        	}
	        	if(sum == c)
	        	{
	        		System.out.println("Given number is Armstrong");
	        	}
	        	else
	        	{
	        		System.out.println("Given number is not Armstrong");
	        	}  
	        	
	        	System.out.println("Do you want to continue:Press 1");
				 ch =s.nextInt();
		}while(ch ==1);
	  }
}

	
/* 
 *   
******ArmStrong Number Program**************
Enter any number you want to check:153
Given number is Armstrong
Do you want to continue:Press 1
1
Enter any number you want to check:258
Given number is not Armstrong
Do you want to continue:Press 1

 */

