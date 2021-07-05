//Wrie a program to find out duplicate characters in a string.

import java.util.*;
public class duplicateChars {
	
	public static void findDuplicates(String s) 
	{ 
		char c[]=s.toCharArray();
		int count;
		for (int i = 0; i < c.length; i++)
		{
			count=1;
			for (int j = i+1; j < c.length; j++) 
			{
				if ( c[i]==c[j] && c[i]!=' ') 
				{
				count++;
				c[j]='0';
				}
			}
			if(count > 1 && c[i] != '0') 
			{
				System.out.println("Duplicate Chars found in String are : " + c[i]);
			}
		}
	}
		
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s;
	System.out.println("**************Duplicate Characters in String Program***********");
	System.out.println("Enter String");
	s= sc.nextLine();
	System.out.println("The given string is: " + s);
	findDuplicates(s);
	
 }
	
}

/*
**************Duplicate Characters in String Program***********

Enter String
ruturaja
The given string is: ruturaja
Duplicate Chars found in String are : r
Duplicate Chars found in String are : u
Duplicate Chars found in String are : a

 */





