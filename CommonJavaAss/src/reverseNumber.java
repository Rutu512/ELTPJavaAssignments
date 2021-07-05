
//Write a program to reverse a number.

import java.util.*;
public class reverseNumber {
	
	public static int reverse(int n)
	{
		int rem;
		int revsum=0;
		while(n!=0)
		{
		rem=n%10;
		revsum=10*revsum+rem;
		n=n/10;
		}
		return revsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("***********Reverse NUmber Program *******");
		do
		{
		System.out.println("Enter Number :");
		no=sc.nextInt();
		System.out.println("Original Number :" +no);
		int revno=reverse(no);
		System.out.println("Reverse Number :" +revno);
		System.out.println("Do you want to continue: Press 1");
		ch=sc.nextInt();
		}while(ch==1);

	}

}
/*
***********Reverse NUmber Program *******
Enter Number :
102
Original Number :102
Reverse Number :201
Do you want to continue: Press 1
1
Enter Number :
546
Original Number :546
Reverse Number :645*/