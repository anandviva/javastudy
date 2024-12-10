package Inheritance;

 class A 
 {
	 int a = 10;
	 void display()
	 {
		 System.out.println(a);
	 }
 }
 
 class B extends A 
 {
	 int b = 30;
	 void show()
	 {
		 System.out.println(b);
	 }
 }
 

public class SingleInheritance {

	public static void main(String[] args) {
		
          B bobj = new B(); // Using b calss object we can access the A class's var and methods
          System.out.println(bobj.a);
          bobj.display();
          
          System.out.println(bobj.b);
          bobj.show();
          
          
          
          
          
	}

}
