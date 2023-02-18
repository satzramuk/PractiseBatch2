package collectionconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayLstDemo {

	public static void main(String[] args) {
		
		//1. sort and then equals
		
		ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
		
		ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
		
		ArrayList<String> l3 = new ArrayList<>(Arrays.asList("B", "A", "C", "D", "F"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		
		System.out.println("Checking both list equal or not :"+l1.equals(l2)); //False
		System.out.println("Checking both list equal or not :"+l1.equals(l3)); //true
		
		
		
		
		//2. comparing two list- findout the additional elements
		
		ArrayList<String> l4 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l5 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
		
		
		l4.removeAll(l5);
		l5.removeAll(l4);

		
		System.out.println("Finding additional elements l4 : "+l4);

		System.out.println("Finding additional elements l5 : "+l5);
		
		
		//3. find out the common elements
		
		ArrayList<String> l6 = new ArrayList<>(Arrays.asList("JAVA", "PYTHON", "RUBY", "C#", "JS"));
		ArrayList<String> l7 = new ArrayList<>(Arrays.asList("JAVA", "PYTHON", "RUBY", "C#", "PHP"));
		
		l6.retainAll(l7);
		
		System.out.println("Findout common elements  : "+l6);




		


		

	}

}
