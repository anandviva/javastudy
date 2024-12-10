package OOPS_Concepts;

public class Encapsulation1 {
	
	/* Wrapping up data and methods into single unit (class)
	 * 
	 *  1) All variables should be private
	 *  2) For every varibale there should be two methods get and set
	 *  3) Varibales can be operated only through methods
	 *  
	 * 
	 * 
	 * 
	 */
	
	private int accno;
	private String name;
	private double salary;
	 String name2;
	 
	
	void setAccDetails(int accno, String name, double salary)
	{
		this.accno = accno;
		this.name = name;
		this.salary = salary;
	}
	void getAccDetails()
	{
	   System.out.println(accno);
	   System.out.println(name);
	   System.out.println(salary);
	   
	   
	}
	void nonencaps()
	{
		System.out.println(name2);
	}

	public static void main(String[] args) {
		
		Encapsulation1 e1 = new Encapsulation1 (); // Can't access the variable via Object 
		e1.setAccDetails(12343, "Ram", 4568.89); // can access only methods
		e1.getAccDetails();
		e1.name2 = "Tri"; // Non Private variable object can access directly
		e1.nonencaps(); // 

	}

}
