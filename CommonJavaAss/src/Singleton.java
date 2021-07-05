
 class Singleton 
 {
	    private static Singleton single_instance = null;
	  
	    public String s;
	  
	    private Singleton()
	    {
	        s = "Hello I am a string part of Singleton class";
	    }
	  
	    // static method to create instance of Singleton class
	    public static Singleton getInstance()
	    {
	        if (single_instance == null)
	            single_instance = new Singleton();
	  
	        return single_instance;
	    }
	}
	  
	class test
	{
	    public static void main(String args[])
	    {
	       
	        Singleton x = Singleton.getInstance();
	        Singleton y = Singleton.getInstance();
	        Singleton z = Singleton.getInstance();
	 
	        x.s = (x.s).toUpperCase();
	  
	        System.out.println("String from x is " + x.s);
	        System.out.println("String from y is " + y.s);
	        System.out.println("String from z is " + z.s);
	        System.out.println("\n");
	  
	        z.s = (z.s).toLowerCase();
	  
	        System.out.println("String from x is " + x.s);
	        System.out.println("String from y is " + y.s);
	        System.out.println("String from z is " + z.s);
	    }
	}

/*
	String from x is HELLO I AM A STRING PART OF SINGLETON CLASS
	String from y is HELLO I AM A STRING PART OF SINGLETON CLASS
	String from z is HELLO I AM A STRING PART OF SINGLETON CLASS


	String from x is hello i am a string part of singleton class
	String from y is hello i am a string part of singleton class
	String from z is hello i am a string part of singleton class*/