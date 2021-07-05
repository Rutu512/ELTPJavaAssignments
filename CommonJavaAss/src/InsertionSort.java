
//Write a program for Insertion Sort in java.

import java.util.Scanner;
	
public class InsertionSort {
	
	 public static void insertionSort(int array[])
	 {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	 }  

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
			 System.out.println("********Insertion Sort Program*********");
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
		    insertionSort(arr);
		    System.out.println("\n Sorted array Elements:");	
		    	for(i=0;i<n;i++)
		    	{
		    		System.out.print(arr[i] + " ");
		    	}
		   
	}

}

/*
********Insertion Sort Program*********
Enter the Size of Array
7
Enter the Array Elements: 

45
10
25
39
85
12
18
Original Array Elements:
45 10 25 39 85 12 18 
 Sorted array Elements:
10 12 18 25 39 45 85 */