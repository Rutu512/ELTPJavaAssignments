//Write a program to find common elements between two arrays.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class CommonElem {

	public static Set<Integer> findCommon(int input1[], int input2[]) 
	{ 
		Set<Integer> common = new HashSet<Integer>(); 
		for (int i = 0; i < input1.length; i++) 
		{ 
			for (int j = 0; j < input2.length; j++)
			{ 
				if (input1[i] == input2[j] && i != j) 
				{ 
					common.add(input1[i]); 
					break; 
				} 
			}
		} 
	return common;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("************Common Elements in two Arrays Program*************");
		System.out.println("Enter Size of array1:");
		int n1=sc.nextInt();
		int input1[]=new int[n1];
		System.out.println("Enter Array1 elements");
			for(i=0;i<n1;i++)
			{
				input1[i]=sc.nextInt();
			}	
		System.out.println("Enter Size of array2:");
		int n2=sc.nextInt();
		int input2[]=new int[n2];
		System.out.println("Enter Array2 elements");
			for(i=0;i<n2;i++)
			{
				input2[i]=sc.nextInt();
			}
		
		Set<Integer> common=findCommon(input1,input2);
		System.out.println("Original elements in array1 are : "+ Arrays.toString(input1));
		System.out.println("Original elements in array1 are : "+ Arrays.toString(input2));
		System.out.println("Common Elements in Both Array are : " + common);
		
	}

}


/*
************Common Elements in two Arrays Program*************
Enter Size of array1:
4
Enter Array1 elements
45
12
36
54
Enter Size of array2:
4
Enter Array2 elements
36
45
78
98
Original elements in array1 are : [45, 12, 36, 54]
Original elements in array1 are : [36, 45, 78, 98]
Common Elements in Both Array are : [36, 45]
*/
