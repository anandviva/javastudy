package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEx {
	
	
	/*  
	/*  HashSet is an class which implemented the Set interface
	 * 
	 * 
	 *  1) Heterogenious data - Allowed
	 *  2) Insertion order  - Not Preserved (Index is not supported)
	 *  3) Duplicate elements - Not Allowed
	 *  4) Multiple nulls  - Not Allowed (Only single null)
	 *  
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		
		//Declaration
		 HashSet myset = new HashSet();
		
		//Declaration from the parent interface
		
		//Set smy = new HashSet();
		
		
		//HashSet<Integer> myset = new HashSet <Integer>();// for Heterogenious value Integer
		 
		// Adding elements into the Hashlist
		 
		    myset.add(100);
			myset.add(10.5);
			myset.add("Hello");
			myset.add("MOto");
			myset.add(100); //Can add the duplicate value but runtime the duplicate value will be  removed
			myset.add(null);
			myset.add(6.7f);
			myset.add(null);// Can add the duplicate null but runtime the duplicate value will be  removed
			
			//Printing the has hashset
			
			System.out.println(myset); // The value we get [null, 6.7, 100, Hello, 10.5, MOto] Duplicated got removed and Different order
			// Not preserved the index order
			
			// Size of the set 
			
			System.out.println("Size of the set :"+ myset.size());
			
			// Removing the element 
			
			System.out.println(myset.remove(6.7f)); // Can remove the element but refering only value as we don't follow the index here
			
			
		    // Insering the element is not possible bcz, Insertion happens only in indexing order not in random order
			// Specific the element is not possible bcz, sepcific elemts we get method ehich requires the index no.
		     
			
			//If we want to specific any element we sould convert hashset into arraylist
			
			  ArrayList al = new ArrayList(myset);
			  
			  System.out.println(al);
			  System.out.println(al.get(4));
			  
			  
			  //Read all the element we can use for each loop and Interator only normal for loop[ can't use because it requires index no
			  
			  for(Object x:myset)
			  {
				  System.out.println(x);
			  }
			  
			  
			  Iterator <Object> it = myset. iterator();
			  // System.out.println (it.next()); --> It returns only first value only so that we use while loop
				while(it.hasNext()) // hasNext() method will check the value is avaialble or not
				{
					System.out.println (it.next()); // next() method is read the value if value available
					
					// If hasNext() method finds no value loop will end.
				}
				
				
				// Clear all the elements
                 myset.clear();
				
				
				// Checking arraylist is empty or not
				
				System.out.println ("Is the array list is emapty: "+ myset.isEmpty());
				
				
			  
			  
			  
			  
			
	}

}
