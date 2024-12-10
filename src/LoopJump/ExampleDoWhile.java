package LoopJump;

public class ExampleDoWhile {

	public static void main(String[] args) {
		/* do while Syntax
		 * 
		 * 
		 * do 
		 * { 
		 * statements;   //Execute the statement once
		 * inc/dec;     
		 * 
		 * }While (Condition);   //After that check the condition
		 */
          
		// Example of 1 to 10.
		
		int i =1;
		do {
			System.out.println(i);   //First it print the statement and now i value is 1 so print 1 first
			i++; //i got incremented and i value is 2 now
		}
		while (i<=10);  // Now the i = 2, so it's less than 10. Once condition is true again it will go to the do block and statement will execute
	}

}
