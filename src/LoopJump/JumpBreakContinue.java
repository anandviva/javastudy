package LoopJump;

public class JumpBreakContinue {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++)
		{
			if (i==5)
			{
				break;  //After break shouldn't put any statement and break will kick out from the for loop
			}
			System.out.println(i); // it will print only 1to 4 numbers only. Once i =5 if loop will be true so loop will be breaked
		}
		for (int i=1; i<=10; i++)
		{
			if (i==5)
			{
				continue;  //After break shouldn't put any statement and break will kick out from the for loop
			}
			System.out.println(i); // it will print 1 to 10 but except. Once i =5 if loop will be true so loop will execute the continue and continue will directly go to  for loopIncrement rather printing i value
		}
		
		

	}

}




