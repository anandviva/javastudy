package ExceptionHandling;

import java.util.Scanner;

public class ExceptionandlingEx2 {
	
	/*  try
	 *   {
	 *   }
	 *  catch (Exception e)
	 *  {
	 *  }
	 *  
	 *  Generally we use this for unchecked exception means run time errors
	 * 
	 * 
	 * 
	 */


	public static void main(String[] args) {
		
		 System.out.println("Program started");
			
			Scanner sc = new Scanner(System.in); 
			
			try
			{
			 
			System.out.println("Enter the number:" );
			int num = sc.nextInt(); 
			System.out.println(100/num); 
			
			}
			// If we can't sure which exception will cause at that time we should use Exception
			catch (Exception e)
			{
				System.out.println("Exception handled" );
				System.out.println(e.getMessage());
			}

		}
      
	

	}
