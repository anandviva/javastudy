package LoopJump;

public class ExampleForLoop {

	public static void main(String[] args) {
	 /* For loop we can use initalization, condition, and inc/dec use the single line
	  * Compare to while and do while, reduce the code allocation
	  * 
	  * Syntax of For loop
	  * 
	  * for(Initialization; condition; inc/dec)
	  * {
	  *   Statements;
	  * }
	  * 
	  * The execution of for loop is 
	  * 
	  * First initialization executes first (First time only), and Condition will exceute, then Statements, after the statement inc/dec will execute
	  *  
	  *  Next iteration Condition -> Statement->Inc/dec -- It will do loop until condition fails
	  * 
	  */
		
		//Print 1 to 10 numbers 
		
		for (int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
		// Print even numbers 1 to 10
		
		for (int j=2;j<=10;j=j+2)
		{
			System.out.println(j);
		}
		
		for (int k=1; k<=10; k++)
		{
			if (k%2==0)
			{
				System.out.println(k + "Even");
			}
			else {
				System.out.println(k + "Odd");
			}
		}
	}

}
