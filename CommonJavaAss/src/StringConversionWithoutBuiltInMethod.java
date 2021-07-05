//Write a program to convert string to number without using Integer.parseInt() method.

import java.util.*;
public class StringConversionWithoutBuiltInMethod 
{
	public static void convert(String s) 
	{ 
	    int num = 0; 
	    int n = s.length(); 
	  
	    for(int i = 0; i < n; i++) 
	    {
	    	num = num * 10 + ((int)s.charAt(i) - 48); 
	    }
	    System.out.print("Conversion of String to number" +num); 
	} 
	  

	public static void main(String[] args) 
	{ 
		System.out.print("**********Conversion of String to number********\n");
		Scanner sc=new Scanner(System.in);
	    String s;
	    System.out.println("Enter number: ");
	    s=sc.nextLine(); 
	    convert(s); 
	} 
}

/*
**********Conversion of String to number********
Enter number: 
1546
Conversion of String to number1546
*/