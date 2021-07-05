//Check if a given string or number is palindrome or not.

import java.util.*;
public class Palin {
	
	 static boolean Palindrome(String s)
	{
		
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
			return false;
			}
		}
		
		return true;
	}
	 
	 static boolean Palindrome(int a)
	 {
		 int rem;
		 int revnum=0;
		 int temp=a;
		 while(a!=0)
		 {
			 rem=a%10;
			 revnum=revnum*10+rem;
			 a=a/10;
		 }
		 if(temp==revnum)
		 {return true;}
		 else
		 {return false;}
	 
	 }



public static void main(String[] args)
{
			// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	int c,ch;
		do
		{
			System.out.println("Enter your choice");
			System.out.println("1. String Palindrome \n 2. Number Palindrome \n 3. exit");
			c=sc.nextInt();
				switch(c)
					{
						case 1:
							String s;
							System.out.println("Enter String");
							s= sc1.nextLine();
			 
							if(Palindrome(s))
							System.out.println("Entered String is Palindrome");
							else
							{
								System.out.println("Entered String is not a Palindrome");
							}
							break;
							
						case 2:
							int no;
							System.out.println("Enter number");
							no = sc.nextInt();
							if(Palindrome(no))
							System.out.println("Entered Number is Palindrome");
							else
							{
								System.out.println("Entered Number is not a Palindrome");
							}
							break;
	
						default:
							System.out.println("Inavlid choice");
					}
			System.out.println("Do you want to continue:Press 1");
			 ch =sc.nextInt();
			}while(ch ==1);
			
		}
}		


/*
Enter your choice
1. String Palindrome 
 2. Number Palindrome 
 3. exit
1
Enter String
rutuja
Entered String is not a Palindrome
Do you want to continue
1
Enter your choice
1. String Palindrome 
 2. Number Palindrome 
 3. exit
1
Enter String
nayan
Entered String is Palindrome
Do you want to continue: Press 1
1
Enter your choice
1. String Palindrome 
 2. Number Palindrome 
 3. exit
2
Enter number
3456
Entered Number is not a Palindrome
Do you want to continue: Press 1
1
Enter your choice
1. String Palindrome 
 2. Number Palindrome 
 3. exit
2
Enter number
45654
Entered Number is Palindrome
Do you want to continue: Press 1
3
*/