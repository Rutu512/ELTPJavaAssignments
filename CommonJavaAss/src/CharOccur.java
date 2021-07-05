//Count the occurrance of given character in a string

import java.util.Scanner;

public class CharOccur {
	public static int findcount(String s, char c)
	{
		int count =0;
		int i;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i) ==c)
			{
				count++;
			}
		}
		return count;
	}


public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	
	int ch;
	String s;
	char c;
	System.out.println("Enter String");
	s= sc.nextLine();
		do
		{
		System.out.println("Enter character of which occurance is to be finded");
		c= sc.next().charAt(0);
		System.out.println("Character" +" " +c +" " +"occured" +" "+findcount(s,c)+" " +"times" );
		
		System.out.println("Do you want to continue: Press1");
		 ch =sc.nextInt();
		}while(ch ==1);
	}

}


/*
Enter String
rutuuuja
Enter character of which occurance is to be finded
u
Character u occured 4 times
Do you want to continue
1
Enter character of which occurance is to be finded
r
Character r occured 1 times
Do you want to continue
1
Enter character of which occurance is to be finded
t
Character t occured 1 times
Do you want to continue
2
*/