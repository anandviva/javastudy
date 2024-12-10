package ThisStaticKeyword;

public class StaticKeyword {
	
	/* Static 
	 * 
	 * Static key word can be used for Variables and Methods
	 * 
	 * Static Var
	 * Non static var
	 * 
	 * Static method
	 * non static method
	 * 
	 *    1. Static method can access directly static varibale/method without creating any object 
	 *        Ex. main method is static, so it can aceess any static variable and method directly
	 *        
	 *    2. Static method can access the non static stuff through object 
	 *        Ex.  Need to create the object for non static variable/method to access from static method
	 *        
	 *    3. Non static method can everything (Static/non static methods/variables) directly 
	 *    
	 * 
	 * 
	 * 
	 */

	
	static int a =2;
	       int b =4;
	       
	       
     static void m1()  // Static method
     {
    	 System.out.println("This is static method");
     }
       
     void m2()  // non static method
     {
    	 System.out.println("This is non -static method");
     }
     
     void m3() // non static method so  Non static method can everything (Static/non static methods/variables) directly
     {
    	 System.out.println(a);  // static var
    	 System.out.println(b);  // non static var
    	 m1();  //static method
    	 m2();   // non stattic method
     }
	       
    /*
	public static void main(String[] args) {
		
		m1(); //main method is static, so it can access any static method directly
		System.out.println(a); //main method is static, so it can access any static method directly
		
		StaticKeyword sk = new StaticKeyword (); // Need to create the object for non static variable/method to access from static method
		sk.m2();
		
		sk.m3();
		}
		
		*/
		
		
	


}
