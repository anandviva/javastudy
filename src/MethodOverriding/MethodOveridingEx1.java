package MethodOverriding;

/*  Difference between method overloading and over riding
 * 
 *   Method Overriding 
 *   
 *    1. Possible only in multiple class (Inheritance)
 *    2. We should't change the signature (Definition) of the method but body can be chnaged
 *    3. Mthod name should be same
 *    4. Belongs to inheritance
 *    
 *   For method overiding Definition of the method (Method name and param) should be similar for parent and child class 
 *   Implemenation (Method of body) can be varied
 *   
 *   Method Overloading
 *   
 *    1. Possible only in single and multiple class (Inheritance)
 *    2. We should change the signature (Param) of the method and  body can be changed
 *    3. Method name should be same
 *    4. Belongs to polymorphism
 *   
 *  Method overloading also can achieve pareant class to child class but param should be different
 * 
 * 
 * 
 *  
 * 
 * 
 */

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
	
}
class xyz extends ABC
{
	void m1(int a) // Same method name and param we are using here bcz of inhereitance and we are overriding the method from the parent class
	{
		System.out.println(a*a); // Implemation can vary for overriding
	}
	void m2(int a, int b) // Same method name we are using but param different so it's method overloading
	{
		System.out.println(a+b);
	}
	
	
}



public class MethodOveridingEx1 {

	public static void main(String[] args) {
		
		xyz moe = new xyz(); // Creating the Object for child class and acess the var/method of parent class
		moe.m1(23); //method overiding from child class
		moe.m2(6,7); //method overloading from the child class
		moe.m2(10); // method overiding from child class
	}

}
