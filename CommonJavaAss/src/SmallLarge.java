//How would you find smallest and largest numbers in an array?

import java.util.Scanner;
public class SmallLarge {

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
				if(a[i] > a[j])
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
	
		
		System.out.println("Smallest Array Element is " +a[0]);
		System.out.println("Largest Array Element is " +a[n-1]);
		
	}

}

/*Enter Size of Array
4
Enter Array elements
15
52
33
68
Sorted Array is
15
33
52
68
Smallest Array Element is 15
Largest Array Element is 68
*/

