//Write program to write all permutations of a string (Iteratively or recursively)

public class Permute {

	public static void main(String[] args)  
    {  
        String str = "ABHI";  
        int len = str.length();  
        System.out.println("All the permutations of the string are: ");  
        generatePermutation(str, 0, len);  
    }  
	 public static void generatePermutation(String str, int start, int end)  
	    {    
	        if (start == end-1)  
	            System.out.println(str);  
	        else  
	        {  
	            for (int i = start; i < end; i++)  
	            {    
	                str = swapString(str,start,i);     
	                generatePermutation(str,start+1,end);    
	                str = swapString(str,start,i);  
	            }  
	        }  
	    }  
	public static String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  
      
    
      
    //Function for generating different permutations of the string  
   
}
/*All the permutations of the string are: 
ABHI
ABIH
AHBI
AHIB
AIHB
AIBH
BAHI
BAIH
BHAI
BHIA
BIHA
BIAH
HBAI
HBIA
HABI
HAIB
HIAB
HIBA
IBHA
IBAH
IHBA
IHAB
IAHB
IABH
*/