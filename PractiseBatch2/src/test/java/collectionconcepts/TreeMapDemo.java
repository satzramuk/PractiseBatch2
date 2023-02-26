package collectionconcepts;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		
		TreeMap<String, String> places = new TreeMap<>();
		
		places.put("Thiruverambur", "Trichy");
		places.put("Chennai", "TamilNadu");
		places.put("New Delhi", "MP");
		//places.put(null, "MP");
		places.put("Calcutta", null);
		places.put("Kerala", null);

		
		System.out.println("Valuess are : "+places);

		
	}

}
