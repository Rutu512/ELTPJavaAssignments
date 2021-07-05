/*Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.*/

import java.util.*;
 
public class TrappingRainWater {
 
    public static int findWater(int arr[], int n)
    {
        int result = 0;
        int left_max = 0, right_max = 0;
        int low = 0;
        int high = n - 1;
 
        while (low<= high) 
        {
            if (arr[low] < arr[high]) 
            {
                if (arr[low] > left_max)
                    left_max = arr[low];
                else
                    result += left_max - arr[low];
                low++;
            }
            else
            {
                if (arr[high] > right_max)
 
                    right_max = arr[high];
                else
                    result += right_max - arr[high];
                high--;
            }
        }
 
        return result;
    }
 
   
    public static void main(String[] args)
    {
        System.out.println("**********Trapping Rain water **************\n");
        int arr[] = {4,2,0,3,2,5};
        int n = arr.length;
        System.out.println("Array is:" +Arrays.toString(arr));
        System.out.println("Maximum water that "
                           + "can be accumulated is "
                           + findWater(arr, n));
    }
}

/*
 * **********Trapping Rain water **************

Array is:[4, 2, 0, 3, 2, 5]
Maximum water that can be accumulated is 9
 */

