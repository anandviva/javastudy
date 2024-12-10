package StringMethods;

public class StringContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*   contains - check the valuse part of main string and returns the True/false
		 *   Ex: Welcome string  come is the part (Welcome contains come)
		 *       Welcome.contains(come)
		 *       Method check the lower case and upper the case sensitive.. 
		 *       		 * 
		 *  */

		
		 String s = "HelloRaj";
		 
		 System.out.println(s.contains("Raj")); //True
		 System.out.println(s.contains("lloR")); //True
		 System.out.println(s.contains("hello")); //False bcz not exacatly like same (case sensitive)
		 System.out.println(s.contains("Helo")); // False bcz string should be squentials if not false
		 
		 

			/*   equals and equalsIgnoreCase - Comparing the strings
			 *   equals() method check the two string equal with case senstive 
			 *   equalsIgnoreCase() method check the two string equal without case senstive
			 *  */
		 
		 String s1 = "Amazon";
		 String s2 = "Amazon";
		 
		 System.out.println(s1.equals(s2)); //True
		 System.out.println(s1.equals("amazon")); //False bcz case sensitive
		 System.out.println(s1.equalsIgnoreCase("amazon")); //True no need to check case sensitive
		 
		 
		 
		 
				 
		 
	}

}
