package StringMethods;

public class StringTrim {

	public static void main(String[] args) {
  
		//trim () method

		String s ="    Later    ";
		
		System.out.println(s);
		System.out.println("Befor trim" + s.length());
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println("After trim" + s.trim().length()); //Can use the method sequentially
		
		// charAt - Return character based on the index
		
		String s1 = "Hello";
		
		System.out.println(s1.charAt(0)); // Return H from the Hello
		System.out.println(s1.charAt(4)); // Return o from the Hello
		

	}

}
