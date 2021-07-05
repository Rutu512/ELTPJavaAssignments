/* In an array 1-100 numbers are stored. However, one number is missing. How
will you find the missing number?*/

import java.util.Arrays;

public class MissingElement {

	public static int findMissing(int input[]) 
	{ 
		int n=input.length+1;
        int sum=n*(n+1)/2;
        int remSum=0;
        for (int i = 0; i < input.length; i++) {
            remSum+=input[i];
        }
        int missingNumber=sum-remSum;
        return missingNumber;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]={1,2,3,4,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		int miss= findMissing(input);
		System.out.println("Original elements in array are : "+ Arrays.toString(input));
		System.out.println("Missing element in array is : "+ miss);	
	}

}

/*
 Original elements in array are : [1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
Missing element in array is : 5*/


