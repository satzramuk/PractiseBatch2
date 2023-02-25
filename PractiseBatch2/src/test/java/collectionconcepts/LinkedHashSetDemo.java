package collectionconcepts;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		
		Set<Object> linkedhass= new LinkedHashSet<Object>();
		
		linkedhass.add(1);
		linkedhass.add("A");
		linkedhass.add("B");
		linkedhass.add("C");
		linkedhass.add("10");
		linkedhass.add("10");
		
		//Printing the values
		System.out.println("Printing the values are :"+linkedhass);
		//Size
		System.out.println("Printing the values are :"+linkedhass.size());
		//IsEmpty
		System.out.println("Printing the values are :"+linkedhass.isEmpty());
		
		System.out.println("Printing the values are :"+linkedhass.toString());
		
		

		

		
		

		
	}

}
