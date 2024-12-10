package OOPS_Concepts;

public class ConstructorAndTypes {

	/* Difference b/w constructor and Methods
	 * 
	 * Method :
	 *   
	 *   1. Method name can be anything
	 *   2. Method name may/may not be return vale
	 *   3. Method doesn't return value specify with Void
	 *   4. Method can take parameters and arguments
	 *   5. We have to invoke/call the method explicitly thru Object
	 *   6. Used for specify the logic
	 *   
	 *  Constructor :
	 *  
	 *    1. Constructor name should be same as the class name
	 *    2. Constuctor doesn't return the return value (not even void)
	 *    3. No need to sepcify void
	 *    4. Method can take parameters and arguments
	 *    5. Constructor automatically invoked at the time of creating Object
	 *    6. Only to initialize the variable
	 *    
	 *    
	 *    Constructor Types 
	 *    
	 *    Default constructor 
	 *    Parameterized constructor
	 * 
	 */
	
	
	   int x,y;
	   
	  // We can create n number of constructor 
	   
	   ConstructorAndTypes()
	   {
		  x=100;
		  y=50;
	   }
	   
	   ConstructorAndTypes(int a,int b)
	   {
		   x=a;
		   y=b;
	   }
	   
	   
	   void sum()
	   {
		   System.out.println(x+y);
	   }
	   
	

	public static void main(String[] args) {
		
		// It call the default constructor because we don't pass the param 
		ConstructorAndTypes ct = new ConstructorAndTypes();
		ct.sum(); 
		
		/* One object one only call the constructor if we  need to call the constrctor again for different action 
		 need to create new constructor*/
		
		// It call the parametrized constructor because we passed the param 
		ConstructorAndTypes ct1 = new ConstructorAndTypes(23,24);
		ct1.sum();
	}
	
}




	