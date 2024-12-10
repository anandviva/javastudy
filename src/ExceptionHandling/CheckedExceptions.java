package ExceptionHandling;

public class CheckedExceptions {

	/* Checked Exceptions
	 * 
	 * It's compile time cexcetion Java compiler will  identify the exception and intimate us 
	 * 
	 * The exceptions which are identified by the Java compiler
 *    
 *       Ex: InteruptedException
 *           FileNotFoundException
 *           IOEcepetions  etc...
 *      Most frequently we are facing checked exection in automation\
 *      
 *      Checked exception can be handled two ways 
 *      
 *       Try catch block 
 *       Throws keyword
	 * 
	 *   Mostly we use throws keyword
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Program Started");
		
		 /* Try catch ex
		  * try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		*/
		
		Thread.sleep(6000);
		
		System.out.println("Program Finished");
		
		

	}

}
