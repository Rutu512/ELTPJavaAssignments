//Write a program to implement ArrayList.

import java.util.*;  

class Book 
{  
	int id;  
	String name,author,publisher;  
	int quantity;  
	
	public Book(int id, String name, String author, String publisher, int quantity)
	{  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
	}  
}  

public class ArrayListImplementation
{   
	public static void main(String[] args) 
	{    
		System.out.println("**************ArrayList Implementation*************** \n");
				
		List<Book> list=new ArrayList<Book>();  
    
		Book b1=new Book(101,"C++","bBalguru Swamyr","Mchill",3);
		Book b2=new Book(102,"Operating System","Galvin","Wiley",6);
		Book b3=new Book(103,"Let us C","Yashwant Kanetkar","BPB",8);  
		Book b4=new Book(104,"Data Communications and Networking","Forouzan","Mc Graw Hill",4); 
		Book b5=new Book(105,"RDBMS","Kadam","Techmax",10);
		Book b6=new Book(106,"Python","Galhit","BP",7);
		
		//Determine arraylist is empty r not
		System.out.println("Is ArrayList Empty: "+list.isEmpty() +"\n");  
		  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    System.out.println("Added using add() and addAll() method \n");
    
    //Adding second list elements to the first list
    
    ArrayList<Book> list2=new ArrayList<Book>();  
    list2.add(b3);  
    list2.add(b4);
    list.addAll(list2);  
    list.add(b5);  
    list.add(b6);
   // System.out.println("Added using addall() method");
    
    //Traversing list  
    for(Book b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
    
    //Removing specific element from arraylist  
    list.remove(b1); 
    
    ////Removing all the new elements from arraylist  
    ArrayList<Book> list3=new ArrayList<Book>();  
    list3.add(b5);  
    list3.add(b6);
    list.addAll(list3);
    list.removeAll(list3);    
    System.out.println("Removed using remove() and removeAll() method\n ");
    
    //Traversing list  
    for(Book b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    } 
    
    System.out.println("\n Is ArrayList Empty: "+list.isEmpty() +"\n");
    
  //Removing all the elements available in the list  
    list.clear();  
    System.out.println("After invoking clear() method: "+list);  
}

}

/*
**************ArrayList Implementation*************** 

Is ArrayList Empty: true

Added using add() and addAll() method 

101 C++ bBalguru Swamyr Mchill 3
102 Operating System Galvin Wiley 6
103 Let us C Yashwant Kanetkar BPB 8
104 Data Communications and Networking Forouzan Mc Graw Hill 4
105 RDBMS Kadam Techmax 10
106 Python Galhit BP 7
Removed using remove() and removeAll() method
 
102 Operating System Galvin Wiley 6
103 Let us C Yashwant Kanetkar BPB 8
104 Data Communications and Networking Forouzan Mc Graw Hill 4

 Is ArrayList Empty: false

After invoking clear() method: []
*/