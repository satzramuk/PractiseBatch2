package collectionconcepts;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListDemo {






	public void linkedListOperationsSample() {

		//Creation of Linked List

		LinkedList<Integer> linkedlst = new LinkedList<>();

		linkedlst.add(2);
		linkedlst.add(3);
		linkedlst.add(4);
		linkedlst.add(4);

		System.out.println("Complete LinkedList values are: "+linkedlst);


		//Add the element to the first position
		linkedlst.addFirst(1);
		System.out.println("After adding first value in LinkedList: "+linkedlst);

		//Add the element to the last position
		linkedlst.addLast(5);
		System.out.println("After adding last value in LinkedList: "+linkedlst);

//		//Get the first element
//		System.out.println("After getting first value in LinkedList: "+linkedlst.getFirst());
//		
//		//Get the value based on index
//		System.out.println("After getting value based on index in LinkedList: "+linkedlst.get(2));
//		
//        // Remove first and Remove last
//		System.out.println("After removing first value in LinkedList: "+linkedlst.removeFirst());
//		System.out.println("After removing last value in LinkedList: "+linkedlst.removeLast());
//		
//		//Remove the value based on index
//		System.out.println("After removing value based on index in LinkedList: "+linkedlst.remove(3));
//				
//        //poll deletes the first element
//		System.out.println("After deleting value in LinkedList: "+linkedlst.pollFirst());
		
//		System.out.println("After removing particular value in LinkedList: "+linkedlst.remove(3));
//		System.out.println("After removing particular value in LinkedList: "+linkedlst);
		
//      //poll deletes the first element
		System.out.println("After deleting last value based in LinkedList: "+linkedlst.pollLast());
		






















	}
	
	public void traditionalForloop() {
		LinkedList<Integer> linkedlst = new LinkedList<>();

		linkedlst.add(2);
		linkedlst.add(3);
		linkedlst.add(4);
		linkedlst.add(4);

		
		System.out.println("************For Loop******************");
		
		for(int index=0;index<linkedlst.size();index++) {
			System.out.println("Element in the list using For Loop are :"+linkedlst.get(index));
		}
		
	}


	public static void main(String[] args) {

		LinkedListDemo lst = new LinkedListDemo();
		lst.linkedListOperationsSample();
		//lst.traditionalForloop();
		
		Stack<String> stk = new Stack<>();
		//stk.


	}

}
