package collectionconcepts;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		
		//Number of ways constructor can be used
		
		//HashSet<> hs = new HashSet<>(); // size -16, fill ratio is 0.75
		//HashSet<> hs = new HashSet<>(int initialSize);
		//HashSet<> hs = new HashSet<>(int initialSize, float fillratio);//size and fill ratio
		//HashSet<> hs = new HashSet<>(Collection c);
		
		
		
		HashSet<String> hashh = new HashSet<String>();
		hashh.add("A");
		hashh.add("D");
		hashh.add("E");
		hashh.add("F");
		hashh.add("A");
		hashh.add(null);
		hashh.add("G");
		hashh.add("C");
		HashSet<String> hashh1 = new HashSet<String>();
		hashh1.add("A");
		hashh1.add("D");
		
		//Does not maintain insertion order and Duplicate values are not allowed
		System.out.println("Printing the Hashset values :"+hashh);
		
		//Remove 
		System.out.println("Removing the element :"+hashh.remove("C"));
		System.out.println("Printing the Hashset values :"+hashh);

		//Contains
		System.out.println("Removing the element :"+hashh.contains("G"));
		
		//Contains all will check for entire collection
		System.out.println("Removing the element :"+hashh.containsAll(hashh1));
		


		//Iterating the values using Iterator
		
		Iterator<String> iteratorr = hashh.iterator();
		
		while(iteratorr.hasNext()) {
			System.out.println("Iterating the values : "+iteratorr.next());
		}
		
	}
	
	

}
