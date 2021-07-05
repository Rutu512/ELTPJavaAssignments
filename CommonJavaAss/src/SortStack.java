import java.util.Stack;
 
public class SortStack {
 
    public static Stack<Integer> sortStack(Stack<Integer> input)
    {
         
        Stack<Integer> tmpStack = new Stack<Integer>();
        System.out.println("***************************");
        
        while(!input.isEmpty()) 
        {
            int tmp = input.pop();
            System.out.println("Element taken out: "+tmp);
            while(!tmpStack.isEmpty() && tmpStack.peek() > tmp) 
            {
                input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
            System.out.println("input: "+input);
            System.out.println("tmpStack: "+tmpStack);
        }
        System.out.println("*******************************");
        return tmpStack;
    }
     
    public static void main(String a[])
    {
    	 System.out.println("**************Sort the Stack using Temporary Stack*****************");
        Stack<Integer> input = new Stack<Integer>();
        input.add(25);
        input.add(3);
        input.add(32);
        input.add(78);
        input.add(12);
        
        System.out.println("input: "+input);
        System.out.println("final sorted list: "+sortStack(input));
    }
}

/*
*************Sort the Stack using Temporary Stack*****************
input: [25, 3, 32, 78, 12]
***************************
Element taken out: 12
input: [25, 3, 32, 78]
tmpStack: [12]
Element taken out: 78
input: [25, 3, 32]
tmpStack: [12, 78]
Element taken out: 32
input: [25, 3, 78]
tmpStack: [12, 32]
Element taken out: 78
input: [25, 3]
tmpStack: [12, 32, 78]
Element taken out: 3
input: [25, 78, 32, 12]
tmpStack: [3]
Element taken out: 12
input: [25, 78, 32]
tmpStack: [3, 12]
Element taken out: 32
input: [25, 78]
tmpStack: [3, 12, 32]
Element taken out: 78
input: [25]
tmpStack: [3, 12, 32, 78]
Element taken out: 25
input: [78, 32]
tmpStack: [3, 12, 25]
Element taken out: 32
input: [78]
tmpStack: [3, 12, 25, 32]
Element taken out: 78
input: []
tmpStack: [3, 12, 25, 32, 78]
*******************************
final sorted list: [3, 12, 25, 32, 78]
 */

