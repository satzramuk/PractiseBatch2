package collectionconcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	static String val = "";

	public static void main(String[] args) {

		//		List<String> ary = new ArrayList<>();
		//		      (or)
		//		ArrayList<E> aray = new ArrayList<>();
		//		


		ArrayList<String> cars = new ArrayList<>();

		// To create new list - add method 


		cars.add("BMW");
		cars.add("shift");
		cars.add("kia");
		cars.add("Rolls Royce");
		cars.add("Mahindra SUV");
		cars.add("Hyundai");
		cars.add("Hyundai");


		System.out.println("List of cars : "+cars);

		//Getting the particular element - get(int index)

		System.out.println("Getting particular element : "+cars.get(3));

		//Getting the index using particular element - indexOf()

		System.out.println("Getting the index based on value : "+cars.indexOf("Hyundai"));

		//Getting the lastindex of the element - lastIndexOf()

		System.out.println("Getting lastindex of element :"+cars.lastIndexOf("Hyundai"));


		//Adding the element into new arraylist element - addAll

		List<String> anotherlist = new ArrayList<>();

		anotherlist.addAll(cars);

		System.out.println("Adding the element into new arraylist element : "+anotherlist);

		//Removing all elements from the list - clear()
		anotherlist.clear();

		System.out.println("After removing element from list : "+anotherlist);

		//Removing specific element from list using index - remove(int index)
		System.out.println("After removing specific element from list : "+(cars.remove(6)));

		System.out.println(cars);

		//Removing specific element from list using object(i.e element name) - remove(Object e)

		System.out.println("After removing element from list using Object(i.e element) : "+cars.remove("kia"));
		System.out.println(cars);

		//We can add null element in Arraylist

		System.out.println("After adding null element : "+cars.add(null));
		System.out.println(cars);

		// Used to update the particular element based on index

		System.out.println("Updating the element : "+cars.set(3, "TUV"));
		System.out.println(cars);

		// Check if arraylist is empty 

		System.out.println(cars.isEmpty());

		System.out.println("******************************************************");

		//Iterate the array using for loop

		for(int i=0;i<cars.size();i++) {

			System.out.println("Iterating the list using For loop : "+cars.get(i));
		}

		System.out.println("******************************************************");

		//Iterate the array using for each loop

		for(String car:cars) {

			System.out.println("Iterating the list using for each loop : "+car);


		}

		System.out.println("******************************************************");

		ListIterator<String> listIt = cars.listIterator(); 

		while(listIt.hasNext()) {
			System.out.println("Using ListIterator : "+listIt.next());
		}


		System.out.println("******************************************************");

		Iterator<String> iter = cars.iterator();

		while(iter.hasNext()) {

			System.out.println("Using Iterator : "+iter.next());
		}


		System.out.println("******************************************************");

		ListIterator<String> listIt1 =null;
		List<String> emp = new ArrayList<String>();
		emp.add("Ravi");
		emp.add("Vijay");
		emp.add("Sonu");
		listIt1= emp.listIterator(); 

		while(listIt1.hasPrevious()) {

			System.out.println("Using List Iterator for backward traverse :"+listIt1.previous());
		}





	}

}
