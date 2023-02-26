package collectionconcepts;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, Integer> lks = new LinkedHashMap<>();
		lks.put("Ranjith", 1);
		lks.put("Sathish", 2);
		lks.put("Suresh", 4);
		lks.put("Vijay", 3);
		
		System.out.println("Getting values : "+lks);
		
		System.out.println("Getting values : "+lks.get("Suresh"));
		
		
		
		

	}

}
