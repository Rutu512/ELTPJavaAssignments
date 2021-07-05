//Write a program to find all prime number up to a given numbers?

import java.util.Scanner;  
public class PrimeNo {
   public static void main(String[] args) {  
       Scanner sc = new Scanner(System.in);    
       System.out.print("Enter the range number : ");  
       int end = sc.nextInt();  
       System.out.println("List of prime numbers between 1" + " and " + end);  
       for (int i = 1; i <= end; i++) {  
           if (isPrime(i)) {  
               System.out.println(i);  
           }  
       }  
   }  
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
} 
/*Enter the range number : 30
List of prime numbers between 1 and 30
2
3
5
7
11
13
17
19
23
29
*/

