package ExceptionHandling;

public class TryCatchFinally {
	
	
	/*  We can use this for unchecked exception and we can get this only runtime Java compiler can't identified
	 * 
	 *  try
	 *   {
	 *   }
	 *  catch (Exception e)
	 *  {
	 *  }
	 * finaly 
	 * {
	 * }
	 * 
	 * Finally block is optional one for exception handling and it always execute, doen't matter exception occurs or not 
	 * 
	 *  Normally if any exception occurs catch block wil execute and remaining part of the code also execute
	 *  If any exception doen't occurs catch block will skip and remaining part of the code also execute
	 *  
	 *  Case 1 -> Exception occurred, Catch block handled --> Final block executes
	 *  Case 2 -> Exception occurred, Catch block NOT handled --> Final block executes
	 *  Case 3 -> Exception Not occurred, Catch block Skipped --> Final block executes
	 */

	public static void main(String[] args) {

		System.out.println("Program Started");
		/*String s = null;
		
		try // Exception
		{
		 
		System.out.println(s.length()); 
		
		}
		catch (Exception e) // Exception handles by catch so it will executes
		{
			System.out.println("Exception handled" );
			System.out.println(e.getMessage());
		}
		finally // Always executes 
		{
			System.out.println("Final block executes" );
		}
		*/
		
        String s = "Why";
		
		try // No Exception
		{
		 
		System.out.println(s.length()); 
		
		}
		catch (Exception e) // Catch will skip
		{
			System.out.println("Exception handled" );
			System.out.println(e.getMessage());
		}
		finally // Always executes 
		{
			System.out.println("Final block executes" );
		}
		
		
		
		System.out.println("Program finished");

	}

}
