package collectionconcepts;

import java.util.HashMap;

public class HashMapCompareDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		
		HashMap<Integer, String> map3 = new HashMap<>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		
		//On the basis of key-value: use equals method
		
		System.out.println(map1.equals(map2)); //True
		System.out.println("Map3 values are : "+map3);
		System.out.println("Compared value are :"+map1.equals(map3)); 

		
		
		
		
		
		
		
		
	}

}
