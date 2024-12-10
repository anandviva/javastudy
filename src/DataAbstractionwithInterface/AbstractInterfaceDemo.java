package DataAbstractionwithInterface;

interface Shape
{
	int length = 20; // By defaultfinal & static var but no need to enter
	int width =30;
	
	// In interface, all methods are public so no need to enter the public 
	
	void circle ();   // Abstract method so only signature so implementation
	
	default void rectangle() // need to put the default name before method bacuse if we don't put it detects public
	{
		System.out.println("this default method ");
	}
	static void triangle()
	{
		System.out.println("this static method ");
	}
	
}

public class AbstractInterfaceDemo implements Shape

{   // In class default is method if don't put any name before method. 
	
	public void circle() // here we are implementing the interface method so we use the same access modifier public 
	                     // No where in the interface we haven't implemented for this method here we should do implementation
	{
		System.out.println(length+width);
		
	}
	void square()
	{
		System.out.println(length*width);
	}

	public static void main(String[] args) {
	   
		/*
		
		// Scenario 1 - Creating the class object  and invoke the methods in class and class already implements the interaface so all we can call here
		AbstractInterfaceDemo ad = new AbstractInterfaceDemo();
		ad.circle();
		ad.rectangle();
		Shape.triangle(); // static method we need to call the interface name not class name
		ad.square(); // this method only belongs to class not interface
		
		*/
		

		// Scenario 2 - Creating the  object  variable for Intertface and invoke the methods in class
		
		Shape ad = new AbstractInterfaceDemo(); // created the obj var for interface abut instantitae the class object
		
		ad.circle();
		ad.rectangle();
		Shape.triangle();

	}

}
