//Write a program to implement hashcode and equals.

public class HashCode
{
	 public static void main(String[] args)
	 {  
	        System.out.println("**************Hashcde and Equals Method***********");
	        String a = "Bob";  
	        String b = "Bob";  
	  
	        if(a.equals(b))
	        {     
	            System.out.println("a & b are equal variables, and their respective hashvalues are:" + " "+ a.hashCode() + " & " + b.hashCode());  
	          
	        }  
	  
	        String c = "Maria";  
	        String d= "Julie";  
	  
	        if(!c.equals(d))
	        {    //checking  the equality of objects using equals() method  
	            System.out.println("\nc & d are Un-equal variables, and their respective hashvalues are:" + " "+ c.hashCode() + " & " + d.hashCode());  
	              
	        }  
	    }  
}  

/*
 * **************Hashcde and Equals Method***********
 
a & b are equal variables, and their respective hashvalues are: 66965 & 66965

c & d are Un-equal variables, and their respective hashvalues are: 74113750 & 71933245
*/
