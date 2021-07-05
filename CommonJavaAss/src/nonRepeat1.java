//Find first non repeating character in a string

import java.util.*;
public class nonRepeat1 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s;
	System.out.println("Enter String");
	s= sc.nextLine();
	System.out.println("The given string is: " + s);
  
		for (int i = 0; i < s.length(); i++)
		{
			boolean flag = true;
			for (int j = 0; j < s.length(); j++) 
			{
				if (i != j && s.charAt(i) == s.charAt(j)) 
				{
					flag = false;
					break;
				}
			}
				if (flag)
					{
						System.out.println("The first non repeated character in String is: " + s.charAt(i));
						break;
					}
		}
 }
}

/*
Enter String
ruturaj
The given string is: ruturaj
The first non repeated character in String is: t
*/
 

