//Write a program to remove duplicates from sorted array.

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateSortedArrElements 
{
	
	public static Set<Integer> removeDuplicates(int input[]) 
	{ 
		Set<Integer> distinct = new HashSet<Integer>(); 
		for (int i = 0; i < input.length; i++) 
		{ 
			for (int j = 1; j < input.length; j++)
			{ 
				if (input[i] != input[j] && i != j) 
				{ 
					distinct.add(input[i]); 
					break; 
				} 
			}
		} 
	return distinct;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********Remove Duplicate Elements From Sorted Araay*****");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array:");
		int n=sc.nextInt();
		int input[]=new int[n];
		System.out.println("Enter Array elements:");
		for(int i=0;i<n;i++)
		{
			input[i]=sc.nextInt();
		}
		Arrays.sort(input);
		
		Set<Integer> distinct=removeDuplicates(input);
		System.out.println("Original elements in array are : "+ Arrays.toString(input));

		System.out.println("Distinct elements found in array are : " + distinct);
		
	}

}

/*
*********Remove Duplicate Elements From Sorted Araay*****
Enter size of Array:
7
Enter Array elements:
45
12
85
46
46
25
25
Original elements in array are : [12, 25, 25, 45, 46, 46, 85]
Distinct elements found in array are : [85, 25, 12, 45, 46]
*/
