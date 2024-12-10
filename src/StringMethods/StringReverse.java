package StringMethods;

public class StringReverse {

	public static void main(String[] args) {
		
		
		/* Revere String method is reverse the letter 
		 *  "Welcome" will be "emoclew"
		 *  We can achieve using lenghth and caAt method 
		 *  Length will find the number of letters and CharAt will find the index of the character
		 *  
		 * 
		 */
		     String s = "Hello";
		     String rev = ""; // just for print in future
		     
		    for (int i = s.length()-1; i>=0; i--) // Length is 5 but the char starts from 0 to 4. so we write 1 minus to get the 'o' value
		    {
		    	System.out.println(s.charAt(i));
		    }
		     
		    // if want to concate the string we can achieve follow
		    
		    for (int i = s.length()-1; i>=0; i--) 
		    {
		    	rev = rev+s.charAt(i);
		    }
		    System.out.println("Reverse the string is:" + rev);
		    

	}

}
