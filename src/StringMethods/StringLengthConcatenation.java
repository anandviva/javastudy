package StringMethods;

public class StringLengthConcatenation {

	public static void main(String[] args) {
		
		String s = "July 30th"; 
		//String s = new String("July 30th");
		
		// The above two way we can declare string varibale both are same but some difference are there
		
		//int l = s.length(); // Length returns number so we use int
		//System.out.println(l);
		
		System.out.println(s.length()); // we can directly write the length method like this 
		System.out.println("July 30th".length()); // We can write the string value here and add length method
		
		
		/* concat() method is use for joining the strings
		 * 
		 * Generally we can use the '+' for joing the strings 
		 * But in String we have method is called cancat() to join the two strings
		 * 

		 *  
		 *  
		 *  */
		
		  String s1 = "How";
		  String s2 ="Are";
		  String s3 ="You";
		  
		  System.out.println(s1+s2); //To join the strings
		  System.out.println(s1.concat(s2)); // Use cancat method to join the two strings
		  
		  System.out.println(s1+s2+s3); 
		  System.out.println(s1.concat(s2).concat(s3)); // if it's more than two strings we have to write like this 
		  System.out.println(s1.concat(s2+s3));// Like this also
		  
		  System.out.println("How"+"Are"+"You"); // can directly write string value here
		  System.out.println("How".concat("Are").concat("you").concat("JK")); 
		  
		  
		  

	}

}
