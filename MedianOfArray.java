/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two
sorted arrays.*/

import java.util.*;
public class MedianOfArray {
	public static double median(int numArray[])
	{
		double median;
		if (numArray.length % 2 == 0)
		    median = ((double)numArray[numArray.length/2] + (double)numArray[numArray.length/2 - 1])/2;
		else
		    median = (double) numArray[numArray.length/2];
		
		return median;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****Median of Two Sorted Arrays*****\n");
		int m,n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array1");
		m=sc.nextInt();
		int arr1[]=new int[m];
		System.out.println("Enter Array elements");
		for(i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Size of Array2");
		n=sc.nextInt();
		int arr2[]=new int[n];
		System.out.println("Enter Array elements");
		for(i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		
		int length=arr1.length+arr2.length;
		int[] mergedArray = new int[length];   
		Arrays.sort(arr1);

		Arrays.sort(arr2);
		int pos = 0;  
		for (int element : arr1) 
		{  
		mergedArray[pos] = element;  
		pos++;              //increases position by 1  
		}  
		for (int element : arr2)   
		{  
		mergedArray[pos] = element;  
		pos++;  
		} 
		Arrays.sort(mergedArray);
		System.out.println("Merged Array is " +Arrays.toString(mergedArray));
		double result=median(mergedArray);
		System.out.println("Median is:" +result);

	}

}
/*
****Median of Two Sorted Arrays*****

Enter Size of Array1
3
Enter Array elements
40
10
30
Enter Size of Array2
3
Enter Array elements
50
20
60
Merged Array is [10, 20, 30, 40, 50, 60]
Median is:35.0


****Median of Two Sorted Arrays*****

Enter Size of Array1
3
Enter Array elements
50
10
40
Enter Size of Array2
4
Enter Array elements
60
20
30
70
Merged Array is [10, 20, 30, 40, 50, 60, 70]
Median is:40.0
*/
