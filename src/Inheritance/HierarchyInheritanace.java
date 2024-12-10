package Inheritance;

// One parent has many child classes 

class ParentA2
{
	 
	 void display(int a)
	 {
		 System.out.println(a);
	 }
}

class ChildB2 extends ParentA2
{
	
	 void show( int b)
	 {
		 System.out.println(b);
	 }
}

class ChildC2 extends ParentA2
{
	 
	 void print(int c)
	 {
		 System.out.println(c);
	 }
	
	
}

public class HierarchyInheritanace {

	public static void main(String[] args) {

          ChildB2 cb2 = new ChildB2();
          cb2.display(23);
          cb2.show(99);
          
          ChildC2 cc2 = new ChildC2();
          cc2.display(230);
          cc2.print(990);
          

	}

}
