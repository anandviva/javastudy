package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListandMethods {

	public static void main(String[] args) {
		
		//  Declaration for array list
		
		   // heterogenious arraylist 
		
		ArrayList mylist = new ArrayList();
		//List mylist1  = new ArrayList(); //Create the child class object for Parent interface obj ref var (mylist1)
		
		// heterogenious arraylist 
		
		//ArrayList <String> mylist = new ArrayList<String>();// This arraylist contains only string value
		//ArrayList <Integer> mylist = new ArrayList<Integer>(); // This arraylist contains only Integer value so need to write (Integer wrapper class) bcz primitive data type not allowd
		//ArrayList <Employee> mylist = new ArrayList<Employee>();// If any class we created already(employee) that we can call
		
		
		
		//Adding Data into the arraylist 
		
		//add() is the arraylist method of adding data into arraylist and data will add one after another orderly
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Hello");
		mylist.add("MOto");
		mylist.add(100); // can add duplicate
		mylist.add(null);
		mylist.add(6.7f);
		mylist.add(null);// can add multiple null
		
		
		// Size of the arraylist 
		
		System.out.println("Size of the arraylist:" + mylist.size());
		
		// Print the arraylist 
		
		System.out.println("Print the all value in arraylist:" + mylist);
		
		// Removing the element
		
		mylist.remove(3);// 3 is the index of array
		
		System.out.println ("After removing the 3rd index value" + mylist);
		
		// Insert the element into array
		
				mylist.add(3,"Nokia");// 3 is the index of array where I am going to insert the Nokia value
				
				System.out.println ("After Inserting the 3rd index value" + mylist);
				
	    //Access the specific element fom the array
				
                 mylist.get(3);//  Get is the method where we can get the specific element and we need to pass the index number. 3 is the index of array where I am going to get the Nokia value
				
				System.out.println ("Get the 3rd index value:" +  mylist.get(3));
				
				
		// Reading all the elements from the arraylist
			
				/*
				//1. Using normal for loop
				
				
				for (int i =0; i<mylist.size(); i++)
					
				{
					System.out.println (mylist.get(i));
				}
				*/
				
				//2. Using  for each loop
				
				
				for (Object x:mylist )
					
				{
					System.out.println (x);
				}
				
				//3. Using  iterator method which is only applicable for arraylist class and iterator method already there in arraylist class
				// Whenever we use Iterator we choose to use While loop
				// Iterator method will return iterated type of value
				
				
				Iterator it = mylist.iterator(); 
				
				// System.out.println (it.next()); --> It returns only first value only so that we use while loop
				while(it.hasNext()) // hasNext() method will check the value is avaialble or not
				{
					System.out.println (it.next()); // next() method is read the value if value available
					
					// If hasNext() method finds no value loop will end.
				}
				
				// Checking arraylist is empty or not
				
				System.out.println ("Is the array list is emapty: "+ mylist.isEmpty());
				
				// Remove the more than one value in any order
				
				 // For this we can't use the remove method insted need to create new arraylist where need to add the same data whih are in list1
				
				ArrayList mylist2 = new ArrayList();
				mylist2.add("Hello");
				mylist2.add("Nokia");
				
				mylist.removeAll(mylist2); // need to call the new arraylist
				
				System.out.println ("After removing the multiple elements: "+ mylist);
				
				// Clear the array elements
				// Once cleared we can't roll back
				
				mylist.clear();// Clear all the elements
				
				
				// Checking arraylist is empty or not
				
				System.out.println ("Is the array list is emapty: "+ mylist.isEmpty());
				
				
				
				
			
		
		
	}

}
