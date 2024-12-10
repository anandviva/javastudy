package Inheritance;

// Should not same class name with in the package 



class A1		
{
	 int a;
	 void display()
	 {
		 System.out.println(a);
	 }
}

class B1 extends A1 
{
	 int b;
	 void show()
	 {
		 System.out.println(b);
	 }
}

class C1 extends B1
{
	 int c =45;
	 void print()
	 {
		 System.out.println(c);
	 }
	
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {

		  C1 cobj = new C1();  // Using C1 calss object we can access the A1 and B1 class's var and methods
          
		  cobj.a=23;
		  cobj.b=34;
		  
          cobj.display();
          cobj.show();
          
          cobj.print();

	}

}
