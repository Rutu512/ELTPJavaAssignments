//Write a program to find top two maximum numbers in a array.

import java.util.Scanner;
public class topTwoArrayElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("Enter Size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Sorted Array is");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i] < a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		 
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	
		
		System.out.println("Top Two Array Elements are " +"["+a[0] +", " +a[1] +"]");
		
	}

}

/*
Enter Size of Array
6
Enter Array elements
45
28
75
15
36
95
Sorted Array is
95
75
45
36
28
15
Top Two Array Elements are [95, 75]
 */


