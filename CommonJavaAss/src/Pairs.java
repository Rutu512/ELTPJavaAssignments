/*In an array 1-100 numbers are stored. How would you find all the pairs from
the array whose sum is the given number?*/
		
import java.util.Scanner;

public class Pairs {
	
	public static void pair(int arr[],int sum)
	{
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])==sum)
				{
					System.out.println("Pair is[" +arr[i] +", " +arr[j] +"]" +"=Sum" +sum);
				}
					
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		int a[]={1,2,3,4,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		System.out.println("Enter Sum value:");
		int sum=sc.nextInt();
		pair(a,sum);
	}

}
/*
Enter Sum value:
25
Pair is[1, 24]=Sum25
Pair is[2, 23]=Sum25
Pair is[3, 22]=Sum25
Pair is[4, 21]=Sum25
Pair is[6, 19]=Sum25
Pair is[7, 18]=Sum25
Pair is[8, 17]=Sum25
Pair is[9, 16]=Sum25
Pair is[10, 15]=Sum25
Pair is[11, 14]=Sum25
Pair is[12, 13]=Sum25
Pair is[13, 12]=Sum25
Pair is[14, 11]=Sum25
Pair is[15, 10]=Sum25
Pair is[16, 9]=Sum25
Pair is[17, 8]=Sum25
Pair is[18, 7]=Sum25
Pair is[19, 6]=Sum25
Pair is[21, 4]=Sum25
Pair is[22, 3]=Sum25
Pair is[23, 2]=Sum25
*/
