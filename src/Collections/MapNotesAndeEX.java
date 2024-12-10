package Collections;

import java.util.Map;
import java.util.HashMap;

public class MapNotesAndeEX {
	
	/*  HashMap is an class which implemented the Map interface
	 * 
	 *  1) Data can be stored in the form Key and values pairs
	 *  2) Key is always unique (No duplicate), but we can have the Duplicate values
	 *  3) Insertion order is not preserved (No index order)	 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		// 1. Declaration
		
		//we can user hetrogenius key value
		
		//HashMap hm = new HashMap();
		
		//we can user defined key value. Here Key is Int and value is string
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//Adding pairs (Key and value)
		
		hm.put(1001, "Ram");
		hm.put(1002, "Mohan");
		hm.put(1003, "Varun");
		hm.put(1004, "Tharun");
		hm.put(1005, "Hendry");
		hm.put(1006, "Ram");//Value can be duplicated but key shouldn't
		hm.put(1002, "Hendry"); // Duplicate ket enters new value will update to key so 1002 will Hendry
		
        System.out.println(hm); // {1001=Ram, 1002=Hendry, 1003=Varun, 1004=Tharun, 1005=Hendry, 1006=Ram}
           // Some time will get the same order sometimw won't bcz it doesn't follow the index order
        
        
        // Size of the map 
        
        System.out.println(hm.size());
        
       // Removing pairs 
        hm.remove(1003);
        
        System.out.println(hm);// should enter the key {1001=Ram, 1002=Hendry, 1004=Tharun, 1005=Hendry, 1006=Ram}
        
        //Access the specific value 
        
        System.out.println(hm.get(1006));
        
        //Get the all the key from hashmap
        
        System.out.println(hm.keySet()); //[1001, 1002, 1004, 1005, 1006]
        
      //Get the all the values from hashmap
        
        System.out.println(hm.values());  //[1001, 1002, 1004, 1005, 1006]
        
        //Get all the pairs in set 
        
        System.out.println(hm.entrySet()); // [1001=Ram, 1002=Hendry, 1004=Tharun, 1005=Hendry, 1006=Ram]
        
        //Reading data from the hashmap
        
            // For each loop
        
        for (int h :hm.keySet())
        {
        	System.out.println (h + "  " + hm.get(h)); // h returns key and get method ready all the value
        }
        
        
	}

}
