package OOPS_Concepts;

public class PolymorphismEx {
	
	/* Method Overloading we don't consider void or any return type. we will consider only param 
	 * Even the return is different and param same , this case will not be overloading
	 * 
	 * Param should be different the only it's overloading
	 * 
	 * 
	 */
	
	int a=10;
	int b=20;
	
	void sum()// --> Called definition. definition should be different
	{
		System.out.println(a+b); // Called implementation. it should be same/different
	}
	void sum(int x, int y) // same method name but passing the param 
	{
		System.out.println(x+y);
	}
	void sum(int x, double y) // same method name but passing different param
	{
		System.out.println(x+y);
	}
	void sum(double x, int y) // same method name but passing the same param but order param is different
	{
		System.out.println(x+y);
	}
	void sum(double x, int y, int z) // same method name but passing the same param but added one more param
	{
		System.out.println(x+y+z);
	}
	
	

	public static void main(String[] args) {
		
		PolymorphismEx pe = new PolymorphismEx();
		pe.sum();
		pe.sum(5, 5.5);
		pe.sum(6.5, 5);
		pe.sum(10.5, 6, 7);
		
		

	}

}
