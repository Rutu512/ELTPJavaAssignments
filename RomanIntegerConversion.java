// Given a roman numeral, convert it to an integer

import java.util.*;
public class RomanIntegerConversion {
	
    public static int romanToInt(String s) {

        int sum = 0;
        
        if(s.indexOf("IV") != -1) sum -= 2;
        if(s.indexOf("IX") != -1) sum -= 2;
        if(s.indexOf("XL") != -1) sum -= 20;
        if(s.indexOf("XC") != -1) sum -= 20;
        if(s.indexOf("CD") != -1) sum -= 200;
        if(s.indexOf("CM") != -1) sum -= 200;
        
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'M') sum += 1000;
            if (s.charAt(i) == 'D') sum += 500;
            if (s.charAt(i) == 'C') sum += 100;
            if (s.charAt(i) == 'L') sum += 50;
            if (s.charAt(i) == 'X') sum += 10;
            if (s.charAt(i) == 'V') sum += 5;
            if (s.charAt(i) == 'I') sum += 1;

        }
return sum;
        
     }
    public static void main(String args[])
    {
    	System.out.println("***********Roman Number to Integer Conversion**************\n");
    	Scanner sc=new Scanner(System.in);
    	Scanner sc1=new Scanner(System.in);
    	String n;
    	int ch;
    	do
    	{
    		System.out.println("Enter Roman Number : ");
    		n=sc.nextLine();
    		String nUpper=n.toUpperCase();
 
    		int res=romanToInt(nUpper);
    		System.out.println("Result after Conversion :" +res);
    			
    		System.out.println("Do you want to continue:Press 1");
   			ch =sc1.nextInt();
    	}while(ch==1);
    }
}
        
/*
***********Roman Number to Integer Conversion**************

Enter Roman Number : 
I
Result after Conversion :1
Do you want to continue:Press 1
1
Enter Roman Number : 
IV
Result after Conversion :4
Do you want to continue:Press 1
1
Enter Roman Number : 
VI
Result after Conversion :6
Do you want to continue:Press 1
1
Enter Roman Number : 
IX
Result after Conversion :9
Do you want to continue:Press 1
1
Enter Roman Number : 
XX
Result after Conversion :20
Do you want to continue:Press 1
1
Enter Roman Number : 
D
Result after Conversion :500
Do you want to continue:Press 1
1
Enter Roman Number : 
C
Result after Conversion :100
Do you want to continue:Press 1
1
Enter Roman Number : 
XL
Result after Conversion :40
Do you want to continue:Press 1
1
Enter Roman Number : 
CD
Result after Conversion :400
Do you want to continue:Press 1
 */


