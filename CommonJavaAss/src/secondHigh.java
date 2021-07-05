//How would you find second highest number in an integer array?

import java.util.*;
public class secondHigh {

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
	
		
		System.out.println("Second Highest Array Element is " +a[1]);
		
	}

}

/*Enter Size of Array
5
Enter Array elements
10
53
24
46
29
Sorted Array is
53
46
29
24
10
Second Highest Array Element is 46*/