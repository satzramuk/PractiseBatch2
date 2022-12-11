package JavaVariableDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class LocalVariableDemo {
	
	
	int data=50;
	int bd;
	
	static int value =20;
	
	public void localDemoreference() {
		
		int a=10;
		int b=11;
		int sum=(a+b);
		System.out.println(a);
		
	}
	
	public static void display() {
		
		System.out.println("Its an Static way of calling");
	}
	
	public static void demo() {
		System.out.println("Static method");
		System.out.println(value);
	}
	
	

	public static void main(String[] args) {
		//Non-static way of calling
		LocalVariableDemo obj1 = new LocalVariableDemo();
		obj1.localDemoreference();
		//Static method 
		LocalVariableDemo.demo();
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		
		LocalVariableDemo.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String :");
		sc.next();
		

	}

}
