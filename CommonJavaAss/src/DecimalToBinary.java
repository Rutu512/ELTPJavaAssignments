/*
Write a program to convert decimal number to binary format.
&&
Write a program to convert binary to decimal number.
*/

import java.util.*;
public class DecimalToBinary {

	public static void DectoBinary(int decimal)
	{    
	     int binary[] = new int[40];    
	     int index = 0;    
	     	while(decimal > 0)
	     	{    
	     		binary[index++] = decimal%2;    
	     		decimal = decimal/2;    
	     	}    
	     	for(int i = index-1;i >= 0;i--)
	     	{    
	     		System.out.print(binary[i]);    
	     	}    
	     	System.out.println();//new line  
	}
	
	public static void BinarytoDecimal(int binary)
	{    
		String bin=String.valueOf(binary);
		System.out.println(Integer.parseInt(bin, 2));
		
	}    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int dec,binary,choice,ch;
		System.out.println("***********Decimal-Binary & Binary-Decimal Conversion Program*********");
		do
		{
			System.out.println("Enter your Choice: \n 1. Decimal to Binary Conversion \n 2. Binary to Decimal Conversion \n 3. Invalid Choice ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Decimal Number");
				dec=sc.nextInt();
				System.out.println("Decimal Number is: "+dec);
				System.out.println("Binary Number is: ");
				DectoBinary(dec);
				break;
				
			case 2:
				System.out.println("Enter the Binary Number");
				binary=sc1.nextInt();
				System.out.println("Binary Number is: " +binary);
				System.out.println("Decimal Number is: ");
				BinarytoDecimal(binary);
				break;
				
			default:
				System.out.println("Invalid Choice");
				
			}
		
		System.out.println("Do you want to continue: Press 1 ");
		ch=sc.nextInt();
		}while(ch==1);
		
	}

}

/*
***********Decimal-Binary & Binary-Decimal Conversion Program*********
Enter your Choice: 
 1. Decimal to Binary Conversion 
 2. Binary to Decimal Conversion 
 3. Invalid Choice 
1
Enter the Decimal Number
10
Decimal Number is: 10
Binary Number is: 
1010
Do you want to continue: Press 1 
1
Enter your Choice: 
 1. Decimal to Binary Conversion 
 2. Binary to Decimal Conversion 
 3. Invalid Choice 
2
Enter the Binary Number
1010
Binary Number is: 1010
Decimal Number is: 
10
Do you want to continue: Press 1 
1
Enter your Choice: 
 1. Decimal to Binary Conversion 
 2. Binary to Decimal Conversion 
 3. Invalid Choice 
1
Enter the Decimal Number
16
Decimal Number is: 16
Binary Number is: 
10000
Do you want to continue: Press 1 
1
Enter your Choice: 
 1. Decimal to Binary Conversion 
 2. Binary to Decimal Conversion 
 3. Invalid Choice 
2
Enter the Binary Number
10000
Binary Number is: 10000
Decimal Number is: 
16
Do you want to continue: Press 1 
*/