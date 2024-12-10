package ThisStaticKeyword;

public class StaticMainMethod {
	
	/*  With in the package we can refer any calss directly
	 *  With in the project can refer any calss via enter the package
	 * 
	 * 
	 */

	public static void main(String[] args) {
		/*
		 * If we need access static method from another class need to put that class name before the var/method
		 * Classname.method() and Classname.var
		 * 
		 */
		StaticKeyword.m1();  
		System.out.println(StaticKeyword.a); 
		
		/*
		 * For non static method as usual create the object for that class name and refer here 
		 */
		
		StaticKeyword sk = new StaticKeyword (); 
		sk.m2();
		
		sk.m3();

	}

}
