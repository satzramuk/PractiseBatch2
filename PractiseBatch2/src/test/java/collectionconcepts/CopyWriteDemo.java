package collectionconcepts;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyWriteDemo {

	public static void main(String[] args) {
		
		
		//CopyOnWriteArrayList - Used to avoid Thread Safety Issue
		
		
		CopyOnWriteArrayList<String> emplist = new CopyOnWriteArrayList<String>();
		emplist.add("Tom");
		emplist.add("Steve");
		emplist.add("Vijay");
		
		Iterator<String> it = emplist.iterator();
		
		while(it.hasNext()) {
			
			System.out.println("Iterating the list : "+it.next());
		}

		
		

	}

}
