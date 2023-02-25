package collectionconcepts;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {
	
	
	public static void main(String[] args) {
		
		TreeSet<Integer> tr = new TreeSet<>();
		tr.add(10);
		tr.add(1);
		tr.add(2);
		tr.add(9);
		tr.add(7);
		tr.add(3);
		
		
		System.out.println("Printing values are :"+tr);
		
		//first lowest number
		System.out.println("Printing values are :"+tr.first());
		
		//last highest number
		System.out.println("Printing values are :"+tr.last());
		
		//Findout lesser element
		System.out.println("Printing values are :"+tr.headSet(3));
		
		//findout greater element including that element
		System.out.println("Printing values are :"+tr.tailSet(9));
		
		//get the inbetween including starting value
		System.out.println("Printing values are :"+tr.subSet(1, 9));
		
		//Checks if element is available in natural sorting order if not returns null
		System.out.println("Printing values are :"+tr.comparator());
		
        //Iterating from descending order
		Iterator<Integer> desc = tr.descendingIterator();
		
		while(desc.hasNext()) {
			System.out.println("Descending values :"+desc.next());
		}
		



		
	}

}
