
//Write a program to check the given number is binary number or not?
		
import java.util.*;
public class CheckBinaryNo {
	
	public static boolean checkBin(int no)
	{
		while(no!=0)
			{
			int k;
			k=no%10;
				
				if(k!=0 && k!=1)
				{
					return false;
				}
				no=no/10;
			}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********Check a number is binary or not Program**********");
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int binary,ch;
		do
		{
			System.out.println("Enter the Number");
			binary=sc.nextInt();
		
				if(checkBin(binary))
				{
					System.out.println("Number" + binary +" is a Binary Number");
				}
				else
				{
					System.out.println("Number" + binary +"is not a Binary Number");
				}
			System.out.println("Do you want to continue : Press 1");
			ch=sc1.nextInt();
		}while(ch==1);
	}

}

/*
********Check a number is binary or not Program**********
Enter the Number
1010
Number1010 is a Binary Number
Do you want to continue : Press 1
1
Enter the Number
2145
Number2145is not a Binary Number
Do you want to continue : Press 1
1
Enter the Number
1012
Number1012is not a Binary Number
Do you want to continue : Press 1
*/