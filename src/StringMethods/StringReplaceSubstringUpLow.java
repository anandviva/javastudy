package StringMethods;

public class StringReplaceSubstringUpLow {

	public static void main(String[] args) {
		
		//7) Replace - To replace the single character/Multiple sequential character in main string
		
		// s.replace('','') Single charc to replace single
		// s.replace("","") Multiple sequential character to replace
		
		String s ="How are you M?";
		System.out.println(s.replace('a','b')); //are will be bre
		System.out.println(s.replace("are","tyu")); // are will be tyu
		
		
		/* Substring method can  extract substring from the mainstring using index
		 * 
		 * Start index is 0
		 * End index  is -1
		 *  s.substring(start index, end index)
		 * */
		
		   String s1 = "Tutorial";
		   System.out.println(s1.substring(1, 5)); // output is utor
		   System.out.println(s1.substring(0, 3));  // output is Tut
		   
		   
		   /* toUppercase and toLowerCase method can change the up to low/low to up
		    * 
		    **/
		   
		   
		   
		   
		   
		

	}

}
