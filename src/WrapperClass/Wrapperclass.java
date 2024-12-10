package WrapperClass;

public class Wrapperclass {
	
	/*  Wrapper class are below
	 * 
	 *    
	 * 
	 *    for Every primitivr data type one wrapper class is there
	 *        int ->Integer
	 *        float -> Float
	 *        double -> Double
	 *        char -> Character
	 *        
	 *        String is inbuild class
	 *        String s = new String ("Hi");
	 *        the same thing we achieve using wrapper class 
	 *        Integer i = new Integer(5);
	 *        
	 *    Integer is wrapper class 
	 *     
	 *     Wrapper class is uder for create obj var and coverting data one datatype to another
	 *     
	 *     Very frequently we are using this wrapper class. web element we can ready only by string
	 *     
	 *      Sceanario 1 : String --> int,double,float,boolean
	 *     
	 *      String --> int          Integer.parseInt(String val)
	 *      String --> double       Double.parseDouble(String val)
	 *      String --> float        Float.parseFloat(String val)
	 *      String --> boolean      Boolean.parseBoolen(String val)
	 *      
	 *      String --> char not possible
	 *      
	 *      Sceanario 1 : Any data type --> String 
	 *      String.valueOf() -> Convert all data types into String
	 *      
	 *    
	 *    
	 */

	public static void main(String[] args) {
		/*
		
		//  String --> Int
		
		// String s = "Welcome"; // Can't convert into string because value should be in integer 
		String s1 = "123";
		String s2 = "234";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
	//  String --> Double
		String s3 = "78.5";
		String s4 = "85.5";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		
		//String --> Boolean
		String s6 = "true"; // Other than true, if we pass the string that will return false
		System.out.println(Boolean.parseBoolean(s6));
		
		
		*/
		
		
		// Scenario 2 -> int, docuble, char, boolean to string
		
		 int i =45;
		 double d =6.7;
		 char c = 'e';
		 boolean b = true;
		 
		 String s = String.valueOf(i);
		 System.out.println(s);
		 
		 s = String.valueOf(d);
		 System.out.println(s);
		 
		 s = String.valueOf(c);
		 System.out.println(s);
		 
		 s = String.valueOf(b);
		 System.out.println(s);
		 
				 

	}

}
