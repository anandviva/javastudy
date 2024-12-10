package OOPS_Concepts;

public class PolymorphismEx2Constructor {
	
	
	double width, height, length;
	
	PolymorphismEx2Constructor()
	{
		width=height=length=0;
	
	}
	PolymorphismEx2Constructor(double a, double b, double c)
	{
		width=c;
	    height=b;
	    length=c;
	
	}
	PolymorphismEx2Constructor(double len)
	{
		width=height=length=len;
	}
	double volume()
	{
		return width*height*length;
	}

	public static void main(String[] args) {

		// one object creation initiate one constructor only
		//PolymorphismEx2Constructor pe2 = new PolymorphismEx2Constructor();
		// PolymorphismEx2Constructor pe2 = new PolymorphismEx2Constructor(5.0);
		PolymorphismEx2Constructor pe2 = new PolymorphismEx2Constructor(5.0);
		System.out.println(pe2.volume());
		
		

	}

}
