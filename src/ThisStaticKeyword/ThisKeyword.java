package ThisStaticKeyword;

public class ThisKeyword {
	
	/* This Keyword is differentiate Class varibales and local vriables 
	 * 
	 * This keyword always represents the class variables
	 * 
	 * Two types of variables
	 * 
	 *    1. Class variables/object variables --> Can access the entire class
	 *    2. Local variables can access the particular method / if the var creted in main method  we can access only the main method
	 * 
	 *  Java doesn't have the global variable
	 * 
	 */
	
	   int x,y; //Class variable/Instance variable
	   
	  /* ThisKeyword(int x, int y) // Constructor method
	   {
		   this.x=x;
		   this.y=y;
	   }
	   */
	   void setData(int x, int y)
	   {
		   this.x=x;
		   this.y=y;
	   }
	   void display()
	   {
		   System.out.println(x+y);
	   }
	   
	   
	   
	   

	public static void main(String[] args) {
		
		//ThisKeyword tk = new ThisKeyword(12,34);
		
		ThisKeyword tk = new ThisKeyword();
		tk.setData(67,89);
		tk.display();

	}

}
