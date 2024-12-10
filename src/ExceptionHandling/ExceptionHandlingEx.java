package ExceptionHandling;

import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		
		
		System.out.println("Program started");
		
		Scanner sc = new Scanner(System.in); // Runtime value 
		
		
		// Example 1 - Arithamactic exception
		/*System.out.println("Enter the number:" ); // When I enter the 0
		int num = sc.nextInt(); 
		System.out.println(100/num); // aRithmatic exception
		*/
		
		
		// Example 2 - ArrayOutOfBound exception
		
	/*	int a[] = new int[5];
		System.out.println("Enter the position (o to 4):" ); // Should enter the position 0 to 4 will be valid
		int pos = sc.nextInt(); 
		
		System.out.println("Enter the values:" ); // Should enter the position 0 to 4 will be valid
		int value = sc.nextInt(); 
		
		a[pos] = value;
		
		System.out.println(a[pos]);
		
		
	
		// Example 3 -  NumberFormatException
		
		String s ="Hello";
		int num = Integer.parseInt(s);
		System.out.println(num);
		
		

		// Example 4 -  Null PointerException
		String s = null;
		int num = s.length();
		System.out.println(num);
		
		System.out.println("Program completed");
	
	*/
		
		
		
		
		// try block , we nned to write the statement which will cause the exception , if we don't know which part we can write whole
		try
		{
			String s = null;
			int n = s.length();
			System.out.println(n);// This will make exception
		}
		catch(NullPointerException e) // If exeception found catch block will exceute. if no exception catch will skip
		{
			System.out.println("exception handled");// user defined message
			System.out.println(e.getMessage()); // to explain the exception message
			
			
		}
		catch(ArithmeticException e) // we can write the more than 1 catch block for try which ever the exception suitable that will execute
		{
			System.out.println("exception handled");
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("Program Completed");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
