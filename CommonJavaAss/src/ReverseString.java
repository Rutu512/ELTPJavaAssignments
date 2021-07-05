//Write a program to reverse a string using recursive algorithm.

import java.util.*;
public class ReverseString {
	
public static String reverseString(String str)  
{  
	if(str.isEmpty())  
	{    
		  return str;
	}   
	else   
	{  
		return reverseString(str.substring(1))+str.charAt(0);  
	}  
} 

public static void main(String[] args)   
{  
	System.out.println("**************Reverse String Using Recursion Program***********");  
	Scanner sc=new Scanner(System.in); 
	Scanner sc1=new Scanner(System.in); 
	String s;
	int ch;
		do
		{
			System.out.println("Enter The String");  
			s=sc.nextLine();
			System.out.println("Original String :" +s);  
			String rev=reverseString(s);
			System.out.println("Reversed String :" +rev);   
			System.out.println("Do you want to continue: Press1");   
			ch=sc1.nextInt();
		}while(ch==1);
}  
}

/*
**************Reverse String Using Recursion Program***********
Enter The String
rutuja
Original String :rutuja
Reversed String :ajutur
Do you want to continue: Press1
1
Enter The String
pawar
Original String :pawar
Reversed String :rawap
Do you want to continue: Press1
*/
 

