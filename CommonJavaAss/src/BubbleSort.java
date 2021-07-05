
//Write a program for Bubble Sort in java.

import java.util.*;
public class BubbleSort {
	public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
	 public static void main(String args[])
	    {
		 System.out.println("********Bubble Sort Program*********");
		 Scanner sc=new Scanner(System.in);
		 int n,i;
		 System.out.println("Enter the Size of Array");
		 n=sc.nextInt();
		 int arr[] = new int[n];
		 System.out.println("Enter the Array Elements: \n");
		 	for(i=0;i<n;i++)
		 	{
		 		arr[i]=sc.nextInt();
		 	}
		 System.out.println("Original Array Elements:");
		 	for(i=0;i<n;i++)
		 	{
		 		System.out.print(arr[i] + " ");
		 	}
	    bubbleSort(arr);
	    System.out.println("\n Sorted array Elements:");	
	    	for(i=0;i<n;i++)
	    	{
	    		System.out.print(arr[i] + " ");
	    	}
	    }
}

/*
*******Bubble Sort Program*********
Enter the Size of Array
6
Enter the Array Elements: 

24
10
54
19
58
21
Original Array Elements:
24 10 54 19 58 21 
 Sorted array Elements:
10 19 21 24 54 58 
*/