package collectionconcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> employMap = new HashMap<>();
		
		employMap.put(1, "Vijay");
		employMap.put(2, "Ranjith");
		employMap.put(4, "Ramesh");
		employMap.put(3, "Suresh");
		employMap.put(5, "Sudharshan");
		employMap.put(2, "Sathish");
		employMap.put(10, "Sathish");
		employMap.put(null, "Dhoni");
		employMap.put(null, "Kohli");
		employMap.put(12, null);
		employMap.put(14, null);
		
		

		// 1 Null key is acceptable, Multiple null values are allowed
		//Multiple Null keys are not allowed. Recent values must be updated
		
		//Insertion order is not maintained, Duplicate key is not allowed
		System.out.println("EmployMap :"+employMap);

		
		
		//To make an copy of existing map
		
		HashMap<Integer, String> duplicateemployMap = new HashMap<>();
		
		duplicateemployMap.putAll(employMap);
		
		System.out.println("DuplicateEmployMap :"+duplicateemployMap);
		
		
		//clear to delete the existing map
		//duplicateemployMap.clear();
		//System.out.println("DuplicateEmployMap :"+duplicateemployMap);
		
		
		//To remove one specific key we can use remove method
		duplicateemployMap.remove(2, "Sathish");
		System.out.println("After removing value :"+duplicateemployMap);

		
		//To check if a key is present or not in the Map
		
		
		System.out.println("Key is present:"+duplicateemployMap.containsKey(4));
		
		//To check if a value is present or not in the Map
		
		System.out.println("Value is present:"+duplicateemployMap.containsValue("Rameshh"));
		
		
		//Clone the Map
		System.out.println("Value is present:"+duplicateemployMap.clone());
		
		//Check if the Map is empty or not
		System.out.println("Map is empty or not:"+duplicateemployMap.isEmpty());
		
		//Fetch the sets of keys in the Map 
		
		System.out.println("Key Set is :"+duplicateemployMap.keySet());
		

		//Fetch the particular value
		System.out.println("Particular value is :"+duplicateemployMap.get(4));
		
		//Fetch all the values 
		System.out.println("Fetch all values are : "+duplicateemployMap.values());
		
		//Fetching both key & Value pairs
		System.out.println("Fetch both key and value pairs "+duplicateemployMap.entrySet());
		
		
		//Iterator:
		
		Iterator<Integer> it = duplicateemployMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			Integer key = it.next();
			String value = duplicateemployMap.get(key);
			
			System.out.println("Key = "+ key + "value = "+value);
			
			
			
		}
		
		System.out.println("**********EntrySet******************");
		
		//Iterator: over the keys: by using EntrySet
		
		Iterator<Entry<Integer, String>> it1 = duplicateemployMap.entrySet().iterator();
		while(it1.hasNext()) {
			
			Entry<Integer, String> entry = it1.next();
			
			System.out.println("key = "+entry.getKey() + " and value = " +entry.getValue());
			
		}

		
		
		
		
		
		
		
		
		

		

		
		
		
		
		
		
		

		
		
		



		

	}

}
