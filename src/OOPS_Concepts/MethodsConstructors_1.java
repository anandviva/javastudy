package OOPS_Concepts;

public class MethodsConstructors_1 {
	
	/*
	 * Methods
	 * Block or group of statements which will perform certain task
	 * 
	 * Methods Types
	 * 
	 * No params - No return value
	 * No params - return value
	 * Takes params - No return value
	 * Takes params - return value
	 * 
	 * String s = new string("Good");
	 * 
	 * s.length() - No param but return the length of the string
	 * s.substring(2,5) - Param als returns the value
	 * 
	 */
	
	// No param no return value
	
	void m1()  // If it doesn't return value we use void 
	{
		
		System.out.println("How are you");
	
	}

	
	// No param return value 
	
	String m2()
	{
		return ("How are you Sujay");
	}
	
	// Param and no return value
	
	void m3(String sname)
	
	{
		System.out.println("Hey"+ sname);
	}
	// Param and return value
	
	String m4(String sname2) {
		return ("Hey"+ sname2);	

	}
	
	public static void main(String[] args)
	{
	
		MethodsConstructors_1 mc = new MethodsConstructors_1();
		    mc.m1(); // object can call directly to the method
		    String k = mc.m2(); // It returns the value so can't directly call object for print 
		    System.out.println(k); // we store any string value and print sys. or directly put into print statement
		    mc.m3("Rohit"); // Pram passed in the method so we need to pass value in Constructor
		    String j = mc.m4("Arun");
		    System.out.println(j);
		    
	}
}
