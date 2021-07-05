//Write program to check if a number is power of 2 or not

import java.util.*;
public class power {
	
	public static int checkPower(int x)
	{
	   if (x == 0)
	      return 0;

	   while( x != 1)
	   {
	      if(x % 2 != 0)
	         return 0;
	         x /= 2;
	   }
	   return 1;
	}

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num;
		int ch;
		do
		{
		System.out.println("Enter the number you want to test: ");
		num=sc.nextInt();

		if (checkPower(num) == 1)
			System.out.println(+num +"is a power of 2");
		else
			System.out.println(+num +"is not a power of 2");
		
		System.out.println("Do you want to continue: Press 1");
		 ch =sc.nextInt();
		}while(ch ==1);
   
	}
}



/*Enter the number you want to test: 
25
25is not a power of 2
Do you want to continue: Press 1
1
Enter the number you want to test: 
64
64is a power of 2
Do you want to continue: Press 1
2*/