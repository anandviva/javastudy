package OOPS_Concepts;

public class MethodsConstructors_AssignVar {
	
	/*
	 * How many ways we can refer the variable/ store the date into variables
	 *  1. Using Object Reference Variables
	 *  2. Using method we can pass value in param after that it will assign to the varibale
	 *  3. Using Constructor we can pass the value in constructor after that it will assign to the varibale
	 * 
	 */
	
	int stid;
	String sname;
	char grade;
	
	void printStudentData()
	{
		System.out.println(stid + "  " + sname+ " "+grade +" ");
	}
	
	void setStudentData(int a, String name, char g)
	{
		stid = a;
		sname=name;
		grade=g;
	}
	
	MethodsConstructors_AssignVar(int a, String name, char g)
	{
		stid = a;
		sname=name;
		grade=g;
		
	}
	
	
	
	
	
	public static void main(String[] args)
	
	{
		/*
		// 1. Using Object Reference Variables
		MethodsConstructors_AssignVar mcav = new MethodsConstructors_AssignVar ();
		mcav.stid = 7656;
		mcav.sname = "Arjun";
		mcav.grade = 'B';
		mcav.printStudentData();
		*/
		
		/*  2. Using method we can pass value in param after that it will assign to the varibale
		MethodsConstructors_AssignVar mcav = new MethodsConstructors_AssignVar ();
		mcav.setStudentData(8765, "Sachin", 'Z');
		mcav.printStudentData();
		*/
		
		// 3.Using Constructor we can pass the value in constructor after that it will assign to the varibale
		MethodsConstructors_AssignVar mcav = new MethodsConstructors_AssignVar (8745, "Sachin", 'Z');
		mcav.printStudentData();
	}

}
