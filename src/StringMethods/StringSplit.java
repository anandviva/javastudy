package StringMethods;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		
		/*split method is split the string into multiple part based on the delimeter
		 * 
		 * split method always stored in array varialble
		 *  s.split(delimeter)
		 *  String a[] = s.split(delimeter);
		 * 
		 */
		
		  String s ="anand@gmail.com";
		  
		  String a[] = s.split("@"); //After split anand is 0 index and gmail.com is 1 index
		  System.out.println(a[0]);
		  System.out.println(a[1]);
		  System.out.println(Arrays.toString(a));  //Arrays to string  [anand, gmail.com]
		  
		 

	}

}
