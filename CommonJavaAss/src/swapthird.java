//How to swap 2 integers without using a temporary variable?

import java.util.*;
public class swapthird {
	public static void swap(int first,int second)
	{
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println("After Swapping : \n First Number" +first +"\n Second Number" +second);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,second;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 1st number");
		first=sc.nextInt();
		System.out.println("enter 2nd number");
		second=sc.nextInt();
		System.out.println("Before Swapping : \n First Number" +first +"\n Second Number" +second);
		swap(first,second);	

	}

}
/* enter 1st number
10
enter 2nd number
20
Before Swapping : 
 First Number10
 Second Number20
After Swapping : 
 First Number20
 Second Number10
*/