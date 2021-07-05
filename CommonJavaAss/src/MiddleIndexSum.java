
//Find out middle index where sum of both ends are equal.

public class MiddleIndexSum {

    public static int findMiddleIndex(int[] array) throws Exception {

        int endIndex = array.length - 1;
        int startIndex = 0;
        int leftSum = 0;
        int rightSum = 0;
        while (true) {
            if (leftSum > rightSum) {
                rightSum += array[endIndex--];
            } else {
                leftSum += array[startIndex++];
            }
            if (startIndex > endIndex) {
                if (leftSum == rightSum) {
                	System.out.println("Sum=" +leftSum);
                    break;
                } else {
                    throw new Exception(
                            "No such combination found in the array.");
                }
            }
        }
        return endIndex;
    }

    public static void main(String[] args) {
    	System.out.println("********Middle index where sum of both ends are equal Prgram ******* "); 
        int[] array = {1,7,5,2,8,3 };
        try {
            int index = findMiddleIndex(array);
            System.out.println("Sum preceding the index " + index + " is equal to sum succeeding the index " + index);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
/*
********Middle index where sum of both ends are equal Prgram ******* 
Sum=13
Sum preceding the index 2 is equal to sum succeeding the index 2
*/