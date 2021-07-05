/*Write a program to find if 2 strings are anagrams or not? (String are called
anagram, if they contains same characters but on different order)*/
		
import java.util.*;
public class anagram {
	public static boolean findAnagrams(String s1, String s2)
	{
		int i,j;
		int s1len= s1.length();
		int s2len= s2.length();
		char sarr1[]=s1.toCharArray();
		char sarr2[]=s2.toCharArray();
		
		if(s1len!=s2len)
		{
			return false;
		}
			Arrays.sort(sarr1);
			Arrays.sort(sarr2);
			
			for (i = 0; i < s1len; i++)
			{
				if (sarr1[i] != sarr2[i])
				{
					return false;
				}
			}
			return true;
		
	}
						
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		String s1;
		String s2;
		
		System.out.println("Enter string 1");
		s1=sc.nextLine();
		System.out.println("Enter string 2");
		s2=sc1.nextLine();
			if(findAnagrams(s1,s2))
			{
				System.out.println("Both Strings are anagrams");
			}
			else
			{
				System.out.println("Both Strings are not anagrams");
			}
	}

}
/*Enter string 1
stop
Enter string 2
pots
Both Strings are anagrams
*/
