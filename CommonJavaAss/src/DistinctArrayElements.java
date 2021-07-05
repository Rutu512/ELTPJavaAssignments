//How to get distinct elements from an array by avoiding duplicate elements?

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class DistinctArrayElements {
	
	public static Set<Integer> findDistinct(int input[]) 
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
		System.out.println("*********Ditinct Araay Elements*****");
		int input[]={1,2,2,3,4,5,6,6,8,9,10};
		Set<Integer> distinct=findDistinct(input);
		System.out.println("Original elements in array are : "+ Arrays.toString(input));

		System.out.println("Distinct elements found in array are : " + distinct);
		
	}

}

/*
 *********Ditinct Araay Elements*****
Original elements in array are : [1, 2, 2, 3, 4, 5, 6, 6, 8, 9, 10]
Distinct elements found in array are : [1, 2, 3, 4, 5, 6, 8, 9, 10]
*/
 


