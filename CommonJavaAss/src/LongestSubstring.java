import java.util.LinkedHashMap;
import java.util.*; 
public class LongestSubstring
{ 
    static void longestSubstring(String inputString)
    {
         char[] charArray = inputString.toCharArray();
         String longestSubstring = null;
         int longestSubstringLength = 0;
         
        //Creating LinkedHashMap with characters as keys and their position as values.
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
     
        for (int i = 0; i < charArray.length; i++) 
        {
            char ch = charArray[i];
         
            //If ch is not present in charPosMap, adding ch into charPosMap along with its position
             
            if(!charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }
             
            //If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap
             
            else
            {   
                i = charPosMap.get(ch);
                 
                charPosMap.clear();
            }
             
             
            if(charPosMap.size() > longestSubstringLength)
            {
                longestSubstringLength = charPosMap.size();
                 
                longestSubstring = charPosMap.keySet().toString();
            }
        }
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("The longest substring : "+longestSubstring);
         
        System.out.println("The longest Substring Length : "+longestSubstringLength);
    }
     
    public static void main(String[] args) 
    {   
        System.out.println("***********Longest Substring without Repeating characters*******\n");
        int ch;
        Scanner sc=new Scanner(System.in);
        do
        {
        	System.out.println("Enter string:");
        	String ss=sc.nextLine();
        	longestSubstring(ss);
        	
        	System.out.println("Do you want to continue:Press 1");
			 ch =sc.nextInt();
        }while(ch ==1);
    }   
}

/*
***********Longest Substring without Repeating characters*******

Enter string:
rutujapawar
Input String : rutujapawar
The longest substring : [t, u, j, a, p]
The longest Substring Length : 5
Do you want to continue:Press 1
*/
